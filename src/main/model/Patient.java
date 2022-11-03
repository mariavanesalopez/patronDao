package main.model;

import java.sql.Date;
import java.time.LocalDate;

public class Patient {
    private  Integer id;
    private String name;
    private String lastName;
    private String address;
    private int dni;
    private LocalDate fechaAlta;


    public Patient() {
    }

    public Patient(Integer id, String name, String lastName, String address, int dni, LocalDate fechaAlta) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    public boolean dniValid(){
        return this.dni>0;
    }
}
