package com.acheron.service.service;

import java.util.List;
import java.util.Optional;

public interface Service<T,I>{

    public List<T> findAll();

    public Optional<T> findById(I id);

    public T save(T object);

    public T update(I id,T object);

    public boolean delete(I id);

}
