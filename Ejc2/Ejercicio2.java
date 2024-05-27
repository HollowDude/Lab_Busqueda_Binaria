package Ejc2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public void Ejc2Controller(){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int [] Cumple = new int[20];
        for (int i = 0; i < Cumple.length; i++) {
            int random = ran.nextInt(50)+1;
            Cumple[i] = random;
        }
        Arrays.sort(Cumple);
        for (int i = 0; i < Cumple.length; i++) {
            System.out.print(Cumple[i]+" ");
        }
        System.out.println("");
        System.out.println("Inserte el inicio del rango");
        int a = scan.nextInt();
        System.out.println("Inserte el final del rango");
        int b = scan.nextInt();
        System.out.println("El menor numero del arreglo en ese rango es "+ menorEnRango(Cumple,a,b));
    }

    public int menorEnRango(int[] arr, int inir, int finr){
        int in = 0, fin = arr.length - 1, mid=0;
        while(in <= fin){
            mid = (in + fin)/2;
            if(arr[mid] == inir){
                return arr[mid];
            }
            if(arr[mid] < inir){
                in = mid++;
            }else{
                fin = mid--;
            }
        }
        return arr[in];
    }
}
