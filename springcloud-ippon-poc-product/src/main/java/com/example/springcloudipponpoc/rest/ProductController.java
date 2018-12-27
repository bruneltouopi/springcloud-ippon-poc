package com.example.springcloudipponpoc.rest;

import com.example.springcloudipponpoc.dto.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by fabrice on 12/26/18.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value = "/{id}", method = GET)
    public ProductDTO find(@PathVariable String id) {
        /* do something here */
        return new ProductDTO(id);
    }
}