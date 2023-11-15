package com.acheron.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "car_shop" ,schema = "caroot")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarShop implements com.acheron.db.model.Entity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
}
