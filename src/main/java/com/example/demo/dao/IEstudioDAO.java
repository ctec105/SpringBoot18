package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Estudio;

@Repository
public interface IEstudioDAO extends JpaRepository<Estudio, Long> {

}
