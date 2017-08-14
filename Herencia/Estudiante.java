package Herencia;

public class Estudiante extends Persona{
    
    protected String carrera;
    protected String matricula;

    public Estudiante(String carrera, String matricula, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }  

    public void estudiar(){
        System.out.println("'"+nombre+"' esta estudiando.");
    }
    
    public void hacerExamen(){
        System.out.println("'"+nombre+"' esta realizando un examen.");
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
