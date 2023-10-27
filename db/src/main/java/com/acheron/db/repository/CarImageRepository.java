package com.acheron.db.repository;

import com.acheron.db.model.CarDescription;
import com.acheron.db.model.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarImageRepository extends JpaRepository<CarImage,Long> {
}
