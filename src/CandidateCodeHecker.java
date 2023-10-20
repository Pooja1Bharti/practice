/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCodeHecker {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int testCase =sc.nextInt();
      while(testCase >0){
         int n=sc.nextInt();
         int arr[]=new int[n];
         int temp=0;
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         for( int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){
            	System.out.println(i+".."+j);
               if(arr[i]==arr[j]){
               temp++;

            }
            }
            

         }
         testCase--;
         System.out.println(temp*temp);
      }
     
	//Write code here

   }
}
