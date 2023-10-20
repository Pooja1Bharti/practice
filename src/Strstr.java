
public class Strstr {
	public static void main(String args[]) {
		String needle="aa";
		String haystack="aaaa";
		if(needle.isEmpty())
			System.out.println("0");
		int n= needle.length();
		int m= haystack.length();
		if(m<n)
			System.out.println("-1");
		for(int i=0;i<m-n;i++) {
			int j;
			for(j=0;j<n;j++)
			{
				if(haystack.charAt(i+j)!=needle.charAt(j))
					break;
			}
			if(j==n)
				System.out.println(i);
		}
	}

}
