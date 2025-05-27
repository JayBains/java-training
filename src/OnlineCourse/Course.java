package OnlineCourse;

public class Course {
    public String courseName;
    public String instructorName;
    public int credits;

    public Course(String courseName, String instructorName, int credits) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.credits = credits;
    }

    public String getCourseDetails(){
        return "Course: " + courseName + "\nInstructor: " +instructorName + "\nCredits: " + credits;
    }
}
