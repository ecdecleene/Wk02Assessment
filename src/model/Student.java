package model;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Jan 21, 2024  
*/
public class Student {
	int age;
	String name;
	int grade;
	/**
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
