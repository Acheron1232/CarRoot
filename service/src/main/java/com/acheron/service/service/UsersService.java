package com.acheron.service.service;

import com.acheron.service.dto.CarDto;
import com.acheron.service.dto.UsersDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsersService implements com.acheron.service.service.Service<UsersDto,Long> {


    @Override
    public List<UsersDto> findAll() {
        return null;
    }

    @Override
    public Optional<UsersDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UsersDto save(UsersDto object) {
        return null;
    }

    @Override
    public UsersDto update(Long id, UsersDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
