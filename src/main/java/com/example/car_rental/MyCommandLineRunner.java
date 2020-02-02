package com.example.car_rental;

import com.example.car_rental.domain.Samochod;
import com.example.car_rental.enums.Kolor;
import com.example.car_rental.enums.Marka;
import com.example.car_rental.enums.Model;
import com.example.car_rental.enums.TypNadwozia;
import com.example.car_rental.repositories.SamochodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final SamochodRepository samochodRepository;


    public MyCommandLineRunner(SamochodRepository samochodRepository) {
        this.samochodRepository = samochodRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("dupa");

        samochodRepository.save(new Samochod(null,  Marka.FORD, Model.FOCUS,TypNadwozia.HATCHBACK, 2013, Kolor.BIALY));
        samochodRepository.save(new Samochod(null, Marka.OPEL, Model.ASTRA, TypNadwozia.HATCHBACK, 2019, Kolor.CZERWONY));
        samochodRepository.save(new Samochod(null, Marka.NISSAN, Model.GTR, TypNadwozia.LIFTBACK, 2019, Kolor.CZARNY));

        List<Samochod> wszystkie = samochodRepository.findAll();

        System.out.println();
    }
}
