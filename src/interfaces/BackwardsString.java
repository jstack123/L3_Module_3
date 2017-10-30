package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		String phrase = "";
		for (int i = s2.length()-1; i >= 0; i--) {
			phrase+=s2.charAt(i);
		}
		
		return phrase;
	}

}
