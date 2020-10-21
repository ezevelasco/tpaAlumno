package com.tpa.trabajo.services;

import com.tpa.trabajo.entities.Alumno;
import com.tpa.trabajo.repositories.AlumnoRepository;
import com.tpa.trabajo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno,Long> implements AlumnoService {


    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Alumno> search(String filtro) throws Exception {
        try{
            return null;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}