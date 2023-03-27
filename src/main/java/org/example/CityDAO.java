package org.example;

import java.util.List;

public interface CityDAO {
    void add(City city);

    City getById(int id);

    List<City> allCity();

    void updateCity(City city);

    void deleteCity(City city);
}
