package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private List<Car> carsList = new ArrayList<>();
    private static Long count = 0L;

    {
        carsList.add(new Car(++count, "Lada1", 1));
        carsList.add(new Car(++count, "Lada2", 2));
        carsList.add(new Car(++count, "Lada3", 3));
        carsList.add(new Car(++count, "Lada4", 4));
        carsList.add(new Car(++count, "Lada5", 5));
    }

    @GetMapping()
    public String printWelcome(@RequestParam(value = "count", required = false) Long count,
                               ModelMap modelMap) {
        ArrayList<Car> cars = (ArrayList<Car>) carsList;
        this.count = count;
        if (count == null || count <= 0 || count > 5) {
            modelMap.addAttribute("cars", cars);
        } else if (count >= 1 && count <= 5) {
            ArrayList<Car> cars2 = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                cars2.add(cars.get(i));
                modelMap.addAttribute("cars", cars2);
            }
        }
        return "cars";
    }
}


