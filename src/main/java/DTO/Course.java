package DTO;

public class Course {

    private int CourseID;
    private int Credits;
    private int DepartmentID;
    private String Tilte;
    
    public Course(int CourseID, int Credits, int DepartmentID, String Tilte) {
        this.CourseID = CourseID;
        this.Credits = Credits;
        this.DepartmentID = DepartmentID;
        this.Tilte = Tilte;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }
    
    public int getCredits() {
        return Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getTilte() {
        return Tilte;
    }

    public void setTilte(String Tilte) {
        this.Tilte = Tilte;
    }
    
    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" + "CourseID=" + CourseID + ", Credits=" + Credits + ", DepartmentID=" + DepartmentID + ", Tilte=" + Tilte + '}';
    }
}
