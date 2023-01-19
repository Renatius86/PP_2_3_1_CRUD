package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class CarController {

    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", "V6", "red");
        Car car2 = new Car("VW", "V6", "blue");
        Car car3 = new Car("Audi", "V6", "red");
        Car car4 = new Car("Peugeot", "V4", "grey");
        Car car5 = new Car("Mazda", "V3", "green");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars = cars.stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", cars);

        return "/cars";
    }

}
