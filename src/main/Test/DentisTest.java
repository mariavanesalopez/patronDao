package main.Test;

import main.model.Dentist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class DentisTest {
    @Test
    public void tuituinValid_RetornaFalse(){
        Dentist dentist= new Dentist(1,"maria","perez","m1p");


        //WHEN
        boolean respuesta= dentist.tuitionValid();


        //THEN
        Assertions.assertFalse(respuesta);
    }


    @Test
    public void tuituinValid_RetornaTrue(){
        Dentist dentist= new Dentist(2,"florencia","luna","abc123");


        //WHEN
        boolean respuesta= dentist.tuitionValid();


        //THEN
        Assertions.assertTrue(respuesta);
    }
}
