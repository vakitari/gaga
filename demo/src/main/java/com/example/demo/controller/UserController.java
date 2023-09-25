package com.example.demo.controller;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Response.BaseResponse;
import com.example.demo.Response.UserResponse;
import com.example.demo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    private UserController (UserService service){this.service = service;}

    @GetMapping("/all")
    public ResponseEntity<BaseResponse> findAll() {return ResponseEntity.ok(new UserResponse(service.getAll()));}


    @PostMapping("/add")
    public ResponseEntity<BaseResponse> add(@RequestBody UserEntity user){
        service.add(user);
        return ResponseEntity.ok(new BaseResponse(true, "Пользователь добавлен"));
    }
    @DeleteMapping("/del")
    public ResponseEntity<BaseResponse> del(@RequestParam Long id){
        service.del(id);
        return ResponseEntity.ok(new BaseResponse(true,"удалено"));}
}
