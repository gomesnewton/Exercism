import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,dateFormatter);
    }

    
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.toLocalTime().isAfter(LocalTime.of(11,59,59)) && appointmentDate.toLocalTime().isBefore(LocalTime.of(18,0,0));    
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy, 'at' h:mm a.").format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
