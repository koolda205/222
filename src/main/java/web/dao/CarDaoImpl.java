//package web.dao;
//
//import web.model.Car;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class CarDaoImpl implements CarDao {
//
//    private List<Car> cars;
//
//    {
//        cars = new ArrayList<>();
//
//        cars.add(new Car(1L, "Lada1", 1));
//        cars.add(new Car(2L, "Lada2", 2));
//        cars.add(new Car(3L, "Lada3", 3));
//        cars.add(new Car(4L, "Lada4", 4));
//        cars.add(new Car(5L, "Lada5", 5));
//    }
//
//
//
//    @Override
//    public List<Car> index() {
//        return cars;
//    }
//
//    @Override
//    public Car show(Long id) {
//        return cars.stream().filter(cars -> cars.getId() == id).findAny().orElse(null);
//    }
//
//}
