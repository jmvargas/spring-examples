package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "Address")
public class Address {
    private int idAddress;

    private String street;

    public Address() {
    }

    @Autowired
    public Address(@Value("1") int idAddress, @Value("Calle San Juan") String street) {
        this.idAddress = idAddress;
        this.street = street;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "idAddress=" + idAddress +
                ", street='" + street + '\'' +
                '}';
    }
}
