package com.example.recyclerview23032021;

import java.util.Arrays;
import java.util.Objects;

public class Food {
    private boolean status;
    private int image;
    private String name;
    private String address;
    private String[] salesOff;

//    alt + inset
    public Food(boolean status, int image, String name, String address, String[] salesOff) {
        this.status = status;
        this.image = image;
        this.name = name;
        this.address = address;
        this.salesOff = salesOff;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getSalesOff() {
        return salesOff;
    }

    public void setSalesOff(String[] salesOff) {
        this.salesOff = salesOff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return status == food.status &&
                image == food.image &&
                Objects.equals(name, food.name) &&
                Objects.equals(address, food.address) &&
                Arrays.equals(salesOff, food.salesOff);
    }


    @Override
    public String toString() {
        return "Food{" +
                "status=" + status +
                ", image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salesOff=" + Arrays.toString(salesOff) +
                '}';
    }
}
