package Ejc3;

import java.util.List;

public class Empresa {
    private List<Ubicacion> sucursales;

    public Empresa(List<Ubicacion> sucursales) {
        this.sucursales = sucursales;
    }

    public int[] ciudadesEntrega(int[] clientes){
        int[] ubiCl = new int[500];
        int[] ubiSu = new int[sucursales.size()];
        for(int i =0;i< sucursales.size(); i++){
            ubiSu[i] = sucursales.getCoordenadas();
        }
        int i = 0;
        for (int c : clientes) {
            if(BB(c,ubiSu)){
                ubiCl[i] = clientes[i];
            }
            i++;
        }
        
        return ubiCl;
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
