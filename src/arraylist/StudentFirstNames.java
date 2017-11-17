package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFirstNames {
	
	Scanner keyboard = new Scanner(System.in);
	String name = "";

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}
	
	public void Ask() {
		
		System.out.println("Please enter your name");
		name = keyboard.toString();
		System.out.println(name);
	}

	public void StudentSize() {
		System.out.println("Number of student names is: " + a2Students.size());
		
	}
	
	public void StudentList() {
		System.out.println("Student names: " + a2Students);
	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}
