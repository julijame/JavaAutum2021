package sef.FinalActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee e;
    private String expectedText = "My name is %s and I am %d years old.\nI work as a %s in company %s";

    //setup of the environment
    protected void setUp() throws Exception {
        super.setUp();
        e = new Employee();
    }
    //constructor test
    public void testConstructor() {

        Employee e1 = new Employee("Sveta","Ivanova",25,"manager", "Rimi", 2000);
        assertEquals("Sveta", e1.getFirstName());
        assertEquals("Ivanova",e1.getLastName());
        assertEquals(25,e1.getAge());
        assertEquals("manager",e1.getJobTitle());
        assertEquals("Rimi",e1.getCompanyName());
        assertEquals(2000d,e1.getSalary());
    }
    //setter test
    public void testJobTitleSetter() {
        e.setJobTitle("cleaner");
        assertEquals("cleaner", e.getJobTitle());
    }

    public void testCompanyNameSetter() {
        e.setCompanyName("Maxima");
        assertEquals("Maxima", e.getCompanyName());
    }

    public void testSalarySetter() {
        e.setSalary(500);
        assertEquals(500d, e.getSalary());
    }
    //intro test
    public void testIntro(){
        assertEquals(String.format(expectedText, "Masha", 20, "boss", "CoCoCo"), e.empIntro("Masha", 20, "boss", "CoCoCo"));
    }


}
