package collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(8);
		nums.add(5);
		
		nums.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		long number =nums.stream().filter(x->x%5==0).count();
		System.out.println(number);
		
		List<Integer> value=nums.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(value);
		
		List<Integer> value1 = nums.stream().filter(x->x%2!=0).map(a->a*a).collect(Collectors.toList());
		System.out.println(value1);
		
		long value2 = nums.stream().filter(x->x%2!=0).map(a->a*a).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(value2);
		
		//ascending order
		nums.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(x->System.out.println(x));
	
		//descending order
		nums.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(x->System.out.println(x));
		
		
		
		
		

	}

}
