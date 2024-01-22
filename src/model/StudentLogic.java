package model;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Jan 21, 2024  
*/
public class StudentLogic {
	
	public int findGradeInFiveYears(Student student) {
		int grade = 0;
		grade = student.getGrade();
		grade = grade + 5;
		return grade;
	}
	
	public String createStudentId(Student student) {
		String id = student.name + " | " + "Grade: " + student.grade + " | Age: " + student.age;
		return id;
	}
}
