package com.example.demo.Service;

import com.example.demo.Entity.HistoryEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo repo;

    public UserService(UserRepo repo){
        this.repo = repo;
    }
    public Iterable<UserEntity> getAll(){return repo.findAll();}
    public void add(UserEntity data){repo.save(data);}
    public void del(Long id){repo.deleteById(id);}

}
