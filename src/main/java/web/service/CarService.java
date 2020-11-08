package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList = createCarsAndFillCarList();

    public CarService() {
    }

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    private List<Car> createCarsAndFillCarList() {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("ZAZ", 969, "USSR"));
        list.add(new Car("VAZ", 2108, "USSR"));
        list.add(new Car("MAN", 525, "Germany"));
        list.add(new Car("FIAT", 600, "Italy"));
        list.add(new Car("LOTUS", 7, "GreatBritain"));
        return list;
    }

    public List<Car> getSelectedCars(int count) {
        List<Car> cars = new ArrayList<>();
        if (count > 0 && count < getCarList().size()) {
            cars = getCarList().subList(0, count);
        } else if (count >= getCarList().size()) {
            cars = getCarList().subList(0, getCarList().size());
        }
        return cars;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
