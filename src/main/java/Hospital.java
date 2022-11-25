import java.util.ArrayList;

public class Hospital {
    private ArrayList<Persona>personas;

    public Hospital() {
        this.personas =new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return this.personas;
    }
    public ArrayList<Doctor> getDoctores(){
        ArrayList<Doctor>doctores=new ArrayList<>();
        for(Persona persona:this.personas){
            if(persona.getType().equals("Doctor")){
                doctores.add((Doctor) persona);
            }
        }
        return doctores;
    }

    public ArrayList<Paciente> getPacientes(){
        ArrayList<Paciente>pacientes=new ArrayList<>();
        for(Persona persona:this.personas){
            if(persona.getType().equals("Paciente")){
                pacientes.add((Paciente) persona);
            }
        }
        return pacientes;
    }
    public Doctor addDoctor(Doctor doctor){
        this.personas.add(doctor);
        return doctor;
    }

    public Paciente addPaciente(Paciente paciente){
        this.personas.add(paciente);
        return paciente;
    }
}
