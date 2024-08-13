package com.FriendManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.FriendManagementSystem.Entity.Friend;


@Repository
public interface FriendReposiitory extends JpaRepository<Friend, Integer> {

}
