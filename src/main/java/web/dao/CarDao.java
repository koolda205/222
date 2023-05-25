package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    void addCarInCarList(String model, int series);

    List<Car> getCarsList();
}
