package com.example.demo.Repo;

import com.example.demo.Entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepo extends JpaRepository<HistoryEntity, Long> {
}
