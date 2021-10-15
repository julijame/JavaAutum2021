package sef.FinalActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person p;
    private String expectedText = "My name is %s %s and I am %d years old.";

    //setup of the environment
    protected void setUp() throws Exception {
        super.setUp();
        p = new Person();
    }

    //constructor test
    public void testConstructor() {

        Person p1 = new Person("Musja", "Korovjeva", 14);
        assertEquals("Musja",p1.getFirstName());
        assertEquals("Korovjeva",p1.getLastName());
        assertEquals(14,p1.getAge());
    }
    //setter test
    public void testFirstNameSetter() throws CustomException {
        p.setFirstName("Vasja");
        assertEquals("Vasja", p.getFirstName());
    }
    public void testLastNameSetter() throws CustomException{
        p.setLastName("Pupkin");
        assertEquals("Pupkin",p.getLastName());
    }

    public void testAgeSetter() {
        p.setAge(72);
        assertEquals(72, p.getAge());
    }
    //intro method test
    public void testIntro(){
        assertEquals(String.format(expectedText, "Masha", "Rasputina", 6), p.persIntro("Masha","Rasputina", 6));
    }
}
