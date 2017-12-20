package com.collaboration.architectsbackend.dao;

import java.util.List;

import com.collaboration.architectsbackend.model.Friend;

public interface FriendDao {
	public boolean saveFriend(Friend friend);
	public boolean deleteFriend(Friend friend);
	public boolean updateFriend(Friend friend);
	public Friend getFriend(int friendId);
	public List<Friend> getAllFriend();
}
