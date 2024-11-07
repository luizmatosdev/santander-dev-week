package com.luiz.dev.santander_dev_week.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.awt.*;
import java.util.List;

@Entity
public record User(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        String id,
        @Column(nullable = false)
        String name,
        @OneToOne(cascade = CascadeType.ALL)
        Account account,
        @OneToOne(cascade = CascadeType.ALL)
        Card card,
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        List<Feature> features,
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        List<News> images
) {
}
