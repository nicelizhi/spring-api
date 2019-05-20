package com.company.project.repository;

import org.springframework.data.repository.CrudRepository;
import com.company.project.models.YpcTopic;


public interface YpcTopicRepository extends CrudRepository<YpcTopic, Iterable> {
}
