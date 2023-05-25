package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> carsList = new ArrayList<>();
    private static Long count = 0L;

    {
        carsList.add(new Car(++count, "Lada1", 1));
        carsList.add(new Car(++count, "Lada2", 2));
        carsList.add(new Car(++count, "Lada3", 3));
        carsList.add(new Car(++count, "Lada4", 4));
        carsList.add(new Car(++count, "Lada5", 5));
    }

    public void addCarInCarList(String model, int series) {
        carsList.add(new Car(++count, model, series));
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
