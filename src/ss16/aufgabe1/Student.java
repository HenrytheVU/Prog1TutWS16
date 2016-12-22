package ss16.aufgabe1;

public class Student {

	// Attribute
	String name;
	int alter;

	// Konstruktor mit 2 Parametern
	public Student(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	// Eigentliche Aufgabe 14p
	public static Student[] getStudentsOver18(Student[] allStudents) {
		int counter = 0;
		for (int i = 0; i < allStudents.length; i++) {
			if (allStudents[i].getAlter() >= 18) {
				counter++;
			}
		}

		Student[] studentsOver18 = new Student[counter];

		int studentsOver18Index = 0;
		for (int i = 0; i < allStudents.length; i++) {
			if (allStudents[i].getAlter() >= 18) {
				studentsOver18[studentsOver18Index] = allStudents[i];
				studentsOver18Index++;
			}
		}
		return studentsOver18;
	}

}
