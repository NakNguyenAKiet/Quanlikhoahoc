package DTO;

public class Onlinecourse extends Course{
    private int CourseID;
    private String Url;

    @Override
    public int getCourseID() {
        return CourseID;
    }

    @Override
    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Onlinecourse(int CourseID, String Url) {
        this.CourseID = CourseID;
        this.Url = Url;
    }

    public Onlinecourse() {
    }

    @Override
    public String toString() {
        return "Onlinecourse{" + "CourseID=" + CourseID + ", Url=" + Url + '}';
    }

    
}
