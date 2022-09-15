package com.yash.collection9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "Bhushan", 50000, "Devlopment", "Jalgaon");
		Employee employee2 = new Employee(103, "Dhananjay", 55000, "Testing", "Pune");
		Employee employee3 = new Employee(102, "Yogesh", 45000, "SAP", "Mumbai");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
