package com.crudspring.main.Direccion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.crudspring.main.Usuario.UsuarioEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class, 
    property = "direccionId"
)
@Entity
@Table(name = "direccion")
public class DireccionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long direccionId;
    @Column
    public String calle;
    @Column
    public String colonia;
    @Column
    public String ciudad;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "fk_Usuario")
    public UsuarioEntity usuario;

    public DireccionEntity() {
    }

    public DireccionEntity(long direccionId, String calle, String colonia, String ciudad, UsuarioEntity usuario) {
        this.direccionId = direccionId;
        this.calle = calle;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.usuario = usuario;
    }

    public long getDireccionId() {
        return this.direccionId;
    }

    public void setDireccionId(long direccionId) {
        this.direccionId = direccionId;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return this.colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public UsuarioEntity getUsuario() {
        return this.usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

}
