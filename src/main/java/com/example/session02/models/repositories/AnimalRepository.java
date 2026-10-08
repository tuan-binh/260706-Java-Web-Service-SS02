package com.example.session02.models.repositories;

import com.example.session02.models.entities.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class AnimalRepository {

    List<Animal> animals = new ArrayList<>(
            Arrays.asList(
                    new Animal(1L, "Sư tử", "Cam"),
                    new Animal(2L, "Voi", "Xám"),
                    new Animal(3L, "Đà điểu", "Đen"),
                    new Animal(4L, "Khỉ", "Vàng")
            )
    );

    public List<Animal> findAll() {
        return animals;
    }

    public List<Animal> searchAnimalByName(String search) {
        return animals.stream()
                .filter(a -> a.getName().contains(search))
                .toList();
    }

}
