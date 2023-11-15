package com.acheron.service.dto;

import com.acheron.db.type.Role;
import lombok.*;
import org.springframework.context.annotation.Bean;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDto implements Dto{

    Long id;
    String firstname;
    String lastname;
    String username;
    String password;
    Role role;

    public UsersDto(String firstname, String lastname, String username, String password, Role role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
