package com.example.session02.controllers;

import com.example.session02.models.entities.Animal;
import com.example.session02.models.services.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/apps")
@RequiredArgsConstructor
public class AppController {
    private final AnimalService animalService;

    //    @RequestMapping("/home-restaurent")
//    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/messsage") // Biến thể của RequestMapping là phương thức GET
    public ResponseEntity<String> home() {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Hello World!");
    }

    //    @RequestMapping("/animals")
    @GetMapping("/animals")
    public ResponseEntity<?> findAll(@RequestParam(name = "search",defaultValue = "") String search) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.findAll());
    }

    // Giá trị trên đường dẫn sử dụng PathVariable
    // VD: /users/1 --> giá trị ở đây là 1
    @GetMapping("/animals/{animalId}")
    public ResponseEntity<?> findById(@PathVariable Long animalId) {
        System.out.println(animalId);
        return ResponseEntity.ok("Id = " + animalId);
    }

    // Tham số trên đường dẫn sử dụng RequestParam (Parameter) (Query)
    // VD: /users?key=value --> /users?search=NguyenHuyKhanh

    @GetMapping("/search")
    public ResponseEntity<?> searchAnimalByName(@RequestParam(name = "search",defaultValue = "") String search) {
        return ResponseEntity.ok(animalService.searchAnimalByName(search));
    }

    // RequestBody --> gửi dữ liệu dưới dạng JSON (gọn nhẹ nhanh -> ko gửi được file)
    // ModelAttribute --> gửi dữ liệu dạng form data (nặng hơn khi gửi thêm file vì phỉa biến nó thành binary)

    /*
        Xây dựng 1 chương trình quản lý sản phẩm (id, name, price, stock)
        - API lấy danh sách sản phẩm
        - API thêm mới sản phẩm
        - API xóa sản phẩm
        - API tìm kiếm sản phẩm (nâng cao hơn thì tích hợp luôn vào API lấy danh sách sản phẩm)
    */

}
