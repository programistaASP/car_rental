package com.example.car_rental.repositories;

import com.example.car_rental.domain.Samochod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamochodRepository extends JpaRepository<Samochod, Integer> {
}
