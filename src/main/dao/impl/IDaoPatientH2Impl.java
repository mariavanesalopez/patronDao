package main.dao.impl;

import main.dao.IDaoPatient;
import main.model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class IDaoPatientH2Impl implements IDaoPatient {
  private final static String DB_JDBC_DRIVER = "org.h2.Driver";
  private final static String DB_URL = "jdbc:h2:~/h2-database-patient;INIT=RUNSCRIPT FROM 'create.sql'";
  private final static String DB_USER = "root";
  private  final static String DB_PASSWORD = "";


  final static Logger LOGGER= Logger.getLogger(IDaoPatientH2Impl.class);

    @Override
    public void guardarPatient(Patient patient) {
        Connection connection= null;
        DriverManager driverManager= null;
        PreparedStatement preparedStatementInsert = null;
        PreparedStatement preparedStatementCreate = null;

        try {
            Class.forName(DB_JDBC_DRIVER).getDeclaredConstructor().newInstance();
            connection= driverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            preparedStatementCreate = connection.prepareStatement(
                    ""
            );

            // connection.createStatement().execute("SHUTDOWN");

          preparedStatementInsert = connection.prepareStatement(
                  "INSERT INTO patiente (id, name, lastName, address, dni, fechaAlta) " +
                          "VALUES (?,?,?,?,?,?)"
          );

          preparedStatementInsert.setInt(1, patient.getId());
          preparedStatementInsert.setString(2,patient.getName());
          preparedStatementInsert.setString(3,patient.getLastName());
          preparedStatementInsert.setString(4, patient.getAddress());
          preparedStatementInsert.setInt(5, patient.getDni());
          preparedStatementInsert.setDate(6, Date.valueOf(patient.getFechaAlta()));

          preparedStatementInsert.execute();
          preparedStatementInsert.close();

            LOGGER.info(connection.getClientInfo());
        }catch (Exception exception){
            LOGGER.error("error !!", exception);

        }

        LOGGER.info("Esto es un mensaje informativo");
        LOGGER.error("Esto es un error");



    }

    @Override
    public Patient buscarPatient(int id) {
        return null;
    }

}
