package com.collaboration.architectsbackend.dao;

import java.util.List;

import com.collaboration.architectsbackend.model.BlogComments;

public interface BlogCommentsDao {
	public boolean saveBlogComments(BlogComments blogComments);

	public boolean deleteBlogComments(BlogComments blogComments);

	public boolean updateBlogComments(BlogComments blogComments);

	public BlogComments getBlogComments(int blogCommentsId);

	public List<BlogComments> getAllBlogComments();
}
