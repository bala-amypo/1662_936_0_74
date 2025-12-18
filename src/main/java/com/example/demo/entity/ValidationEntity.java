package com.example.demo.Entity
import jakarta.presistence.Entity;

@Entity
public class ValidationEntity{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNul
}