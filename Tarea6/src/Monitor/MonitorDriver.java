package Monitor;

public class MonitorDriver {
    public static void main(String[] args){
        Monitor m1 = new Monitor(24.7, "Phillips", "SIETE", "OLED", 5238);
        System.out.println(m1);
        m1.encender();
        m1.cargando();
        m1.ver();




    }
}
