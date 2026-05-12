package Week06.Question01;
class Course {
    String courseID;
    String courseName;
    int durationWeeks;

    Course() {
        courseID = "C001";
        courseName = "Java";
        durationWeeks = 4;
    }
    Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }
    void displayCourseDetails() {
        System.out.println(courseID);
        System.out.println(courseName);
        System.out.println(durationWeeks);
    }
    double calculateTotalFee() {
        return 10000.00;
    }

    double calculateTotalFee(double discountPercentage) {
        return calculateTotalFee() -
                (calculateTotalFee() * discountPercentage / 100);
    }
}

class RegularCourse extends Course {
    boolean hasLiveSessions;

    RegularCourse() {
        super();
        hasLiveSessions = true;
    }

    RegularCourse(String courseID, String courseName,
                  int durationWeeks, boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }

    @Override
    double calculateTotalFee() {
        return 100 * durationWeeks;
    }

    @Override
    void displayCourseDetails() {
        System.out.println("Regular Course");
        System.out.println("Fee: " + calculateTotalFee());
        System.out.println("Live Sessions: " + hasLiveSessions);
    }
}

class PremiumCourse extends Course {
    boolean includeCertification;

    PremiumCourse() {
        super();
    }

    PremiumCourse(String courseID, String courseName,
                  int durationWeeks, boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    @Override
    double calculateTotalFee() {
        double fee = 150 * durationWeeks;

        if (includeCertification) {
            fee += 50;
        }

        return fee;
    }

    @Override
    void displayCourseDetails() {
        System.out.println("Premium Course");
        System.out.println("Fee: " + calculateTotalFee());
        System.out.println("Certification: " + includeCertification);
    }
}

public class Main {
    public static void main(String[] args) {

        RegularCourse r = new RegularCourse();

        PremiumCourse p =
                new PremiumCourse("P101", "Python", 6, true);

        r.displayCourseDetails();
        p.displayCourseDetails();

        System.out.println(r.calculateTotalFee(10));
        System.out.println(p.calculateTotalFee(20));
    }
}