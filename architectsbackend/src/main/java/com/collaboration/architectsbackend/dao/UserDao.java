package com.collaboration.architectsbackend.dao;
import java.util.Set;
import java.util.List;

import com.collaboration.architectsbackend.model.User;

public interface UserDao {
public List<User> getAllUser();
	
	public boolean saveUser(User user);
	public User getByEmail(String email);
	public boolean updateOnlineStatus(String status,User user);

	public User find(int userId);
}
