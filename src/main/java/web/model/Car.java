package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String engine;
    private String color;
    private List<Car> cars;

    public Car() {

    }

    public Car(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
