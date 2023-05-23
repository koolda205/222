package dao;

import model.Car;

import java.util.List;

public interface CarDao {

    List<Car> index();

    Car show(int id);

}
