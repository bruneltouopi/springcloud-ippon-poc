package com.example.springcloudipponpoc.rest;

import com.example.springcloudipponpoc.dto.DetailsDTO;
import com.example.springcloudipponpoc.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by fabrice on 12/26/18.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient dc;

    @RequestMapping(value = "/{id}", method = GET)
    public ProductDTO find(@PathVariable String id) {
        /* do something here */
        return new ProductDTO(id);
    }

    @GetMapping(value = "/details/{id}")
    public DetailsDTO findDetails(@PathVariable String id) throws MalformedURLException {
        /* do something here */
        String url = dc.getInstances("details-service").get(0).getUri().toString();
        return restTemplate.getForObject(url,DetailsDTO.class);
    }


}