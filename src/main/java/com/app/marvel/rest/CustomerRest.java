package com.app.marvel.rest;

import com.app.marvel.model.Customer;
import com.app.marvel.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CustomerRest {

    private CustomerService customerService;

    @GetMapping("/get-customer")
    ResponseEntity<Customer> getCustomer(@RequestParam (name="userId") String userId) throws URISyntaxException {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
