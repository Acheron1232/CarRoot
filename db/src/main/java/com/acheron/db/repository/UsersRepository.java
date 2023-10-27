package com.acheron.db.repository;

import com.acheron.db.model.CarDescription;
import com.acheron.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
