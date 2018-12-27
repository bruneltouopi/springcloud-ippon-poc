package com.example.springcloudipponpoc.dto;

/**
 * Created by fabrice on 12/26/18.
 */
public class PricingDTO {
    private String name;

    public PricingDTO(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
