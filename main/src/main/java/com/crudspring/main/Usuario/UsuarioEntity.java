package com.crudspring.main.Usuario;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.crudspring.main.Direccion.DireccionEntity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class, 
    property = "idUsuario"
)
@Entity
@Table(name="usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idUsuario;
    @Column
    public String nombre;
    @Column
    public Integer edad;
   
    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    public List<DireccionEntity> direccionesUsuario;

    public UsuarioEntity(){}
    
    public UsuarioEntity(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public Long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<DireccionEntity> getDireccionesUsuario() {
        return this.direccionesUsuario;
    }

    public void setDireccionesUsuario(List<DireccionEntity> direccionesUsuario) {
        this.direccionesUsuario = direccionesUsuario;
    }


}
