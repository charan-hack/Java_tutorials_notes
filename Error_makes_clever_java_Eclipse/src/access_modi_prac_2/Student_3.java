package access_modi_prac_2;

import access_modi_prac_1.Student_1;

class Student_3_1{
	
	
	void a() {
		Student_1 obj = new Student_1();
		
		System.out.println(obj.teacher_6);

	}
	
}

public class Student_3 extends	Student_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_3 obj1 = new Student_3();
		System.out.println(obj1.teacher_5);
		
	}

}
