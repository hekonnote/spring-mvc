package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;
    private int series;
    private String country;

    public Car() {
    }

    public Car(String name, int series, String country) {
        this.name = name;
        this.series = series;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", country='" + country + '\'' +
                '}';
    }
}
