package io.getarrays.userservice.appuser.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.getarrays.userservice.appuser.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	   Role findByName(String name); 

}
