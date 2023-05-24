package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> index() {
        return carDao.index();
    }

    @Override
    public Car show(Long id) {
       return carDao.show(id);
    }

}
