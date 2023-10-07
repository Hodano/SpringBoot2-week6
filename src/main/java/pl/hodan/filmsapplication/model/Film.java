package pl.hodan.filmsapplication.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Film {
    @NotNull
    @Size(min = 2)
    private String name;
    @NotNull
    @Min(1500)
    private int year;
    @NotNull
    @Size(min = 2)
    private String producer;

    public Film(String name, int year, String producer) {
        this.name = name;
        this.year = year;
        this.producer = producer;
    }

    public Film() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
