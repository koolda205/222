package web.controller;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/cars)"
public class CarsController {

	private final CarDao carDao;

	public CarsController(CarDao carDao) {
		this.carDao = carDao;
	}

	@GetMapping()
	public String index (Model model) {
		model.addAttribute("cars", carDao.index());
		return "cars/index";
	}

	@GetMapping("/{id}")
	public String show (@PathVariable("id") int id, Model model) {
		model.addAttribute("cars", carDao.show(id));
		return "cars/show";
	}

}