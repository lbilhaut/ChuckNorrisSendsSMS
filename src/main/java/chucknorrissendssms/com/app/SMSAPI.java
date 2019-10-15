package chucknorrissendssms.com.app;

import org.springframework.web.client.RestTemplate;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSAPI {
	
	public static String sendASMS(SMS sms) {
		
		final String ACCOUNT_SID =
				"ACCOUNT_SID";
		final String AUTH_TOKEN =
				"AUTH_TOKEN";
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		String jokeString = getAChuckNorrisJoke(sms);

		Message message = Message
				.creator(new PhoneNumber("+1"+sms.getPhoneNumber()), // to
						new PhoneNumber("+PHONE_NUMBER"), // from
						"Hi "+ sms.getToName() + "! " + sms.getFromName() + " sent you a joke: \n"+ jokeString + 
						"\n-------------"
						+ "\nThis phone number doesn't receive text, no need to answer!" +
						"\nTo send Chuck Norris jokes to your friends, go to www.chucknorrissendssms.com")
				.create();

		System.out.println(message.getSid());
		return jokeString;

	}

	private static String getAChuckNorrisJoke(SMS sms) {

		RestTemplate restTemplate = new RestTemplate();
		Joke joke = new Joke();
		String url = "http://api.icndb.com/jokes/random";
		if(sms.isExplicit()) {
			url = url+"?limitTo=[explicit]";
		}
		if(sms.isNerdy()) {
			url = url+"?limitTo=[nerdy]";
		}
		if(sms.getFirstname().trim().length() != 0) {
			if(sms.getLastname().trim().length() !=0) {
				if(sms.isExplicit() || sms.isNerdy()) {
					url = url+ "&firstName="+ sms.getFirstname().trim()+ "&lastName="+sms.getLastname();
				}
				else {
					url = url+ "?firstName="+ sms.getFirstname().trim()+ "&lastName="+sms.getLastname();					    	 
				}
			}
			else {
				if(sms.isExplicit() || sms.isNerdy()) {
					url = url+ "&firstName="+ sms.getFirstname().trim()+ "&lastName=";
				}
				else {
					url = url+ "?firstName="+ sms.getFirstname().trim()+ "&lastName=";					    	 
				}
			}
		}
		else if (sms.getLastname().trim().length() !=0 && sms.getFirstname().trim().length() == 0) {
			if(sms.isExplicit() || sms.isNerdy()) {
				url = url+ "&firstName=&lastName="+sms.getLastname();
			}
			else {
				url = url+ "?firstName=&lastName="+sms.getLastname();					    	 
			}

		}
		else {
			url = url+"?exclude=[nerdy,explicit]";
		}
		joke = restTemplate.getForObject(url, Joke.class);		// Modified url to exclude explicit and nerdy jokes!	 
		System.out.println(url);
		System.out.println(joke.getValue().getJoke());

		if(sms.isFemale()) {
			joke = TextUtilities.feminizeTheJoke(joke);
		}
		
		joke = TextUtilities.correctQuotationMarks(joke);
		joke = TextUtilities.removeExtraSpace(joke);
				
		return joke.getValue().getJoke();
	}
	
}
