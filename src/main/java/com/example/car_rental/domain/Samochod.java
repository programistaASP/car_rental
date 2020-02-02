package com.example.car_rental.domain;

import com.example.car_rental.enums.Kolor;
import com.example.car_rental.enums.Marka;
import com.example.car_rental.enums.Model;
import com.example.car_rental.enums.TypNadwozia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Samochod {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
