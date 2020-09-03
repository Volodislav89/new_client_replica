package com.spring_cloud.new_client_replica.service;

import com.spring_cloud.new_client_replica.model.Dog;
import com.spring_cloud.new_client_replica.repository.DogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DogService {
    DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    public Dog saveNewDog(Dog dog) {
        return dogRepository.save(dog);
    }
}
