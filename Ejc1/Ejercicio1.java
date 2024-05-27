package Ejc1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {


    public void ejc1Controller(){
        Random ran = new Random();
        int [] noCumple = new int[20];
        int [] Cumple = new int[20];
        for (int i = 0; i < noCumple.length; i++) {
            noCumple[i] = ran.nextInt(50);
            System.out.print(noCumple[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            int random = ran.nextInt(20)+1;
            Cumple[i] = random;
            Cumple[19-i] = random*5;
        }
        for (int i = 0; i < Cumple.length; i++) {
            System.out.print(Cumple[i]+" ");
        }
        System.out.println("");
        Arrays.sort(noCumple);
        Arrays.sort(Cumple);
        System.out.println("El primer arreglo es cociente modulo 5? " + conjuntoCocienteModuloP(5, noCumple));
        System.out.println("El segundo arreglo es cociente modulo 5? " + conjuntoCocienteModuloP(5, Cumple));
    }
    public boolean conjuntoCocienteModuloP(int p, int[] s){
        for (int a : s) {
            if(!(BB(p*a,s)) && !(BB(a/p,s))){
                return false;
            }
        }
        return true;
    }
    
    public boolean BB(int x, int[] arr){
        int in = 0, fin = arr.length - 1;
        while(in <= fin){
            int mid = (in + fin)/2;
            if(arr[mid] == x){
                return true;
            }
            if(arr[mid] > x){
                fin = mid--;
            }else{
                in = mid++;
            }
        }
        return false;
    }
}
