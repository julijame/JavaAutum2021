package sef.FinalActivity;

public class Students extends Person{

    //Attributes
    private String schoolName;

    //constructors
    public Students() {
    }

    public Students (String firstName, String lastName, int age, String schoolName){
        super(firstName, lastName, age);
        this.schoolName = schoolName;
    }

    // getters & setters
    public String getSchoolName() { return schoolName; }

    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }

    // introduction method
    public void stuIntro() {
        System.out.println("I study in university " + schoolName);
    }
    public String studIntro(String schoolName) {
        return "I study in university " + schoolName;
    }
    public static void main(String[] args) throws CustomException {
        Students s = new Students();
        s.setFirstName("Zhu");
        s.setLastName("Lai");
        s.setSchoolName("SSE");
        System.out.println(s.getFirstName()+s.getLastName()+s.getSchoolName());
        s.stuIntro();
    }




}
