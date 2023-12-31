package com.example.demo.Service;

import com.example.demo.Entity.HistoryEntity;
import com.example.demo.Repo.HistoryRepo;
import org.springframework.stereotype.Service;

@Service
public class HistorySerivce {


    private final HistoryRepo repo;

    public HistorySerivce(HistoryRepo repo) {
        this.repo = repo;
    }

    public void save(HistoryEntity history){repo.save(history);}

    public Iterable<HistoryEntity> getAll(){return repo.findAll();}

    public void del(Long id){repo.deleteById(id);}



}
