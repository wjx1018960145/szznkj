package com.szzn.server;

import com.szzn.mode.User;



public abstract interface UserService {
	public abstract String login(User user)throws Exception;
	public abstract String info(String token) throws Exception;
	public abstract String logout(String token) throws Exception;
	public abstract String allUser(String token) throws Exception;
	public abstract String addUser(User user) throws Exception;
	public abstract String updateUser(User user) throws Exception;
	public abstract String delUser(User user) throws Exception;
}
