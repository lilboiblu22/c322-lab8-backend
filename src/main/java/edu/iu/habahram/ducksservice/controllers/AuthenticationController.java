package edu.iu.habahram.ducksservice.controllers;

import edu.iu.habahram.ducksservice.model.Customer;
import edu.iu.habahram.ducksservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/signup")
public class AuthenticationController {

    CustomerRepository customerRepository;

    public AuthenticationController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public void signUp(@RequestBody Customer customer) throws Exception {
        try {
            customerRepository.save(customer);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
