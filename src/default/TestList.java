package com.example;

public class TestList {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e= new Employee(1,"Pooja");
	//	Employee emp=(Employee)e.clone();
		Employee emp= new Employee(e);

		
		for(int i=0;i<1;i++)
			e.setName("Payal");
		
		System.out.println(emp.getName()+""+e.getName());

	}

}

class Employee
//implements Cloneable
{
	
	public Integer id;
	public String name;
	
	public Employee() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	 public Employee(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}
	/*
	 * @Override public Object clone() throws CloneNotSupportedException {
	 * 
	 * Employee employee= new Employee(id, name) ; return employee; // return
	 * shallow copy }
	 */
	
	 public Employee(Employee e) {
		id= e.id;
		name= e.name;
		
	 }
}
