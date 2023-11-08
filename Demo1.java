package collection3;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> names = new ArrayList<>();
		names.add("sethupathi");
		names.add("sneha");
		names.add("seeman");
		
		long word= names.stream().filter(a->a.equals("seeman")).count();
		System.out.println(word);
		

		
			}

}
