package com.example.web.servicio;



import com.example.web.modelo.Zoo;
import com.example.web.repositorio.IZooRepo;
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
