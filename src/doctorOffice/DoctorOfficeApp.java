package doctorOffice;


//Main class to run the application
public class DoctorOfficeApp {
 public static void main(String[] args) {
     // Create instances of Doctor, Patient, and Receptionist
     Doctor doctor = new Doctor("Grady Booch");
     Patient patient = new Patient("John Doe");
     AppointmentManager appointmentManager = new AppointmentManager();
     Receptionist receptionist = new Receptionist(appointmentManager);

     // Schedule an appointment
     receptionist.scheduleAppointment(patient, doctor, "2023-10-15");

     // You can schedule more appointments or implement additional logic as needed
 }
}