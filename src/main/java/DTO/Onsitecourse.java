package DTO;

public class Onsitecourse extends Course{
    private int CourseID;
    private String Location;
    private String Days;
    private String Time;

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String Days) {
        this.Days = Days;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public Onsitecourse(int CourseID, String Location, String Days, String Time) {
        this.CourseID = CourseID;
        this.Location = Location;
        this.Days = Days;
        this.Time = Time;
    }

    public Onsitecourse() {
    }

    @Override
    public String toString() {
        return "Onsitecourse{" + "CourseID=" + CourseID + ", Location=" + Location + ", Days=" + Days + ", Time=" + Time + '}';
    }
}
