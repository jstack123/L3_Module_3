package interfaces;

public class MixedCapsString extends SpecialString{
	public MixedCapsString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s2) {
		String phrase = "";
		boolean isEven;
		
		for (int i = 0; i < s2.length(); i++) {
			if (i%2==0) {
				isEven = true;
				phrase += Character.toLowerCase(s2.charAt(i));
			} else {
				isEven = false;
				phrase += Character.toUpperCase(s2.charAt(i));
			}
			
			System.out.println(phrase);
		}
		return phrase;
	}
}
