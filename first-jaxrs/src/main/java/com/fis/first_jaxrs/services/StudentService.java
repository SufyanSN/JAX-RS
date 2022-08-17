package com.fis.first_jaxrs.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fis.first_jaxrs.model.Student;

public class StudentService{
	
	static Map<Long, Student> studentMap = new HashMap<Long, Student>();
	
	static {
		studentMap.put(1l, new Student(1l, "Syed Sufyan Ahmed", "CSE", "2018"));
		studentMap.put(12l, new Student(12l, "Syed Sufyan Ahmed", "IT", "2019"));
	}
	
	public Collection<Student> fetchAllStudents() {
		return studentMap.values();
	}
	
	public Student getStudent(long id) {
		return studentMap.getOrDefault(id, null);
	}
	
	public void addStudent(Student student) {
		studentMap.put(student.getId(), student);
	}

	public Collection<Student> deleteStudent(long id){
		studentMap.remove(id);
		return studentMap.values();
	}
	
}
