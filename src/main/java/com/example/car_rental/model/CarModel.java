package com.example.car_rental.model;

import com.example.car_rental.enums.Kolor;
import com.example.car_rental.enums.Marka;
import com.example.car_rental.enums.Model;
import com.example.car_rental.enums.TypNadwozia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarModel {
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Marka marka;

    @Enumerated(EnumType.STRING)
    private Model model;

    @Enumerated(EnumType.STRING)
    private TypNadwozia typNadwozia;

    private int rocznik;

    @Enumerated(EnumType.STRING)
    private Kolor kolor;
}
