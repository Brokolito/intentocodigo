public class Doctor extends  Persona {
    public Doctor(String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
    }
    public String getType(){
        return "Paciente";
    }
}
