package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    //    public String getHTMLSelectedCars(HttpServletRequest request, Model model) {
    //        String count = request.getParameter("count");

    public String getHTMLSelectedCars(@RequestParam(value = "count", required = false) String count, Model model) {

        List<Car> cars;
        if (count == null) {
            cars = carService.getCarList();
            model.addAttribute("cars", cars);
//            cars.forEach(System.out::println);
        } else {
            if (Integer.parseInt(count) > 0) {
                cars = carService.getSelectedCars(Integer.parseInt(count));
                model.addAttribute("cars", cars);
//                cars.forEach(System.out::println);
            } else {
                System.out.println("The request contains no parameters");
            }
        }
        return "/cars";
    }
}
