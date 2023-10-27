package com.acheron.db.repository;

import com.acheron.db.model.Brand;
import com.acheron.db.model.CarDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDescriptionRepository extends JpaRepository<CarDescription,Long> {
}
