package com.ssi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("course")
public class CourseResource {

	
	@Path("all/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Course> showAllCoursesXml(){
		CourseDAO dao=new CourseDAO();
		List<Course> courses=dao.getAllCourses();
		return courses;
	}
	
	@Path("all/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> showAllCoursesJSON(){
		CourseDAO dao=new CourseDAO();
		List<Course> courses=dao.getAllCourses();
		return courses;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showSingleCourse(){
		Course course=new Course("C111","JavaFastTrack","Java",2,10000);
		return course.toString();
	}
	
	@Path("xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Course showSingleCourseAsXML(){
		Course course=new Course("C111","JavaFastTrack","Java",2,10000);
		return course;
	}
	
	@Path("json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Course showSingleCourseAsJSON(){
		Course course=new Course("C111","JavaFastTrack","Java",2,10000);
		return course;
	}
	
	
}
