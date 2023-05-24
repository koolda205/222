package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public Car show(int id) {
        return cars.stream().filter(cars -> cars.getId() == id).findAny().orElse(null);
    }

}
