package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Honda", "Fit", 2011));
        carList.add(new Car("Honda", "Accord", 2012));
        carList.add(new Car("Honda", "Civic", 2013));
        carList.add(new Car("Honda", "CR-V", 2014));
        carList.add(new Car("Honda", "Jazz", 2015));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
