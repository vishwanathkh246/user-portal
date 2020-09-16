/**
 * 
 */
package com.hatgundi.userportal.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hatgundi.userportal.service.UserService;

/**
 * @author vhatgund
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getAllUsers() {
		return "Get: all Users";
	}

	@Override
	public String getUser(String userId) {
		return "Get: user by userID:" + userId;
	}

	@Override
	public String addUser(Object obj) {
		return "Post: user added";
	}

	@Override
	public String updateUser(String userId, Object obj) {
		return "Put: user updated";
	}

	@Override
	public Map<String, Boolean> deleteUser(String userId) {
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return response;
	}

}
