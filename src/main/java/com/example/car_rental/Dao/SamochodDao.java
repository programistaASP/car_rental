package com.example.car_rental.Dao;

import com.example.car_rental.domain.Samochod;
import com.example.car_rental.enums.Kolor;
import com.example.car_rental.enums.Marka;
import com.example.car_rental.enums.Model;
import com.example.car_rental.enums.TypNadwozia;

import java.util.ArrayList;
import java.util.List;

public class SamochodDao {

    public Samochod getOne() {
        Samochod samochod = new Samochod(null, Marka.FORD, Model.FOCUS, TypNadwozia.HATCHBACK, 2001, Kolor.CZARNY);
        return samochod;
    }

    public List<Samochod> getAll() {
        List<Samochod> furki = new ArrayList<Samochod>();
        furki.add(new Samochod(null, Marka.NISSAN, Model.GTR, TypNadwozia.LIFTBACK, 2019, Kolor.CZARNY));
        furki.add(new Samochod(null, Marka.OPEL, Model.GTR, TypNadwozia.LIFTBACK, 2019, Kolor.CZARNY));
        furki.add(new Samochod(null, Marka.DODGE, Model.GTR, TypNadwozia.LIFTBACK, 2019, Kolor.CZARNY));
        furki.add(new Samochod(null, Marka.NISSAN, Model.GTR, TypNadwozia.LIFTBACK, 2019, Kolor.CZARNY));
        return furki;

    }
}
