package com.tpa.trabajo.services;

import com.tpa.trabajo.entities.Alumno;

import java.util.List;

public interface AlumnoService extends BaseService<Alumno, Long> {

    List<Alumno> search(String filtro) throws Exception;


}
