/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a09;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int b,v;
        v=0;
        System.out.println("Bienvenido a la suma de matrices. ");
        System.out.println("Introduzca el tamaño de sus matrices horizontal y verticalmente");
        b=solicitarEntero();
       
        
        int [][]matrixa=new int[b][b];
        int [][]matrixb=new int[b][b];
        int [][]matrixc=new int[b][b];
        
        System.out.println("Introduzca los numero de su primera matriz");
        matrixa = matrix (b);
        System.out.println("Introduzca los numeros de su segunda matriz");
        matrixb = matrix(b);
        for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
           matrixc[i][j]=matrixa[i][j]+matrixb[i][j];
          System.out.println("La suma de las matrices en las coordenadas "+i+","+j+" es de "+matrixc[i][j]);
        }                        
                                
        }
    }
public static int [][] matrix(int b) {
    int [][]array=new int[b][b];
    for (int i=0;i<array.length;i++)
    {
     for (int j=0;j<array.length;j++)
     {
        array[i][j]=solicitarEntero(); 
     }
    }
    return array;    
    
}    
public static int solicitarEntero(){
    Scanner kb= new Scanner(System.in);
    boolean flag;
    int n=0;
    do{
        System.out.println("Introduce un numero entero");
        try{
        n=kb.nextInt();
        flag =false;        
    }catch (Exception er){
            System.out.println("Intentelo de nuevo");
            flag=true;
            kb.nextLine();
    }
    } while(flag);
    return n;
    }

    

}
