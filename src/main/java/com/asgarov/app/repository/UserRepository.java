package com.asgarov.app.repository;

import com.asgarov.app.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
