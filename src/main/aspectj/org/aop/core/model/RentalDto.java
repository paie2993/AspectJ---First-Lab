package org.aop.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RentalDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("address")
    private String address;

    @JsonProperty("price")
    private int price;

    public RentalDto(
            @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("address") final String address,
            @JsonProperty("price") final int price
    ) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.price = price;
    }

    public RentalDto(
            @JsonProperty("id") final int id,
            @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("address") final String address,
            @JsonProperty("price") final int price
    ) {
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

    public Rental toModel() {
        return new Rental(this.name, this.description, this.address, this.price);
    }

    public static RentalDto fromModel(final Rental rental) {
        return new RentalDto(rental.id(), rental.name(), rental.description(), rental.address(), rental.price());
    }
}
