package io.getarrays.userservice.appuser.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.getarrays.userservice.appuser.AppUser;
import io.getarrays.userservice.appuser.Role;
import io.getarrays.userservice.appuser.repo.RoleRepo;
import io.getarrays.userservice.appuser.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {
     private  UserRepo userRepo ;
     private  RoleRepo  roleRepo;
	
	@Override
	public AppUser saveUser(AppUser user) {
		
		return userRepo.save(user);
		
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		 AppUser user = userRepo.findByUsername(userName);
		 Role role = roleRepo.findByName(roleName);
		 
		  
		 
	}

	@Override
	public AppUser getUser(String userName) {
		return userRepo.findByUsername(userName);
	}

	@Override
	public List<AppUser> getUser() {
		return userRepo.findAll();
	}

}
