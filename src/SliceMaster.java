import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SliceMaster {

	public static void main(String[] args) {
		String s="a";
	long n=1000000000000l;
    long count=0;
    long num= n;
        StringBuilder builder= new StringBuilder(s);
    
    while(builder.length() < num){
        builder.append(s);
    }
 String newString=   builder.substring(0,(int)num);
 System.out.println(""+newString);
    for(int i=0;i<newString.length();i++){
        if(newString.charAt(i) == 'a'){
            count++;
        }
    }
    System.out.println(count);
		

		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shayam");
		list.add("seema");
		list.add("Ankit");
		list.add("Arnav");
		String so = "rahuhkl";
		list.stream().max(Comparator.comparingInt(String::length)).orElse(null);

		list.stream().map(x -> x.toLowerCase()).filter(c -> c.contains("e")).count();
		Character result = s.chars().mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(c -> c.getValue() > 1).map(b -> b.getKey()).findFirst().get();

		List<String> arrList = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

		List<Double> intLuist = new ArrayList<>(Arrays.asList(3.0, 7.8, 32.6, 9.0, 1.0));

		List<Integer> inLuist = new ArrayList<>(Arrays.asList(3, 7, 32, 9, 1));
		List<Integer> inLuists = inLuist.stream().map(x -> x * x).collect(Collectors.toList());

		IntSummaryStatistics max = intLuist.stream().mapToInt(x -> x.intValue()).summaryStatistics();
		max.getAverage();
		System.out.println("Hello, World!" + arrList + " " + result + " " + inLuists);

	}
}