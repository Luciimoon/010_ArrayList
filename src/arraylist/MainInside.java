package arraylist;

public class MainInside {

	public static void main(String[] args) {
		
		GradingRequrements();
		
		StudentFirstNames a2 = new StudentFirstNames();
		//a2.StudentFirstNames();
		a2.Ask();
		//a2.StudentsCheck();
		a2.removeName();
		a2.StudentSize();
		a2.StudentList();
		a2.ReplaceName();
		a2.StudentList();

	}

	private static void GradingRequrements() {
		System.out.println(
		"1. ALL JOP and jar'd\n" +
		"2. First is a menu asking for desired option, looped" +
		"3. menu: Show Names, Add name, Remove name, Replace name, exit" 
				
				);
		
	}

}

