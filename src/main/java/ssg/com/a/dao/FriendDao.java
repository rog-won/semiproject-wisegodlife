package ssg.com.a.dao;

import ssg.com.a.dto.FriendDto;

public interface FriendDao {

	int idcheck(String id);
	
	int addfriend(FriendDto dto);
	
	FriendDto login(FriendDto dto);
}
