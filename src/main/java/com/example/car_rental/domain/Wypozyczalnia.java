package com.example.car_rental.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wypozyczalnia {

    @NotNull
    private String nazwa ;

    @NotNull
    private String domena_internetowa;

    private String adres_kontaktowy;

    private String lista_oddziałów ;

    private String właściciel;

}
