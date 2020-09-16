/**
 * 
 */
package com.hatgundi.userportal.io.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vhatgund
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

	@GetMapping
	public ResponseEntity<String> getAllUsers() {
		return new ResponseEntity<String>("Get: all users", HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<String> getUser(String userId) {
		return new ResponseEntity<String>("Get: user by userID:" + userId, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addUser(Object obj) {
		return new ResponseEntity<String>("Post: user added", HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<String> updateUser(String userId, Object obj) {
		return new ResponseEntity<String>("Put: user updated", HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Map<String, Boolean>> deleteUser(String userId) {
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return new ResponseEntity<Map<String, Boolean>>(response, HttpStatus.OK);
	}

}
