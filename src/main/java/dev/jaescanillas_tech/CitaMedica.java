package dev.jaescanillas_tech;

public class CitaMedica {
    private String fecha;
    private String hora;
    private String medico;
    private String estadoAtencion;

    public CitaMedica() {
        this.fecha = "20-08-2026";
        this.hora = "10:30";
        this.medico = "Dr. Pérez";
        this.estadoAtencion = "Pendiente";
    }

    public CitaMedica(String fecha, String hora, String medico, String estadoAtencion) {
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.estadoAtencion = estadoAtencion;
    }

    public boolean confirmarCita() {
        return true;
    }

    public void cancelarCita() {

    }

    public void registrarLlegadaPaciente() {

    }
}
