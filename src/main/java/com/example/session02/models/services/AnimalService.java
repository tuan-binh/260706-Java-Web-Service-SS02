package com.example.session02.models.services;

import com.example.session02.models.entities.Animal;
import com.example.session02.models.repositories.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {

    // Tiêm repository vào service
    // Tiên sẽ có 3 loại để tiêm
    // Autowired
    //

    // field
//    @Autowired
//    private AnimalRepository animalRepository;

    // setter
//    private AnimalRepository animalRepository;
//
//    @Autowired
//    public void setAnimalRepository(AnimalRepository animalRepository) {
//        this.animalRepository = animalRepository;
//    }


    // constructor -> khuyên dùng - bắt buộc thuộc tính tiêm phải là final
    private final AnimalRepository animalRepository;

//    @Autowired
//    public AnimalService(AnimalRepository animalRepository) {
//        this.animalRepository = animalRepository;
//    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public List<Animal> searchAnimalByName(String search) {
        return animalRepository.searchAnimalByName(search);
    }

}

