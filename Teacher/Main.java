package Teacher;

public class Main {
	public static void main(String[] args) {
		int id = 152;
		Teacher teacher = new Teacher(id,"Java");
		Assign.assignCourse(teacher);
		Assign.assignCourse(id, "AI");
		System.out.println(Assign.assignCourse(id, "AI").getCourse());
		System.out.println(Assign.assignCourse(id, "AI").getTeacherID());
	}
}
