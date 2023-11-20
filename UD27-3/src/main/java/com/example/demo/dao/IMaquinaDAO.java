package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.MaquinaRegistradora;

public interface IMaquinaDAO extends JpaRepository<MaquinaRegistradora, Integer> {

}
