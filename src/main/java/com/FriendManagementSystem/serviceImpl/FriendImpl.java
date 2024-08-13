package com.FriendManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FriendManagementSystem.Entity.Friend;
import com.FriendManagementSystem.repository.FriendReposiitory;
import com.FriendManagementSystem.service.FriendService;
@Service
public class FriendImpl implements FriendService {
	
	
	@Autowired
	FriendReposiitory friendReposiitory;

	@Override
	public List<Friend> getAllFriend() {
		// TODO Auto-generated method stub
		return friendReposiitory.findAll();
		
	}

	@Override
	public Friend saveFriend(Friend friend) {
		return friendReposiitory.save(friend);
	}

	@Override
	public Friend getById(int id) {
		return friendReposiitory.findById(id).get();
	}

}
