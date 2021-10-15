package sef.FinalActivity;

import com.sun.source.tree.ClassTree;
import sef.module8.activity.CustomExceptionActivity;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) throws CustomException {
        boolean containsDigit = false;
        //if (firstName.matches(".*\\d.*")) {
        for (char c: firstName.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                break;
            }
        }
        if (containsDigit) {
                throw new CustomException();
            }
        else {
            this.firstName = firstName;
        }
    }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) throws CustomException {

        boolean containsDigit = false;
        for (char c: lastName.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                break;
            }
        }
        if (containsDigit) {
            throw new CustomException();
        }
        else {
            this.lastName = lastName;
        }
    }

    public String getLastName() { return lastName; }

    public void setAge(int age) { this.age = age; }

    public int getAge() { return age; }

    public String persIntro(String firstName, String lastName, int age) {
        return "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
    }

//    public static void main(String[] args) throws CustomException {
//        Person p = new Person();
//        p.setFirstName("Katja");
//        p.setLastName("Kizjakova");
//        System.out.println(p.getFirstName());
//        System.out.println(p.getLastName());
//    }
}
