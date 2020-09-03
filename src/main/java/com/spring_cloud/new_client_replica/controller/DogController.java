package com.spring_cloud.new_client_replica.controller;

import com.spring_cloud.new_client_replica.model.Dog;
import com.spring_cloud.new_client_replica.service.DogService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RefreshScope
@RequestMapping("/dog/cloud")
public class DogController {
    DogService dogService;

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @PostMapping
    public Dog saveNewDog(@RequestBody Dog dog) {
        return dogService.saveNewDog(dog);
    }
}
