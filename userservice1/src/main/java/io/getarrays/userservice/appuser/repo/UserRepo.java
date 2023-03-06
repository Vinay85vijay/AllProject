package io.getarrays.userservice.appuser.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.getarrays.userservice.appuser.AppUser;
@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {
   AppUser findByUsername(String userName);
}
