package com.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entity.Student;

public class StudentDao {

	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(Student student)
	{
		hibernateTemplate.save(student);
		
		
	}
	
	public void updata(Student student)
	{
	hibernateTemplate.update(student);	
	}
	
	public Student getStudent(int id)
	{
		return hibernateTemplate.get(Student.class, id);
	}
	
	public void delete(int id)
	{
		hibernateTemplate.delete(getStudent(id));
	}
	
	
	public List<Student> getAllStudents()
	{
		return (List<Student>) hibernateTemplate.find("From users");
		
	}
}
