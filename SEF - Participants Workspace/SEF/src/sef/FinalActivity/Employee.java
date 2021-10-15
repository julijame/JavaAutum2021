package sef.FinalActivity;

import java.util.ArrayList;

public class Employee extends Person{

    //Attributes
    private String jobTitle;
    private String companyName;
    private double salary;

    //constructors
    public Employee(){
    }

    public Employee (String firstName, String lastName, int age, String jobTitle, String companyName, double salary){
        super(firstName, lastName, age);
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // getters&setters
    public String getJobTitle() { return jobTitle; }

    public void setJobTitle (String title) { this.jobTitle = title; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName (String companyName) { this.companyName = companyName; }

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }


    // introduction method
    public String empIntro(String firstName, int age, String jobTitle, String companyName) {
       return "My name is " + firstName + " and I am " + age + " years old.\nI work as a " + jobTitle + " in company " + companyName;
    }

    public static void main(String[] args) {

//        for(Employee str: emp) {
//            System.out.println(str.getFirstName());
//        }

    }

}
