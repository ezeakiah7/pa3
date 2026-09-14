package edu.txst.constructors;

/*
 * Student.java
 * This class represents a student with basic information.
 */

public class Student {
    // private instance variables
    // each variable contains a detail about a student
	private String firstName;
	private String lastName;
	private String major;
	private double gpa;
        // public function used to set value of student's first name
	public void setFirstName(String firstName) {
        // variable firstName is assigned to the instance variable firstName
		this.firstName = firstName;
	}
        // public function to return the value of student's first name
	public String getFirstName() {
		return firstName;
	}
        // public function used to set value of student's last name
	public void setLastName(String lastName) {
        // variable lastName is assigned to the instance variable lastName
		this.lastName = lastName;
	}
        //public function to return the value of student's last name
	public String getLastName() {
        // return the value of instance variable lastName
		return lastName;
	}

        // public function used to set value of student's major
	public void setMajor(String major) {
        // variable major is assigned to the instance variable major
		this.major = major;
	}
        // public function to return the value of student's major
	public String getMajor() {
        // return the value of instance variable major
		return major;
	}

        // public function used to set value of student's GPA
	public void setGpa(double gpa) {
        // variable gpa is assigned to the instance variable gpa
		this.gpa = gpa;
	}

	public double getGpa() {
        // return the value of instance variable gpa
		return gpa;
	}
    // Default constructor that initializes a student with default values for first name, last name, major, and GPA.
	public Student() {
		this("", "", "", 0.0);
	}
    // parameterized constructor that initializes a student with default values for first name, last name, major, and GPA.
	public Student(String firstName, String lastName, String major, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.gpa = gpa;
	}
       
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("First name: " + student1.getFirstName());
		System.out.println("Last name: " + student1.getLastName());
		System.out.println("Major: " + student1.getMajor());
		System.out.println("GPA: " + student1.getGpa());
		Student student2 = new Student("Peter", "Parker", "CS", 3.5);
		System.out.println("First name: " + student2.getFirstName());
		System.out.println("Last name: " + student2.getLastName());
		System.out.println("Major: " + student2.getMajor());
		System.out.println("GPA: " + student2.getGpa());

        // custom made student 3
        Student student3 = new Student("Ken", "Jacobs", "Aerospace Engineering", 3.8); 
        /* 
        could set the values of student 3 using the setter functions but we already set them in the constructor
        student3.setFirstName("Ken"); // set first name to ken
        student3.setLastName("Jacobs"); // set last name to jacobs
        student3.setMajor("Aerospace Engineering"); // set major to aerospace engineering
        student3.setGpa(3.8);  // set gpa to 3.8
        */
        // getter function print out all the information about student 3
        System.out.println("First name: " + student3.getFirstName());
        System.out.println("Last name: " + student3.getLastName());
        System.out.println("Major: " + student3.getMajor());
        System.out.println("GPA: " + student3.getGpa());

        // what if student name was wrong and needed to be changed? we can use the setter function to change it
        student3.setFirstName("Rennison "); // change first name to kenneth
        System.out.println("First name: " + student3.getFirstName()); // print out the new first name
	}
}
