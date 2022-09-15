package com.yash.collection8;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckCase {

	List<ProductionFacility> list = new ArrayList<>();

	ProductionFacility pp;
	LocalDate ld;
	Scanner sc = new Scanner(System.in);
	String n[] = new String[10];

	public void add() {
		for (int i = 0; i < 2; i++) {

			pp = new ProductionFacility();
			System.out.println("Enter ID");
			pp.setPlid(sc.nextInt());
			System.out.println("Enter name");
			pp.setFacility_name(sc.next());
			System.out.println("Enter Location");
			pp.setFacility_location(sc.next());
			System.out.println("Prod per day");
			pp.setProduction_perday(sc.nextInt());
			System.out.println("Enter Item name");
			n[i] = sc.next();
			pp.setItemnames(n);
			System.out.println("Enter year,month,day");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			pp.setDate(LocalDate.of(year, month, day));

			list.add(pp);

		}

	}

	String name;

	public void dis() {
		System.out.println("Enter name");
		name = sc.next();

		for (ProductionFacility pp1 : list) {

			if (pp1.getFacility_name().contentEquals(name)) {
				System.out.println(pp1.getPlid());
				System.out.println(pp1.getFacility_name());
				System.out.println(pp1.getFacility_location());
				System.out.println(pp1.getProduction_perday());
				System.out.println(pp1.getItemnames());

			}

		}

	}

	public void highesno() {
		for (ProductionFacility pp1 : list) {

			if (pp1.getProduction_perday() > pp1.getProduction_perday()) {
				System.out.println(pp1.getPlid());
				System.out.println(pp1.getFacility_name());
				System.out.println(pp1.getFacility_location());
				System.out.println(pp1.getProduction_perday());
				System.out.println(pp1.getItemnames());

			}

		}

	}

	public static void main(String[] args) {

		CheckCase cc = new CheckCase();
		cc.add();
		cc.dis();
		cc.highesno();
	}
}