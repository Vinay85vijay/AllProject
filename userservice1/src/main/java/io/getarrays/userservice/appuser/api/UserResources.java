package io.getarrays.userservice.appuser.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.getarrays.userservice.appuser.AppUser;
import io.getarrays.userservice.appuser.service.UserService;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResources {
 private  UserService userService;
 @GetMapping("/users")
 public ResponseEntity<List<AppUser>>getUsers() {
	return ResponseEntity.ok().body(userService.getUser());
	
}
}
