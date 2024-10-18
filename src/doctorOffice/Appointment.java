package doctorOffice;
//Appointment class (High Cohesion)

public class Appointment {
 private Patient patient;
 private Doctor doctor;
 private String date;

 public Appointment(Patient patient, Doctor doctor, String date) {
     this.patient = patient;
     this.doctor = doctor;
     this.date = date;
 }

 public String getDetails() {
     return "Appointment with Dr. " + doctor.getName() + " on " + date + " for " + patient.getName(); 
 }
 
 static public void showAppointment(Appointment appointment) {
	   System.out.println(appointment.getDetails());
	}
}            
