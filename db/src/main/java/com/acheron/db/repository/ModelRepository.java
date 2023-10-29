package com.acheron.db.repository;

import com.acheron.db.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {

    public List<Model> findModelsByBrandId(Long id);
}
