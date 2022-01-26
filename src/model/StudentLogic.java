/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Jan 25, 2022
 */
package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StudentLogic {
	final int passingGrade = 2;
	
	
	public int calculateAge(Student student) {
		return (int)ChronoUnit.YEARS.between(student.getBirthDate(), LocalDate.now());
	}
	
	public boolean isPassing(Student student) {
		return student.getGpa() >= passingGrade;
	}
}
