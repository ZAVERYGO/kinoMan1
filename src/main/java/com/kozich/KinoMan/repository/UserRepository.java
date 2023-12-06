package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
