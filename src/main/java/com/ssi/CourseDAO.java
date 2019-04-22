package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CourseDAO {
	private SessionFactory sf;
	public CourseDAO(){
		Configuration config=new Configuration().configure();
		sf=config.buildSessionFactory();
	}
	
	public List<Course> getAllCourses(){
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Course.class);
		List<Course> courses=cr.list();
		session.close();
		return courses;
	}
	public Course getCourseById(int id){
		Session session=sf.openSession();
		Course course=session.get(Course.class, id);
		session.close();
		return course;
	}
	
}
