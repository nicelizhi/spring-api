package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import com.company.project.models.YpcAdminUser;

public interface YpcAdminUserRepository extends CrudRepository<YpcAdminUser, Integer> {
}
