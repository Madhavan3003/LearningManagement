package collectionMethods;

import java.util.*;

class Employee {
	int id;
	int salary;
	String name;
	
Employee(int id, int salary, String name){
	this.id=id;
	this.name=name;
	this.salary=salary;	
}
}

class  Workers implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		if(o1.salary == o2.salary)
		return 0;
		
		else if(o1.salary>o2.salary)
		return 1;
		
		else
		return-1;
}
}

class SortSalary{
	 public static void main(String[] args) {
		 ArrayList<Employee>al = new ArrayList<Employee>();
		 al.add(new Employee (45,10000,"Tamil"));
		 al.add(new Employee (48,20000,"English"));
		 al.add(new Employee (40,80000,"Maths"));
		 al.add(new Employee (42,60000,"Science"));
		 
		 for(Employee em:al) {
			 System.out.println(em.id+" "+em.salary+" "+em.name);
}	 
}
}

