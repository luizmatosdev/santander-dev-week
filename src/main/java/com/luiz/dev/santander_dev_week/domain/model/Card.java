package com.luiz.dev.santander_dev_week.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public record Card(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        String id,
        @Column
        String number,
        @Column(precision = 13, scale = 2)
        BigDecimal creditLimit
) {
}
