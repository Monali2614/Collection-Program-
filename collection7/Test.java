package com.yash.collection7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Student> sl = new ArrayList<Student>();

		sl.add(new Student(101, "Dhananjay", "Java", 250));
		sl.add(new Student(102, "Bhushan", "Python", 400));
		sl.add(new Student(103, "Dhanshri", "DataScience", 450));
		sl.add(new Student(104, "Bunty", "Devops", 320));
		sl.add(new Student(105, "Yogesh", "Angular", 150));

		for (Student student : sl) {

			int avg = student.getTotalmarks() * 100 / 500;
			
			if (avg < 50) {
				System.out.println("Students Below 50% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg < 35) {
				System.out.println("Students Below 35% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg > 60) {
				System.out.println("Students Above 60% :" + avg);
				System.out.println(student.getSname());
			}
		}

		execute(sl);
	}

	private static void execute(List<Student> sl) {
		
		Collections.sort(sl, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String sName1 = o1.getSname();
				String sName2 = o2.getSname();

				return sName2.compareTo(sName1);
			}
		});
		System.out.println(sl);
	}
}
