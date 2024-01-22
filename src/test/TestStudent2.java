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
public class TestStudent2 {

	StudentLogic sl = new StudentLogic();
	Student student = new Student();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateStudentId() {
		student.setName("Ryan Johnson");
		student.setAge(16);
		student.setGrade(10);
		String expected = "Ryan Johnson | Grade: 10 | Age: 16";
		String id = sl.createStudentId(student);
		assertEquals(expected, id);
	}

	@Test
	public void testCreateStudentId2() {
		student.setName("John Smith");
		student.setAge(12);
		student.setGrade(6);
		String expected = "John Smith | Grade: 6 | Age: 12";
		String id = sl.createStudentId(student);
		assertEquals(expected, id);
	}
	
	@Test
	public void testCreateStudentId3() {
		student.setName("");
		student.setAge(0);
		student.setGrade(0);
		String expected = " | Grade: 0 | Age: 0";
		String id = sl.createStudentId(student);
		assertEquals(expected, id);
	}
}
