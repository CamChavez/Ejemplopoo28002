package Libro;

public class LibroDriver {
    public static void main (String[] args){
        Libro l1 = new Libro("media carta","dura", 527 , "times new roman", "romantico");
        System.out.println(l1);
        l1.abrir();
        l1.elegir();
        l1.cerrar();
    }
}
