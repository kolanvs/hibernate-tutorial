package ru.javavision.model;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * Author : Pavel Ravvich.
 * Created : 26/11/2017.
 */
public class Engine {

    private String model;

    private int power;

    public Engine() {

    }


    public Engine(String model, int power) {
        Engine engine = new Engine();
        engine.model = model;
        engine.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power);
    }
}
