package com.xvitcoder.springmvcangularjs.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 11:12 PM
 */
public interface CarService {
    public List<String> getAllCars();

    public void addCar(String car);

    public void deleteCar(String car);

    public void deleteAll();
}
