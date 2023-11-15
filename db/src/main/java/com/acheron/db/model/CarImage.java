package com.acheron.db.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(schema = "caroot")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarImage implements com.acheron.db.model.Entity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Car car;
    String ref;
}
