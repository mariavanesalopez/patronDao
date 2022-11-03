package main.service;

import main.dao.IDaoPatient;
import main.dao.impl.IDaoPatientH2Impl;
import main.model.Patient;

public class PatientService {
    private IDaoPatient daoPatient;

    public PatientService(){
        this.daoPatient= new IDaoPatientH2Impl();
    }

    public void guardar(Patient patient){
        daoPatient.guardarPatient(patient);
    }
}
