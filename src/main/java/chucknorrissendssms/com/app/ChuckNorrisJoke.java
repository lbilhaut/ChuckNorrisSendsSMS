package chucknorrissendssms.com.app;

import org.springframework.web.client.RestTemplate;

public class ChuckNorrisJoke {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		Joke joke = restTemplate.getForObject("http://api.icndb.com/jokes/random?firstName=Lise&lastName=", Joke.class);
		System.out.println("Original joke: " + joke.getValue().getJoke());
		
		TextUtilities.feminizeTheJoke(joke);
		TextUtilities.correctQuotationMarks(joke);
		TextUtilities.removeExtraSpace(joke);
		
	}

//	private static void correctQuotationMarks(Joke joke) {
//		Value value = joke.getValue();
//		String jokeString = value.getJoke();
//		String correctQuotes = "";
//		correctQuotes = jokeString.replace("&quot;", "\"");
//		value.setJoke(correctQuotes);
//		System.out.println("Corrected joke is: " + joke.getValue().getJoke());		
//	}
//
//	private static void feminizeTheJoke(Joke joke) {
//		Value value = joke.getValue();
//		String jokeString = value.getJoke();
//		String femizedString = "";
//		femizedString = jokeString.replace(" he ", " she ");
//		femizedString = femizedString.replace("He ", "She ");
//		femizedString = femizedString.replace(" He ", " She ");
//		femizedString = femizedString.replace(",he ", ",she ");
//		femizedString = femizedString.replace(" his ", " her ");
//		femizedString = femizedString.replace("His ", "Her ");
//		femizedString = femizedString.replace(",his ", ",her ");
//		value.setJoke(femizedString);
//		System.out.println("Feminized joke is: " + joke.getValue().getJoke());
//	}

}
