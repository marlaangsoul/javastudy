package chapter07;

public class StudentMain {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 기본 생성자.
		//필드 초기화
		stu1.name = "홍길동";
		stu1.grade = 3;
		stu1.department = "자바";
		
		Student stu2 = new Student();
		stu2.name = "임꺽정";
		stu2.grade = 3;
		stu2.department = "파이썬";
		
	}

}
