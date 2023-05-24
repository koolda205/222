package web.controller;

import web.dao.CarDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
		return "cars";
	}

	@GetMapping("/{id}")
	public String show (@PathVariable("id") Long id, Model model) {
		model.addAttribute("cars", carDao.show(id));
		return "cars";
	}

}