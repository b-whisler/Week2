/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Jan 25, 2022
 */
package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import model.Student;
import model.StudentLogic;

public class TestStudentLogic {
	StudentLogic studentLogic = new StudentLogic();
	Student student1 = new Student("James", "Smith", 3.5, LocalDate.of(2000, 1, 1));
	Student student2 = new Student("John", "Smith", 1.9, LocalDate.of(1995, 5, 23));
	
	@Test
	public void calculateAge() {
		// Adds to the number of years based on the birth date to future-proof the test
		assertEquals(22 + ChronoUnit.YEARS.between(LocalDate.now(), LocalDate.of(2022, 1, 1)), studentLogic.calculateAge(student1));
	}
	
	@Test
	public void isPassing() {
		assertTrue(studentLogic.isPassing(student1));
	}
	
	@Test
	public void isNotPassing() {
		assertFalse(studentLogic.isPassing(student2));
	}
	
}
