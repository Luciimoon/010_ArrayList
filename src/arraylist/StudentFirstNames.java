package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentFirstNames {

	Scanner kbd = new Scanner(System.in);
	// String name = "";
	int test = 0;

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}

	public void Ask() {

		System.out.println("Please enter your name.");

		String entry = kbd.nextLine();

		if (a2Students.indexOf(entry) < 0) {
			a2Students.add(entry);

		} else {
			JOptionPane.showMessageDialog(null, "name already exists");
		}

	}

	public void StudentSize() {
		System.out.println("Number of student names is: " + a2Students.size());

	}

	public void StudentList() {
		System.out.println("Student names: " + a2Students);

		for (int i = 0; i < a2Students.size(); i++)
			System.out.println(a2Students.get(i));

	}

	public void StudentsCheck() {

		String n = JOptionPane.showInputDialog("what name are you searching for");
		if (a2Students.indexOf(n) < 0) {
			JOptionPane.showMessageDialog(null, "name not found");
		} else {
			JOptionPane.showMessageDialog(null, "name found");
		}

	}

	public void removeName() {

		System.out.println("what name do you want to remove?");
		String name = kbd.nextLine();

		if (a2Students.indexOf(name) > 0)
			a2Students.remove(name);
		else
			JOptionPane.showMessageDialog(null, "name doesn't exist");

	}

	public void ReplaceName() {

		System.out.println("What name do you want to replace");
		String name = kbd.nextLine();
		int index = a2Students.indexOf(name);
		if (index == -1) {
			System.out.println("name not on list");
			return;
		}

		System.out.println("what do you want to replace it with?");
		name = kbd.nextLine();
		a2Students.set(index, name);

	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}
