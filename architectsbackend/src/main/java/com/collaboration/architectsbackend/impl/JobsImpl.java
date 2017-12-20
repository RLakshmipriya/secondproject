package com.collaboration.architectsbackend.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collaboration.architectsbackend.dao.JobsDao;
import com.collaboration.architectsbackend.model.Jobs;

@Repository("jobsDAO")
public class JobsImpl  implements JobsDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean saveJobs(Jobs jobs) {
		try{
			sessionFactory.getCurrentSession().save(jobs);
			return true;
		}catch(Exception e)
		{
			System.out.println("exception arised"+e);
		}
		return false;
	}
	@Transactional
	public boolean deleteJobs(Jobs jobs) {
		try{
			sessionFactory.getCurrentSession().delete(jobs);
			return true;
		}catch(Exception e)
		{
			System.out.println("exception arised"+e);
		}
		return false;
	}
	@Transactional
	public boolean updateJobs(Jobs jobs) {
		try{
			sessionFactory.getCurrentSession().update(jobs);
			return true;
		}
		catch(Exception e){
			System.out.println("exception arised"+e);
		}
		return false;
	}
	@Transactional
	public Jobs getJobs(int jobId) {
		Session session = sessionFactory.openSession();
		Jobs jobs = (Jobs) session.get(Jobs.class, new Integer(jobId));
		return jobs;
	}
	@Transactional
	public List<Jobs> getAllJobs() {
		return sessionFactory.getCurrentSession().createQuery("from Jobs").list();
	}

}
