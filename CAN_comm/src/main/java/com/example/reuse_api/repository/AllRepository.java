package com.example.reuse_api.repository;

import com.example.reuse_api.entity.AllStoreData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AllRepository extends JpaRepository<AllStoreData, String> {
}

