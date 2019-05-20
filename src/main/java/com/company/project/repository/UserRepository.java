package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import com.company.project.models.User;
import com.company.project.models.YpcUsers;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<YpcUsers, Integer> {

}//end