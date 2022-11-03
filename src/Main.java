import main.model.Patient;
import main.service.PatientService;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

public class Main {

    private static final Logger LOGGER= Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Patient patient = new Patient(1, "vane", "lopez","mejico", 22333111, LocalDate.now());
        PatientService patientService = new PatientService();
        patientService.guardar(patient);
              

     }


    }
