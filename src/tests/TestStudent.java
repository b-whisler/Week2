/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Jan 25, 2022
 */
package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Student;

public class TestStudent {
	Student student = new Student("Steve", "Jones", 3, LocalDate.of(1990, 12, 31));
	@Test
	public void setGetName() {
		student.setFirstName("Thomas");
		student.setLastName("Baker");
		assertEquals("Thomas Baker", student.getFullName());
	}
	@Test
	public void setGetBirthDate() {
		student.setBirthDate(LocalDate.of(1992, 3, 14));
		assertEquals("1992-03-14", student.getBirthDate().toString());
	}

}
