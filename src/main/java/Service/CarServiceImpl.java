package Service;

import dao.CarDao;
import hiber.model.Car;
import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Car show(int id) {
       return carDao.show(id);
    }

}
