import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    
    public LocalDateTime schedule(String appointmentDateDescription) {

        String year = appointmentDateDescription.substring(appointmentDateDescription.lastIndexOf("/")+1, appointmentDateDescription.indexOf(" "));
        String day = appointmentDateDescription.substring(appointmentDateDescription.indexOf("/")+1, appointmentDateDescription.lastIndexOf("/"));
        String mount = appointmentDateDescription.substring(0, appointmentDateDescription.indexOf("/"));

        String hour = appointmentDateDescription.substring(appointmentDateDescription.indexOf(" ")+1,appointmentDateDescription.indexOf(":"));
        String minutes = appointmentDateDescription.substring(appointmentDateDescription.indexOf(":"), appointmentDateDescription.lastIndexOf(":"));
        String seconds = appointmentDateDescription.substring(appointmentDateDescription.lastIndexOf(":"));

        String ftdate = String.format("%s-%s-%s %s%s%s", year, mount, day, hour, minutes, seconds);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(ftdate, df);
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
