package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCarlist(Long count) {
        List<Car> cars = carDao.getCarsList();
        List<Car> cars2 = new ArrayList<>();
        if (count == null || count <= 0 || count > 5) {
            return cars;
        } else {
            for (int i = 0; i < count; i++) {
                cars2.add(cars.get(i));
            }
        }
        return cars2;
    }
}


