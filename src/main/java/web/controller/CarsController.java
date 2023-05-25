package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) Long count,
                               ModelMap modelMap) {

        modelMap.addAttribute("cars", carService.getCarlist(count));
        return "cars";
    }
}
//    List<Car> cars = carsList;
//        this.count = (Long) count;
//                if (count >= 1 && count <= 5) {
//                for (int i = 0; i < count; i++)
//        cars.add(carsList.get(i));
//        modelMap.addAttribute("cars", cars);
//        } else if (count == null || count < 0 || count > 5) {
//        cars.add((Car) carsList);
//        modelMap.addAttribute("cars", cars);
//        }
//
//        return "cars";
//        }

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

