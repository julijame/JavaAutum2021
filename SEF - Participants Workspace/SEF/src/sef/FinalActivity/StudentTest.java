package sef.FinalActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase{
    private Students s;
    private String expectedText = "I study in university %s";

    //setup of the environment
    protected void setUp() throws Exception {
        super.setUp();
        s = new Students();
    }
    //constructor test
    public void testConstructor() {

        Students s1 = new Students("Sveta","Ivanova",20,"LU");
        assertEquals("Sveta", s1.getFirstName());
        assertEquals("Ivanova",s1.getLastName());
        assertEquals(20,s1.getAge());
        assertEquals("LU",s1.getSchoolName());

    }
    //setter test
    public void testSchoolNameSetter() {
        s.setSchoolName("RTU");
        assertEquals("RTU", s.getSchoolName());
    }

    //intro test
    public void testIntro(){
        assertEquals(String.format(expectedText, "RTU"), s.studIntro("RTU"));
    }


}
