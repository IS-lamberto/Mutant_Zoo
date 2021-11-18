package com.kob.components.DAO;

import com.kob.components.Appointment;
import com.kob.components.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentDAO {

    @Autowired
    private AppointmentRepository repo;
   

    public Appointment getAppointmentById(int id) {
        System.out.printf("AppointmentDAO.getAppointmentById(%s)\n", id);
        return repo.findById(id).orElseGet(null);
    }

    public Iterable<Appointment> getAllAppointments() {
        System.out.println("AppointmentDAO.getAllAppointments()");
        return repo.findAll();
    }

    public void saveAppointment(Appointment appointment) {
        System.out.printf("AppointmentDAO.saveAppointment(%s)\n", appointment);
        repo.save(appointment);
    }

    public void deleteAppointment(Appointment appointment) {
        System.out.printf("AppointmentDAO.deleteAppointment(%s)\n", appointment);
        repo.delete(appointment);
    }
}
