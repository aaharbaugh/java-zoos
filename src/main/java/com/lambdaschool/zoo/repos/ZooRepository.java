package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
