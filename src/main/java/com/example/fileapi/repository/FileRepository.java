package com.example.fileapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileapi.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Integer>{

}
