package com.example.car_rental.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pracownik {

    private String imie;

    private String nazwisko;

    private String stanowisko;

    private String oddział,_w_którym_pracuje;
}
