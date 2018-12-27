package com.example.springcloudipponpoc.rest;

import com.example.springcloudipponpoc.dto.PricingDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by fabrice on 12/26/18.
 */
@RestController
@RequestMapping("/pricing")
public class PricingController {

    @RequestMapping(value = "/{id}", method = GET)
    public PricingDTO find(@PathVariable String id) {
        /* do something here */
        return new PricingDTO(id);
    }
}