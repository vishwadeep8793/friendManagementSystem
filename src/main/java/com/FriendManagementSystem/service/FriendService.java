package com.FriendManagementSystem.service;

import java.util.List;

import com.FriendManagementSystem.Entity.Friend;

public interface FriendService {
	public List<Friend> getAllFriend();
	
	public Friend saveFriend(Friend friend);
	
	public Friend getById(int id);

}
