package com.kob.components.DAO;

import com.kob.components.Appointment;
import com.kob.components.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentDAO {

    @Autowired
    private AppointmentRepository repo2;
   

    public Appointment getAppointmentById(int id) {
        System.out.printf("AppointmentDAO.getAppointmentById(%s)\n", id);
        return repo2.findById(id).orElseGet(null);
    }

    public Iterable<Appointment> getAllAppointments() {
        System.out.println("AppointmentDAO.getAllAppointments()");
        return repo2.findAll();
    }

    public void saveAppointment(Appointment appointment) {
        System.out.printf("AppointmentDAO.saveAppointment(%s)\n", appointment);
        repo2.save(appointment);
    }

    public void deleteAppointment(Appointment appointment) {
        System.out.printf("AppointmentDAO.deleteAppointment(%s)\n", appointment);
        repo2.delete(appointment);
    }
}
