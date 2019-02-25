package com.company.project.models;

import org.springframework.data.repository.CrudRepository;
import com.company.project.models.YpcOrderInfo;

import javax.transaction.Transactional;

public interface YpcOrderInfoRepository extends CrudRepository<YpcOrderInfo, Integer> {


}
