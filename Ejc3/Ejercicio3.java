package Ejc3;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio3 {
    public void ejc3Controller(){
        Ubicacion u1 = new Ubicacion(150, "Tokyo");
        Ubicacion u2 = new Ubicacion(250, "New York");
        Ubicacion u3 = new Ubicacion(50, "Paris");
        Ubicacion u4 = new Ubicacion(350, "Seul");
        Ubicacion u5 = new Ubicacion(450, "San Francisco");
        Ubicacion u6 = new Ubicacion(250, "Londres");
        Ubicacion u7 = new Ubicacion(75, "Moscu");
        Ubicacion u8 = new Ubicacion(120, "Buenos Aires");
        Ubicacion u9 = new Ubicacion(230, "Madrid");
        Ubicacion u10 = new Ubicacion(275, "Roma");
        Ubicacion u11 = new Ubicacion(320, "Berlin");
        Ubicacion u12 = new Ubicacion(380, "Hong Kong");
        List<Ubicacion> U = new LinkedList<>();
        U.add(u1); U.add(u2); U.add(u3); U.add(u4);
        U.add(u5); U.add(u6); U.add(u7); U.add(u8);
        U.add(u9); U.add(u10); U.add(u11); U.add(u12);
        Empresa e = new Empresa(U);
        int [] arreglo = new int[5]; arreglo[0] = 150;arreglo[1] = 280;
        arreglo[2] = 230;arreglo[3] = 75;arreglo[4] = 375;
        String[] s = e.ciudadesEntrega(arreglo);
        System.out.println("Las sucursales a encargarse son: ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] +" ");
        }

    }
}
