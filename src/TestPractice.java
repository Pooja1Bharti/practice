import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TestPractice {

	public static void main(String[] args) {

		// int nums[][] = {{ 1,2,3},{4,5,6},{7,8,9}};
		// rotateImage(nums );

		String st[] = {"Flower","Flow","Fligh"};
		//String str[]= {"flower","flow","flet"};
	//int st=	str.length;

		System.out.println(isAnagram(st));

	}

	public static String isAnagram(String strs[] ) {
		String prefix= strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            
        }
       
            return prefix;
		
	}

}
