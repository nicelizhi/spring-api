package com.company.project.models;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.company.project.models.YpcUsers;

public interface YpcUsersRepository extends CrudRepository<YpcUsers, Integer> {

    // 通过username 来查找用户
    List <YpcUsers> findByUserName(String userName);

}
