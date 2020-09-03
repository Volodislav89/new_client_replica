package com.spring_cloud.new_client_replica.repository;

import com.spring_cloud.new_client_replica.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
}
