package com.oleg.oleg.Models;

import com.opencsv.bean.CsvBindByName;

public class Car {
    @CsvBindByName(column = "Год выпуска")
    private int year;

    @CsvBindByName(column = "Название")
    private String name;

    @CsvBindByName(column = "Пробег")
    private int mileage;

    @CsvBindByName(column = "Объём двигателя")
    private double engineCapacity;

    @CsvBindByName(column = "Количество владельцев")
    private int ownersCount;

    @CsvBindByName(column = "Номер")
    private String number;

    @CsvBindByName(column = "Цвет")
    private String color;

    @CsvBindByName(column = "Цена")
    private int price;

    public Car(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getOwnersCount() {
        return ownersCount;
    }

    public void setOwnersCount(int ownersCount) {
        this.ownersCount = ownersCount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", mileage=" + mileage +
                ", engineCapacity=" + engineCapacity +
                ", ownersCount=" + ownersCount +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
