package OnlineCourse;

public class Main {
    public static void main(String[] args) {
        Course physics = new Course("Physics", "Dovahkiin", 50);
        System.out.println(physics.getCourseDetails());

        OnlineCourse maths = new OnlineCourse("Maths", "Sam", "Teams", 240, 75);
        System.out.println(maths.getCourseDetails());
    }
}