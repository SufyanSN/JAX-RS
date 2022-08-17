package com.fis.first_jaxrs.resources;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fis.first_jaxrs.model.Student;
import com.fis.first_jaxrs.services.StudentService;



@Path("/students")
public class StudentResource {
	
	StudentService studentService = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Collection<Student> fetchAllStudents(){
		return studentService.fetchAllStudents();
	}
	
	@Path("{id}")
	@GET
	public Student getStudent(@PathParam("id") long id) {
		System.out.println(id);
		return studentService.getStudent(id);
	}
	
	@POST
	public Student addStudent(Student student){
		studentService.addStudent(student);
		return student;
	}


	@Path("{id}")
	@DELETE
	public Collection<Student> deleteStudent(@PathParam("id") long id){
		return studentService.deleteStudent(id);
	}
}