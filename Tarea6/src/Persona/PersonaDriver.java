package Persona;

public class PersonaDriver {
    public static void main (String[] args){
        Persona p1 = new Persona(17, "Camila", 1.57, 55, "femenino");
        System.out.println(p1);
        p1.despertar();
        p1.estirarse();
        p1.caminar();
    }

}
