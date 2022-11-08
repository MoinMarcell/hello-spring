import com.github.moinmarcell.hellospring.model.Car;
import com.github.moinmarcell.hellospring.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Car bmw = new Car("BMW", 4, false);

        carService.addCar(bmw);

        System.out.println(carService.getCars());
    }
}
