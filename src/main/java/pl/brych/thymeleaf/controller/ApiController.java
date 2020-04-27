package pl.brych.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.brych.thymeleaf.model.Car;

@Controller
public class ApiController {


    @GetMapping("/car")
    public String getCar(Model model) {
        Car car = new Car("BMW", "i8");

        model.addAttribute("name", "Arkadiusz");
        model.addAttribute("car", car);
        return "car";
    }
}
