package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import com.company.project.models.YpcOrderInfo;
import com.company.project.models.YpcOrderGoods;

import javax.transaction.Transactional;
import java.util.List;

public interface YpcOrderInfoRepository extends CrudRepository<YpcOrderInfo, Integer> {

    public List<YpcOrderGoods> findById(long order_id);

    public List<YpcOrderGoods> findByUserId(long user_id);
}
