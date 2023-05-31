package com.hedima.motorplantilla.repositorio;


import com.hedima.motorplantilla.modelo.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IZooRepo extends JpaRepository<Zoo,Integer> {
}
