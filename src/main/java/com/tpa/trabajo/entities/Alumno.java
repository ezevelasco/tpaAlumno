package com.tpa.trabajo.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "alumno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Alumno extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "foto")
    private byte foto;
}
