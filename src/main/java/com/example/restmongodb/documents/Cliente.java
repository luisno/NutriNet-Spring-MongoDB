package com.example.restmongodb.documents;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("cliente")
public class Cliente {

    @Transient
    public static final String SEQUENCE_NAME="cliente_sequence";

    @Id
    Integer clienteID;
    String nombreUsuario;
    String contraseña;
    String nombre;
    String apellidos;
    String correoElectronico;
    Integer edad;
    double estatura;
    double peso;
    @JsonProperty("IMC")
    double IMC;
    @JsonProperty("GEB")
    double GEB;
    @JsonProperty("ETA")
    double ETA;
    Date fechaCreacion;
    Date fechaActualizacion;

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    @JsonSetter("IMC")
    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getGEB() {
        return GEB;
    }

    @JsonSetter("GEB")
    public void setGEB(double GEB) {
        this.GEB = GEB;
    }

    public double getETA() {
        return ETA;
    }

    @JsonSetter("ETA")
    public void setETA(double ETA) {
        this.ETA = ETA;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
