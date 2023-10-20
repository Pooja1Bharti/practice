import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestNew {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        Object[] arr= a.toArray();
        int end=arr.length-1;
        rotate(arr,0,end);
        rotate(arr,0,end-d);
        rotate(arr,end-d+1,end);
        System.out.println(Arrays.asList(arr));
        return (List<Integer> )(Object)Arrays.asList(arr);
        

        }

	private static void rotate(Object[] list, int start, int end) {
		 while(start<end){
	          int temp=  (int) list[start];
	          list[start]=list[end];
	          list[end]=temp;
	          start++;
	          end--;
	          
	        }
		
	}

	public static final void main(String[] args) {
		TestNew.rotLeft(Arrays.asList(1, 2, 3, 4, 5), 4);
	

		List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah",
				"allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle",
				"annebelle");

		List<Integer> list = new ArrayList<Integer>();
		/*
		 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
		 * list.add(7); list.add(8); list.add(9); list.add(10);
		 */
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 10 20 20 10 10 30 50 10 20
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(20);
		int count = 0;

		long sum = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).values().stream()
				.mapToLong(x -> x / 2).sum();
		System.out.println(sum);

		
		 list.stream().collect(Collectors.groupingBy(Function.identity(),
		  LinkedHashMap:: new,Collectors.counting())).forEach((x,y)->{
			  System.out.println(x+""+y);
		  });
		 
		 

		String check = plusMult(list);
		System.out.println(check);
		List<String> commands = new ArrayList<String>();
		commands.add("G");
		commands.add("LL");
		commands.add("RGRG");
		commands.add("LRLR");
		List<String> findCircle = doesCircleExist(commands);
		System.out.println(findCircle);

		names.stream().filter(Filter.nameStartingWithPrefix("aa")).map(Mapper.getDistinctCharactersCount())
				.forEachOrdered(System.out::println);

		String str = "Java Articles are Awesome z";
		String arr[] = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String buil : arr) {
			builder.append(buil);
		}
		String stri = builder.toString();
		stri.chars().mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(st -> st.getValue() > 1).forEach(System.out::println);

		List<Emploee> empList = new ArrayList<Emploee>();
		empList.add(new Emploee(7, "dwdf", 23, "SALES"));
		empList.add(new Emploee(3, "dwe", 400, "FINANCE"));
		empList.add(new Emploee(24, "dwfefe", 899, "FINANCE"));
		empList.add(new Emploee(2, "test", 100, "SALES"));
		empList.stream().collect(Collectors.groupingBy(Emploee::getDepartment));
		empList.stream().filter(x -> x.getDepartment().contains("SALES") && x.getSalary() >= 100)
				.collect(Collectors.toList());
		empList.stream().max(Comparator.comparing(Emploee::getSalary)).get();

		empList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.collectingAndThen(
				Collectors.maxBy(Comparator.comparing(Emploee::getSalary)), Optional -> Optional.orElse(null))));

		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(5, 1, 9, 2, 1));

		lists.stream().reduce((x, y) -> x + y).get();
		List<Integer> listarr = lists.stream().distinct().collect(Collectors.toList());
		List<String> listSt = new ArrayList<>();
		listSt.add("RAM");
		listSt.add("SHYAM");
		listSt.add("RAM");
		List<List<Integer>> listofList = new ArrayList<List<Integer>>();

		String pallindrome = "Madam";

		String g = pallindrome.toLowerCase();
		int strat = 0;
		int len = g.length() - 1;
		while (strat < len) {
			if (g.charAt(strat) != g.charAt(len)) {
				System.out.println("not a pallindrome");
			}
			strat++;
			len--;
		}

	}

	/*
	 * public static void solution(int N) { int maxNumber = Integer.MAX_VALUE; int
	 * sum = 0; int newVal = N; while (newVal > 0) { int temp = newVal % 10; sum =
	 * sum + temp; newVal = newVal / 10; } int newSum = 0; for (int i = N + 1; i <
	 * maxNumber; i++) { int k = i; while (k > 0) { int temp = k % 10; newSum =
	 * newSum + temp; k = k / 10; } System.out.println(i); if (newSum > sum &&
	 * newSum >= sum * 2) { return i; } else { newSum = 0; } }
	 * 
	 * }
	 * 
	 * return -1; }
	 */

//	}

	public static List<String> doesCircleExist(List<String> commands) {
		List<String> list = new ArrayList<>();

		for (String command : commands) {
			if (isLoop(command)) {
				list.add("NO");
			} else {
				list.add("YES");
			}
		}

		return list;
	}

	public static boolean isLoop(String command) {
		int n = command.length();

		// Check if the string contains L or R
		if (command.contains("L") || command.contains("R")) {
			return false;
		}

		// Check if the string length is even
		if (n % 2 != 0) {
			return false;
		}

		// Check if the string is a repeated pattern of "LR"
		String repeatedPattern = "LR".repeat(n / 2);
		return command.equals(repeatedPattern);
	}

	public static String plusMult(List<Integer> A) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			if (i % 2 == 0) {
				evenList.add(A.get(i));
			} else {
				oddList.add(A.get(i));
			}
		}
		int count = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < evenList.size() - 1; i += 2) {
			evenSum = evenSum + evenList.get(i) * evenList.get(i + 1);
			count++;
		}
		if (evenList.size() != count)
			evenSum = evenSum + evenList.get(evenList.size() - 1);
		count = 0;

		for (int i = 0; i < oddList.size() - 1; i += 2) {
			oddSum = oddSum + oddList.get(i) + oddList.get(i + 1);
		}
		if (oddList.size() != count)
			oddSum = oddSum + oddList.get(oddList.size() - 1);
		if (oddSum % 2 > evenSum % 2) {
			return "ODD";
		} else if (oddSum % 2 < evenSum % 2) {
			return "EVEN";
		} else if (oddSum % 2 == evenSum % 2) {
			return "NEUTRAL";
		}
		// Write your code here
		return "";
	}
}

class Filter {
	public static Predicate<? super String> nameStartingWithPrefix(String s) {
		Predicate<String> p = x -> x.startsWith(s);
		return p;
	}
}

class Mapper {

	public static Function<String, String> getDistinctCharactersCount() {

		Function<String, String> f = x -> {
			long unique = x.chars().distinct().count();
			return x + " has " + unique;
		};

		return f;
	}

}

class Emploee {
	private int id;
	private String name;
	private int salary;
	private String department;

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int sal) {
		this.salary = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return this.department;
	}

	public Emploee(int id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
}
