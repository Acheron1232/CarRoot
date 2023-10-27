package com.acheron.db.repository;

import com.acheron.db.model.CarShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarShopRepository extends JpaRepository<CarShop,Long> {
}
