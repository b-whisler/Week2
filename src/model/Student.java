/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Jan 25, 2022
 */
package model;

import java.time.LocalDate;

public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private LocalDate birthDate;
	
	public Student() {
		this.firstName = "";
		this.lastName = "";
		this.gpa = 0;
		this.birthDate = LocalDate.of(0, 0, 0);
	}
	
	public Student(String firstName, String lastName, double gpa, LocalDate birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", birthDate="
				+ birthDate + "]";
	}
	
}
