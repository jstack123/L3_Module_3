package interfaces;

public class BackwardsString implements TextFunkifier{

	@Override
	public String funkifyText(String s2) {
		String phrase = s2;
		for (int i = 0; i < s2.length(); i++) {
			System.out.println(phrase.charAt(s2.length()-1));
		}
		return phrase;
	}

}
