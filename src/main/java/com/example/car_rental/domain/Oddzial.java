package com.example.car_rental.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oddzial {

    private String adres;

    private String lista_pracowników_placowki;

    private String lista_aktualnie_dostępnych_aut;

}
