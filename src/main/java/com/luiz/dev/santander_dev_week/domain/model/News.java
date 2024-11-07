package com.luiz.dev.santander_dev_week.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public record News(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        String id,
        @Column
        String icon,
        @Lob
        String description
) {
}
