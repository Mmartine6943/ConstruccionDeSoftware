package Herencia;

public class Main {
    
    public static void main(String[] Args) {
        Estudiante e1 = new Estudiante("Ing. Sistemas", "1234", "Mauricio", 39);
        Estudiante e2 = new Estudiante("Ing. Sistemas", "4567", "Jorge", 38);
        e1.comer(); //Comportamiento heredado de persona
        e1.dormir(); //Comportamiento herdado de persona
        e1.estudiar(); //Comportamiento basico de Estudiante
        e1.hacerExamen(); //Comportamiento basico de Estudiante
        e2.comer(); //Comportamiento heredado de persona
        e2.dormir(); //Comportamiento heredado de persona
        e2.estudiar(); //Comportamiento basico de Estudiante
        e2.hacerExamen(); //Comportamiento basico de Estudiante
    }
    
}
