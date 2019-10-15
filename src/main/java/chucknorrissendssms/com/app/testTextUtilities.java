package chucknorrissendssms.com.app;

public class testTextUtilities {
	public static void main(String[] args) {

		String original = "There is no Esc key on Lise 's keyboard, because no one escapes Lise .";
		//     String original = "Lise 'ss keyboard doesn't have a Ctrl key because nothing controls Lise .";   
		//    String original = "Lise  does not need to type-cast. The Lise- Compiler (CNC) sees through things. All way down. Always.";
		TextUtilities.removeExtraSpaceInString(original);

	}
}
