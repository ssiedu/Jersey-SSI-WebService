package com.ssi;

import java.util.List;

import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("course")
public class CourseResource {

	@Path("price")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> showAllCourseOnPrice(@QueryParam("low") int min, @QueryParam("high") int max){
		CourseDAO dao=new CourseDAO();
		List<Course> courses=dao.getAllCoursesForPriceRange(min, max);
		return courses;
	}
	
	/*
	@Path("price/{low}/{high}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> showAllCourseOnPrice(@PathParam("low") int min, @PathParam("high") int max){
		CourseDAO dao=new CourseDAO();
		List<Course> courses=dao.getAllCoursesForPriceRange(min, max);
		return courses;
	}
	*/
	
	@Path("subject/{sname}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> showAllCourses(@PathParam("sname") String subject){
		CourseDAO dao=new CourseDAO();
		List<Course> courses=dao.getAllCoursesForSubject(subject);
		return courses;
	}
	
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
	@Path("{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showSingleCourse(@PathParam("id") String courseId){
		CourseDAO dao=new CourseDAO();
		Course course=dao.getCourseById(courseId);
		return course.toString();
	}
	
	@Path("xml/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Course showSingleCourseAsXML(@PathParam("id") String courseId){
		CourseDAO dao=new CourseDAO();
		Course course=dao.getCourseById(courseId);
		return course;
	}
	
	@Path("json/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Course showSingleCourseAsJSON(@PathParam("id") String courseId){
		CourseDAO dao=new CourseDAO();
		Course course=dao.getCourseById(courseId);
		return course;
	}
	
	
}
