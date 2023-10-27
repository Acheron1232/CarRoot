package com.acheron.db.repository;

import com.acheron.db.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWarehouseRepository extends JpaRepository<Brand,Long> {
}
