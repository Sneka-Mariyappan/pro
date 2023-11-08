package collection3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("sethupathi",1,20000,"testing",4,34,"male","chennai");
		Employee e2 = new Employee("seeman",2,30000,"testing",5,35,"male","chennai");
		Employee e3 = new Employee("simbu",3,40000,"developer",6,37,"male","bangalore");
		Employee e4 = new Employee("simbu",4,50000,"testing",6,38,"male","chennai");
		Employee e5 = new Employee("sam",5,25000,"developer",2,25,"female","coimbatore");
		
		ArrayList <Employee> names = new ArrayList<>();
		names.add(e1);
		names.add(e2);
		names.add(e3);
		names.add(e4);
		names.add(e5);
		
		
		
		List<Employee> emp1 = names.stream().filter(x->x.getgender().equalsIgnoreCase("male")).peek(r->r.getsalary())
		//List<Employee> empx=names.stream().filter(x->x.getdept().equals("testing")).map(a->{a.setsalary(a.getsalary()+getsalary()*10/100); return a;}).collect(Collectors.toList());
		//System.out.println(empx);
	}
}
		
		/*long agecount =names.stream().filter(a->a.getage()>30).count();
		System.out.println(agecount);
		
		
		names.stream().filter(a->a.getName().equalsIgnoreCase("seeman")).forEach(a->System.out.println(a));
		List<Employee> word1=names.stream().filter(a->a.getid()>2).collect(Collectors.toList());
		System.out.println(word1);
		
		Employee salary1 =names.stream().max(Comparator.comparingInt(Employee::getsalary)).get();
		System.out.println(salary1);
		
		Employee salary2 =names.stream().min((Comparator.comparingInt(Employee::getsalary))).get();
		System.out.println(salary2);
		
		List<Employee> emp=names.stream().filter(a->a.getName().startsWith("s")).limit(3).collect(Collectors.toList());
		System.out.println(emp);*/
		
		/*List<Employee> emp1=names.stream().filter(a->a.getName().startsWith("s")).skip(2).collect(Collectors.toList());
		System.out.println(emp1);
		
		List <String> val = names.stream().map(x->x.getName()).distinct().collect(Collectors.toList());
		 System.out.println(val);*/
		
		//names.stream().sorted(Comparator.comparingInt(Employee::getid())).forEach(x->System.out.println(x));*/
		
		/*HashMap <Integer,Employee> emp = new HashMap<>();
		emp.put(e1.getid(), e1);
		emp.put(e2.getid(), e2);
		emp.put(e3.getid(), e3);
		emp.put(e4.getid(), e4);
		emp.put(e5.getid(), e5);
		
		
		}

	private static int getsalary() {
		// TODO Auto-generated method stub
		return 0;
	}*/ 
		
		
		
		
		
		//emp.values().stream().filter(x->x.getgender().equalsIgnoreCase("male")).forEach(x->System.out.println(x));
		
		/* long word =emp.values().stream().filter(a->a.equals("seeman")).count();
		 System.out.println(word);*/
		
		/*Map<Integer,Employee> c= emp.values().stream().filter(x->x.getsalary()>25000).collect(Collectors.toMap(x->x.getid(),y->y));
		System.out.println(c);*/


		
	
		
		
		
		
	
	


