import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CandidateCode {
	public static void main(String args[]) {
		int n = 3;
		String arr[] = { "1F", "2C", "2F", "2H", "3B", "3F" };
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + findPossibilities(i, arr);
		}
		System.out.println(sum);

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("rahul", "kumar", 900));
		personList.add(new Person("ewe", "dwe", 100));
		personList.add(new Person("uuwd", "test", 7500));
		personList.add(new Person("car", "ff", 500));
		
		personList.stream().sorted((p1,p2)-> p1.getSalary().compareTo(p2.getSalary())).collect(Collectors.toList());

		List<Person> p = personList.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.filter(emp -> emp.getSalary() > 5000).collect(Collectors.toList());
		System.out.println(p);
		/*
		 * int arr[]= {10,15,28,9,100};
		 * 
		 * int maxProfit= 0; for(int i=0;i<arr.length-1;i++){ maxProfit=
		 * Math.max(maxProfit,arr[i+1]-arr[i]); }
		 */

	}

	private static int findPossibilities(int i, String[] arr) {
		Set<Character> sets = new HashSet<Character>();
		char s=(char) (i+'0');
		for (String ch : arr) {
			if (ch.charAt(0) == s) {
				char c = ch.charAt(1);
				if (!sets.contains(c)) {
					sets.add(c);
				}
			}
		}
		int count=0;
		int first=0;
		int second=0;
		List<Character> listch= new ArrayList<Character>();
		for(char c: new char[]{'D','E','F','G'}) {
			if(!sets.contains(c) ){
				count++;
				
			}else {
				if(c == 'D' || c == 'E' ) {
					listch.add(c);
				}else if(c != 'F' || c != 'G'){
					second++;
				}
				
			}
		}
		if(!sets.contains('B') ) {
			first++;
		}
		if( !sets.contains('C'))
			first++;
		 if(!sets.contains('H') ){
			second++;
		}
		 if(sets.contains('J'))
			 second++;
		
		if(count == 4 )
			return 1;
		if(first == 4 && second == 4) {
			return (first/4)+(second/4);
		}else {
			if(first == 4)
			return first/4;
			else
				return second/4;
		}
		
	
	}

}

class Person {
	private String firstName;
	private String lastName;
	private Integer salary;

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Integer getSalary() {
		return this.salary = salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Person(String firstName, String lastName, Integer salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
