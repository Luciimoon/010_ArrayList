package arraylist;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class MainInside {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		boolean running = true;
		String msg = "";

		StudentFirstNames a2 = new StudentFirstNames();

		UIManager UI = new UIManager();
		UI.put("OptionPane.background", new ColorUIResource(2, 144, 231));
		UI.put("Panel.background", new ColorUIResource(2, 144, 231));

		while (running == true) {

			Object[] possibilities = { "Add student", "Delete students", "Shown list of students", "Replace a student",
					"Exit" };
			String showFirst = "Add student";
			String s = (String) JOptionPane.showInputDialog(null, "Please make your selection.", "Start Here",
					JOptionPane.PLAIN_MESSAGE, null, possibilities, showFirst);

			if (s.equalsIgnoreCase("Add student")) {

				a2.Ask();

			} else if (s.equalsIgnoreCase("Delete students")) {

				a2.removeName();

			} else if (s.equalsIgnoreCase("Shown list of students")) {

				a2.StudentList();

			} else if (s.equalsIgnoreCase("Replace a student")) {

				a2.ReplaceName();

			} else {
				System.exit(0);
			}

			msg = "Do you want go again?";
			String goAgain = JOptionPane.showInputDialog(null, msg).toLowerCase();

			if (goAgain.equals("y") || (goAgain.equals("yes"))) {
				running = true;
			} else if (goAgain.equals("n") || (goAgain.equals("no"))) {
				running = false;
				msg = "Goodbye, see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else {
				msg = "Please try again";
				JOptionPane.showMessageDialog(null, msg);

			}
		}
	}
	/*
	 * private static void GradingRequrements() { System.out.println(
	 * "1. ALL JOP and jar'd\n" +
	 * "2. First is a menu asking for desired option, looped" +
	 * "3. menu: Show Names, Add name, Remove name, Replace name, exit"
	 * 
	 * );
	 */

}
