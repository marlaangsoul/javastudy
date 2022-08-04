package chapter07;

public class Student3 {
	private String name;
	private int grade;
	private String department;
	
	String getName() {
		return name;
}
	void setName(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		if(grade == 0) {
			grade = 1;
		}
		this.grade = grade;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}

	
	

}
