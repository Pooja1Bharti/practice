
public class MYClass {

	
	public static void main(String[] args) {
		MYClass classs= new MYClass();
		
		String st[]= {"alahabad","aerospace","antartica"};
		for(int i=0;i<st.length-1;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].compareTo(st[j])>0) {
					String temp= st[i];
					st[i]=st[j];
					st[j]= temp;
				}
			}
		}
		//System.out.println(classs.val);
				
	}

}
