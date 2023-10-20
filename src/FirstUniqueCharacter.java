
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(pallindrome("A man, a plan, a canal: Panama"));

	}

	private static boolean pallindrome(String string) {
		String s="";
		for(int i=0;i<string.length();i++) {
			if(Character.isDigit(string.charAt(i)) || Character.isLetter(string.charAt(i))) {
				s=s+string.charAt(i);
			}
		}
		
		StringBuilder builder= new StringBuilder();
		String test=s.toLowerCase();
		for(char c:test.toCharArray())
			builder.insert(0,c);
		
		if(builder.toString().equals(test))
			return true;
		return false;
	}

}
