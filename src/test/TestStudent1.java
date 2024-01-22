package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Jan 22, 2024  
*/
public class TestStudent1 {

	StudentLogic sl = new StudentLogic();
	Student student = new Student();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindGradeInFiveYears() {
		int expected = 8;
		student.setGrade(3);
		int grade = sl.findGradeInFiveYears(student);
		assertEquals(expected, grade);
	}

	@Test
	public void testFindGradeInFiveYears2() {
		int expected = 12;
		student.setGrade(7);
		int grade = sl.findGradeInFiveYears(student);
		assertEquals(expected, grade);
	}
	
	@Test
	public void testFindGradeInFiveYears3() {
		int expected = 6;
		student.setGrade(1);
		int grade = sl.findGradeInFiveYears(student);
		assertEquals(expected, grade);
	}
}
