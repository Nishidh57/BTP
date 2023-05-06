package com.example.facebookapi.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Users;




@Repository

public interface UserRepo extends CrudRepository<Users, Integer> {
	
	Users save(Users user);
	Users findByUserId(String userId);

}
