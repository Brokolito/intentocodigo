public class Paciente extends Persona{
    String idPaciente;
    public Paciente(String nombre, String apellido, String rut, String idPaciente) {
        super(nombre, apellido, rut);
        this.idPaciente=idPaciente;
    }
    public String getIdPaciente(){
        return this.idPaciente;
    }
    public String getType(){
        return "Paciente";
    }
}
