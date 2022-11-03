package main.Test;

import main.model.Patient;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class PatientTest {

    @Test
    public void siDNIEsMenorACero_RetornaFalse(){
        //GIVEN
        Patient pacient= new Patient(1,"juan","perez","laprida 500",-1, LocalDate.now());


        //WHEN
        boolean respuesta= pacient.dniValid();


        //THEN
        Assertions.assertFalse(respuesta);
    }


    @Test
    public void siDNIEsMayorACero_RetornaTrue(){
        //GIVEN
        Patient pacient= new Patient(2,"juan","perez","laprida 500",1, LocalDate.now());


        //WHEN
        boolean respuesta= pacient.dniValid();


        //THEN
        Assertions.assertTrue(respuesta);
    }
}
