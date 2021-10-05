package com.hreshi.authsystem;

import java.util.TreeMap;

public final class Users {
	private static final TreeMap<String, String> userMap = new TreeMap<String, String>();
	public boolean isPresent(String username) {
		return userMap.containsKey(username);
	}
	public boolean registerUser(String username, String password) {
		if(!isPresent(username)) {
			userMap.put(username, password);
			return true;
		} 
		return false;
	}
	public boolean validateUser(String username, String password) {
		if(isPresent(username)) {
			return password.equals(getPassword(username));
		}
		return false;
	}
	private String getPassword(String username) {
		return userMap.get(username);
	}
}