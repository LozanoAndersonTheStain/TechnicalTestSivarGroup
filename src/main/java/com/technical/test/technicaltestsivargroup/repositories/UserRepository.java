package com.technical.test.technicaltestsivargroup.repositories;

import com.technical.test.technicaltestsivargroup.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
