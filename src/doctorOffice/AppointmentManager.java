package doctorOffice;

import java.util.ArrayList;
import java.util.List;

//AppointmentManager class (Creator and Low Coupling)
public class AppointmentManager {
	
 private List<Appointment> appointments = new ArrayList<>();

 public void createAppointment(Patient patient, Doctor doctor, String date) {
     Appointment appointment = new Appointment(patient, doctor, date);
     appointments.add(appointment);
     Appointment.showAppointment(appointment); // Static method
 }

 public List<Appointment> getAppointments() {
     return appointments;
 }
}