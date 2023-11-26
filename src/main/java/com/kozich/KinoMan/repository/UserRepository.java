package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
