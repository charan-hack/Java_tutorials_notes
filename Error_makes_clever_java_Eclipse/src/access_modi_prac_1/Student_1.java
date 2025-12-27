package access_modi_prac_1;

class Teacher{
	String teacher_1 = "Praveen";
	public String teacher_2 = "Naveen";
	private String teacher_3 = "Gaveen"; //access only within same class
	protected String teacher_4 = "Saveen";
}




public class Student_1 {
	protected	String teacher_5 = "Daveen";
	public	String teacher_6 = "Maveen";
	
	
	public static void main(String[] args) {
		
		
		Teacher obj = new Teacher();
		System.out.println(obj.teacher_1);
		System.out.println(obj.teacher_2);
		System.out.println(obj.teacher_4);

	}

}
