package com.springprj.myartistlist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Chỉ định HomeController là Controller
public class HomeController {
    // Khi user truy cập vào endpoint / thì homepage() được gọi
    @GetMapping("/")
    public String homepage() {
        return "index"; // Trả về trang index.html
    }

    // Có thể mapping thêm các endpoint khác nữa...
}