package Teacher;

public class Assign {
	public Assign() {
	}
	public static void assignCourse(Teacher obj){
		System.out.println(obj.getCourse());
		System.out.println(obj.getTeacherID());
	}
	public static Teacher assignCourse(int id, String subject){
		return new Teacher(id, subject);
	}
}
