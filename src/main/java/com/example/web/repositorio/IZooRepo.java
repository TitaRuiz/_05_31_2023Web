package com.example.web.repositorio;


import com.example.web.modelo.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IZooRepo extends JpaRepository<Zoo,Integer> {
}
