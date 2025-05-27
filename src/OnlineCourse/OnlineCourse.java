package OnlineCourse;

public class OnlineCourse extends Course{
    public String platform;
    public double duration;

    public OnlineCourse(String courseName, String instructorName, String platform, double duration, int credits) {
        super(courseName, instructorName, credits);
        this.platform = platform;
        this.duration = duration;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + "\nPlatform: " + platform + "\nCertification: " + checkCertificationEligibility();
    }

    public boolean checkCertificationEligibility(){
        return duration > 60;
    }
}
