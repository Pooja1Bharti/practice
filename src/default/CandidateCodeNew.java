package com.example;
/* Read input from STDIN. Print your output to STDOUT*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CandidateCodeNew {
   public static void main(String args[] ) throws Exception {

	//Write code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      List<Integer> list = new ArrayList<Integer>();
      while (n > 0) {
        list.add(sc.nextInt());
        n--;
      }
      Map<Integer, Long> counted =
          list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      long ans = 0;
      for (Map.Entry<Integer, Long> entry : counted.entrySet()) {
        long val = entry.getValue();
        ans += (val - 1) * val;
      }
      System.out.println(ans);
      t--;
    }

   }
}
