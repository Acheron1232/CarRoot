package com.acheron.db.model;

import com.acheron.db.type.Role;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(schema = "caroot")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users implements com.acheron.db.model.Entity<Long>  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String firstname;
    String lastname;
    String password;
    @Enumerated(value = EnumType.STRING)
    Role role;
}
