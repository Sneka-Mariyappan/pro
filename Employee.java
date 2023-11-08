package collection3;

public class Employee {
	private String name ;
	private int id;
	private int salary;
	private String dept;
	private int experience;
	private int age;
	private String gender;
	private String location;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
		return salary;
	}
	
	public void setdept(String dept) {
		this.dept=dept;
	}
	public String getdept() {
		return dept;
	}
	
	public void setexperience(int experience) {
		this.experience=experience;
	}
	public int getexperience() {
		return experience;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	
	public void setlocation(String location) {
		this.location=location;
	}
	public String getlocation() {
		return location;
	}
	
	public Employee(int id,String dept,int experience,int age) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.experience=experience;
		this.age=age;
		this.gender=gender;
		this.location=location;
	}
	public String toString() {
		return "name:"+name+","+"id:"+id+","+"salary:"+salary+","+"experience:"+experience+","+"age:"+age+","+"gender:"+gender+","+"location:"+location;
	}
	}
	


