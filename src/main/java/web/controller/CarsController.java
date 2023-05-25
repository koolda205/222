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

    private List<Car> cars = new ArrayList<>();
    private static Long count;

    {
        cars.add(new Car(++count, "Lada1", 1));
        cars.add(new Car(++count, "Lada2", 2));
        cars.add(new Car(++count, "Lada3", 3));
        cars.add(new Car(++count, "Lada4", 4));
        cars.add(new Car(++count, "Lada5", 5));
    }

//    @GetMapping()
//    public String printWelcome(@RequestParam(value = "count", required = false) Long count,
//                               ModelMap modelMap) {
//        this.count = (Long) count;
//        if (count == null || count >= 5) {
//            modelMap.addAttribute("cars", cars);
//        } else {
//            for (int i = 0; i <= count; i++)
//                modelMap.addAttribute("cars", cars.get(i));
//        }
//        return "cars";
//    }
//}


//    @GetMapping()
//    public String printWelcome(@RequestParam(value = "model", required = false) String model,
//                               @RequestParam(value = "series", required = false) int series,
//                               ModelMap modelMap) {
//        modelMap.addAttribute("cars", cars);
//        return "cars";
//    }
//}

    @GetMapping()
//    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        model.addAttribute("cars", cars);
        return "cars";
    }
}

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

