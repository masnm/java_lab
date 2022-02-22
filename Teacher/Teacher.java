package Teacher;

public class Teacher {
	private int teacherID;
	private String course;
	public Teacher() {
	}
	public Teacher(int teacherID, String course) {
		this.teacherID = teacherID;
		this.course = course;
	}
	public int getTeacherID() {
		return teacherID;
	}
    public void setNumber ( int num ) {
	this.number = num;
    }
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
