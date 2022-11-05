package test101;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeClass {
	
public static void main(String[] args) {
	ArrayList<String>Cars = new ArrayList<String>();
	Cars.add("Toyota");
	Cars.add("Tesla");
	Cars.add("Jaguar");
	Cars.add("Honda");
	Cars.add("Nissan");
	Cars.add("BMW");
	System.out.println(Cars);
	System.out.println(Cars.get(2));
	System.out.println(Cars.get(5));
	for(int i=0;i<Cars.size();i++) {
		System.out.println(Cars.get(i));
	}
	
	Cars.set(4,"Tata");
	System.out.println(Cars);
	Cars.remove(3);
	System.out.println(Cars);
	Collections.sort(Cars);
	System.out.println(Cars);
	
}
}