package ru.javavision.model;

import lombok.Data;

import java.util.Objects;

/**
 * Author : Pavel Ravvich.
 * Created : 26/11/2017.
 */
public class Car {

    private int id;

    private String mark;

    private String model;

    private Engine engine;

    public Car() {
    }

    public Car(int id, String mark, String model, Engine engine) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(mark, car.mark) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
