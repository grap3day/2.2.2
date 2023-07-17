package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServicelmpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Car1", "Color1", 1000));
        carList.add(new Car("Car2", "Color2", 2000));
        carList.add(new Car("Car3", "Color3", 3000));
        carList.add(new Car("Car4", "Color4", 4000));
        carList.add(new Car("Car5", "Color5", 5000));
    }

    @Override
    public List<Car> getCars(int count) {
        if(count < 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
