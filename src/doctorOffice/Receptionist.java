package doctorOffice;


//Receptionist class (Controller)
public class Receptionist {
private AppointmentManager appointmentManager;

public Receptionist(AppointmentManager appointmentManager) {
   this.appointmentManager = appointmentManager;
}

public void scheduleAppointment(Patient patient, Doctor doctor, String date) {
   appointmentManager.createAppointment(patient, doctor, date);
}
}