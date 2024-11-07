package com.luiz.dev.santander_dev_week.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public record Account(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        String id,
        @Column(unique = true)
        String number,
        @Column
        String agency,
        @Column(precision = 2, scale = 13)
        BigDecimal balance,
        @Column(precision = 2, scale = 13)
        BigDecimal accountLimit
) {
}
