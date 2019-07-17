package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String model;

    @NotNull
    @Size(min=3)
    private String make;

    @NotNull
    @Min(1700)
   // @Max(2025)
    private int year;

    @NotNull
    @Size(min = 5)
    private String description;

    public Car() {
    }

    public Car(@NotNull @Size(min = 3) String model,
               @NotNull @Size(min = 3) String make, @NotNull @Min(1700)
                int year, @NotNull @Size(min = 5)
                       String description) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
