package com.hedima.motorplantilla.servicio;


import com.hedima.motorplantilla.modelo.Zoo;
import com.hedima.motorplantilla.repositorio.IZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZooService implements IZooService{
    @Autowired
    private IZooRepo repo;
    @Override
    public Zoo obtenerUno(int i) {
        return repo.findById(i).orElse(new Zoo());
    }
}
