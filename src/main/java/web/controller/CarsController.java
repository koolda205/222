package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<Car> cars = carsList;
        this.count = (Long) count;
        if (count >= 1 && count <= 5) {
            for (int i = 0; i < count; i++)
                cars.add(carsList.get(i));
            modelMap.addAttribute("cars", cars);
        } else if (count == null || count < 0 || count > 5) {
            cars.add((Car) carsList);
            modelMap.addAttribute("cars", cars);
        }

        return "cars";
    }
}


//    @GetMapping()
//    public String printWelcome(@RequestParam(value = "model", required = false) String model,
//                               @RequestParam(value = "series", required = false) int series,
//                               ModelMap modelMap) {
//        modelMap.addAttribute("cars", cars);
//        return "cars";
//    }
//}

//    @GetMapping()
////    @GetMapping(value = "/cars")
//    public String printWelcome(ModelMap model) {
//        model.addAttribute("cars", cars);
//        return "cars";
//    }
//}

//	@GetMapping("/cars")
//	public String index (Model model) {
//		model.addAttribute("cars", carDao.index());
//		return "cars";
//	}
//
//	@GetMapping("/{id}")
//	public String show (@PathVariable("id") Long id, Model model) {
//		model.addAttribute("cars", carDao.show(id));
//		return "cars";
//	}
//

