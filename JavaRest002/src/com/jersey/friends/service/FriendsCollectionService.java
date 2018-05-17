package com.jersey.friends.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.PathParam;

import com.jersey.friends.dao.FriendDAO;
import com.jersey.friends.pojo.Friend;

public class FriendsCollectionService {
	
	public static HashMap<Integer,Friend> friendsMap = new HashMap<Integer,Friend>();
	FriendDAO dao=new FriendDAO();
	
	public FriendsCollectionService() {
		super();
		// TODO Auto-generated constructor stub
		Friend f1= new Friend(1,"Shiva","Chennai");
		Friend f2= new Friend(2,"Modi","Delhi");
		Friend f3= new Friend(3,"Mani","Chennai");
		Friend f4= new Friend(4,"Kamal","Chennai");
		Friend f5= new Friend(5,"Adi","Goa");
		
		friendsMap.put(1, f1);
		friendsMap.put(2, f2);
		friendsMap.put(3, f3);
		friendsMap.put(4, f4);
		friendsMap.put(5, f5);
		
	}
	
	public List<Friend> getAllFriends()
	{
		List<Friend> friends=new ArrayList<>(friendsMap.values());
		return friends;
	}
	
	public Friend getFriendById(int id)
	{
		Friend f=friendsMap.get(id);
		return f;
	}
	
	public List<Friend> updateFriend(Friend friend)
	{
		friendsMap.put(friend.getId(),friend);
		List<Friend> friends=new ArrayList<>(friendsMap.values());
		return friends;
	
		
	}
	
	public void deleteFriend(int id)
	{
		//friendsMap.remove(id);
		try {
			dao.deleteFriend(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
