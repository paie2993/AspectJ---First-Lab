package org.aop.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Rental {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private String address;
    private int price;

    protected Rental() {
    }

    public Rental(final String name, final String description, final String address, final int price) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.price = price;
    }

    public Rental(final int id, final String name, final String description, final String address, final int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.price = price;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public String address() {
        return address;
    }

    public int price() {
        return price;
    }

    public void id(final int id) {
        this.id = id;
    }

    public void name(final String name) {
        this.name = name;
    }

    public void description(final String description) {
        this.description = description;
    }

    public void address(final String address) {
        this.address = address;
    }

    public void price(final int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " description: " + description + " address: " + address + " price: " + price;
    }
}
