package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


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


