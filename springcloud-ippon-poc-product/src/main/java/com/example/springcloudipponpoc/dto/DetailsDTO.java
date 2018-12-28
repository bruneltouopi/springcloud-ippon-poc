package com.example.springcloudipponpoc.dto;

/**
 * Created by fabrice on 12/26/18.
 */
public class DetailsDTO {
    private String name;

    public DetailsDTO(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
