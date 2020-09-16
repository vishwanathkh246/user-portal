/**
 * 
 */
package com.hatgundi.userportal.service;

import java.util.Map;

/**
 * @author vhatgund
 *
 */
public interface UserService {

	String getAllUsers();

	String getUser(String userId);

	String addUser(Object obj);

	String updateUser(String userId, Object obj);

	Map<String, Boolean> deleteUser(String userId);

}
