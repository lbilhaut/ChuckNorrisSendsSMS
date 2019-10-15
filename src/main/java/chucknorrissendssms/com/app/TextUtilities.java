package chucknorrissendssms.com.app;

public class TextUtilities {
	
	public static Joke feminizeTheJoke(Joke joke) {
		Value value = joke.getValue();
		String jokeString = value.getJoke();
		String femizedString = "";
		femizedString = jokeString.replace(" he ", " she ");
		femizedString = femizedString.replace("He ", "She ");
		femizedString = femizedString.replace(" He ", " She ");
		femizedString = femizedString.replace(",he ", ",she ");	
		femizedString = femizedString.replace(" his ", " her ");
		femizedString = femizedString.replace("His ", "Her ");
		femizedString = femizedString.replace(",his ", ",her ");
		femizedString = femizedString.replace(" him ", " her ");
		femizedString = femizedString.replace("himself", "herself");
		femizedString = femizedString.replace(" man ", " woman ");
		femizedString = femizedString.replace(" men ", " women ");
		System.out.println(femizedString);
		value.setJoke(femizedString);
		System.out.println("Feminized joke is: " + joke.getValue().getJoke());
		return joke;
	}
	
	public static Joke correctQuotationMarks(Joke joke) {
		Value value = joke.getValue();
		String jokeString = value.getJoke();
		String correctQuotes = "";
		correctQuotes = jokeString.replace("&quot;", "\"");
		value.setJoke(correctQuotes);
		System.out.println("Corrected joke is: " + joke.getValue().getJoke());	
		return joke;
	}
	
	public static Joke removeExtraSpace(Joke joke) {
		Value value = joke.getValue();
		String jokeString = value.getJoke();
		String withoutExtraSpace = "";
		withoutExtraSpace = jokeString.replaceAll(" 's", "'s");
		withoutExtraSpace = withoutExtraSpace.replaceAll("'ss", "'s");
		withoutExtraSpace = withoutExtraSpace.replaceAll("[?]s", "'s");
		withoutExtraSpace = withoutExtraSpace.replaceAll(" [.]", ".");
		withoutExtraSpace = withoutExtraSpace.replaceAll(" ,", ",");
		withoutExtraSpace = withoutExtraSpace.replaceAll("( )+", " ");
		withoutExtraSpace = withoutExtraSpace.replaceAll("- ", "-");
		value.setJoke(withoutExtraSpace);
		System.out.println("Corrected joke is: " + joke.getValue().getJoke());	
		return joke;
	}

	// Used for testing
	public static String removeExtraSpaceInString(String string) {
		String withoutExtraSpace = "";
		withoutExtraSpace = string.replaceAll(" 's", "'s");
		System.out.println("1) Corrected joke is: " + withoutExtraSpace);	
		withoutExtraSpace = withoutExtraSpace.replaceAll("'ss", "'s");
		withoutExtraSpace = withoutExtraSpace.replaceAll("[?]s", "'s");
		System.out.println("2) Corrected joke is: " + withoutExtraSpace);	
		withoutExtraSpace = withoutExtraSpace.replaceAll(" [.]", ".");
		System.out.println("3) Corrected joke is: " + withoutExtraSpace);	
		withoutExtraSpace = withoutExtraSpace.replaceAll(" ,", ",");
		System.out.println("4) Corrected joke is: " + withoutExtraSpace);	
		withoutExtraSpace = withoutExtraSpace.replaceAll("  ", " ");
		withoutExtraSpace = withoutExtraSpace.replaceAll("- ", "-");
		System.out.println("5) Corrected joke is: " + withoutExtraSpace);	
		return withoutExtraSpace;
	}
	
}
