package com.example.session02.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // constructor khong tham so
@AllArgsConstructor // constructor day du tham so
@Getter // sinh ra cac getter cua cac thuoc tinh
@Setter // sinh ra cac setter cua cac thuoc tinh
public class Animal {
    private Long id;
    private String name;
    private String color;
}
