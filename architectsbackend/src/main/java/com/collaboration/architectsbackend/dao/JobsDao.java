package com.collaboration.architectsbackend.dao;

import java.util.List;

import com.collaboration.architectsbackend.model.Jobs;

public interface JobsDao {
	public boolean saveJobs(Jobs jobs);

	public boolean deleteJobs(Jobs jobs);

	public boolean updateJobs(Jobs jobs);

	public Jobs getJobs(int jobId);

	public List<Jobs> getAllJobs();
}
