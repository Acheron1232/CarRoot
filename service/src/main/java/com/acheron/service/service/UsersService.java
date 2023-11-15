package com.acheron.service.service;

import com.acheron.db.model.Users;
import com.acheron.db.repository.UsersRepository;
import com.acheron.db.type.Role;
import com.acheron.service.dto.UsersDto;
import com.acheron.service.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements com.acheron.service.service.Service<UsersDto,Long>, UserDetailsService {
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public List<UsersDto> findAll() {
        return usersRepository.findAll().stream().map(usersMapper::mapTo).toList();
    }

    @Override
    public Optional<UsersDto> findById(Long id) {
        return Optional.empty();
    }

    public Optional<UsersDto> findByUsername(String username) {
        return usersRepository.findByUsername(username).map(usersMapper::mapTo);
    }

    @Override
    public UsersDto save(UsersDto object) {
        System.out.println(object);
        String password = passwordEncoder.encode(object.getPassword());
        var user = Users.builder().
                firstname(object.getFirstname()).
                lastname(object.getLastname()).
                username(object.getUsername()).
                password(password).
                role(Role.USER).
                build();
        usersRepository.save(user);
        return usersMapper.mapTo(user);
    }

    @Override
    public UsersDto update(Long id, UsersDto object) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepository.findByUsername(username).map(u -> new User(u.getUsername(),u.getPassword(), Collections.singleton(u.getRole()))).
                orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
