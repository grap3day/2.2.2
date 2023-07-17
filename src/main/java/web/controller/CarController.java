package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {
    private CarService service;

    @Autowired
    public void setCarService(CarService service) {
        this.service = service;
    }
    @GetMapping(value = "/cars")
    public String printAllCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", service.getCars(count));
        return "cars";
    }
}