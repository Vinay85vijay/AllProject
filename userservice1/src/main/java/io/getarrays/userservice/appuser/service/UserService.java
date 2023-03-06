package io.getarrays.userservice.appuser.service;


import java.util.List;

import io.getarrays.userservice.appuser.AppUser;
import io.getarrays.userservice.appuser.Role;

public interface UserService {
	AppUser saveUser(AppUser user);
	Role saveRole(Role role);
	void addRoleToUser(String userName,String roleName);
	AppUser getUser(String userName);
	List<AppUser> getUser();
	
}
