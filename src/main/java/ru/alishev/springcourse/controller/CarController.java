package ru.alishev.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.alishev.springcourse.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String car(Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford","Mustang"));
        cars.add(new Car("Plymouth","Cuda"));
        cars.add(new Car("Dodge","Charger"));
        cars.add(new Car("Pontiac","GTO"));
        cars.add(new Car("Chevrolet","Camaro"));
        model.addAttribute("carmesage",cars);
        return "car/car";
    }
}
