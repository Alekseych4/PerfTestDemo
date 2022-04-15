package com.example.perftestdemo.repo;

import com.example.perftestdemo.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {

    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO test (`name`) VALUES (:name);", nativeQuery = true)
    void insert(String name);

    @Modifying
    @Query(value = "DELETE FROM test;", nativeQuery = true)
    void removeAll();
}
