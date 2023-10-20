import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxScore {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Rahul", 100));
		studentList.add(new Student("Ram", 500));
		studentList.add(new Student("dwd", 570));
		studentList.add(new Student("Rahdwedul", 400));
		studentList.add(new Student("ewdwed", 900));
		studentList.add(new Student("dewd", 300));
		
		int n = studentList.size();
		long lk = 0;
		System.out.println(studentList.stream().sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
				.map(x -> x.getSname()).limit(4).collect(Collectors.toList()));
		List<Student> list = studentList.stream().sorted((e1, e2) -> e1.getScore().compareTo(e2.getScore()))
				.collect(Collectors.toList());

	}
}

class Student {
	private String sname;
	private Integer score;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Student(String sname, Integer score) {
		super();
		this.sname = sname;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", score=" + score + "]";
	}

}