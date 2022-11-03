package main.dao;

import main.model.Patient;

public interface IDaoPatient {
    void  guardarPatient(Patient patient);
    Patient buscarPatient(int id);
}
