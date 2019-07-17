package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{

        Car car = new Car("Mustang", "Ford", 1964, "Created a new class of automobile the pony car.");
        repository.save(car);

        car = new Car("Corevette", "Chevrolet", 2018, "front engine, rear drive, two passenger sports car.");
        repository.save(car);

        car = new Car("740i", "BMW", 2018, "Six petrol engine 8-Speed Engine .");
        repository.save(car);
    }
}
