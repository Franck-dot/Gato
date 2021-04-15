/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gato;
import java.util.Scanner;
/**
 *
 * @author Francisco
 */
public class Gato {
    public static void main(String[] args){
        Scanner mValor=new Scanner(System.in);
        String mPlayer1, mPlayer2, mGato;
        int mAux;
        String[][] mArreglo =  new String[3][3];
        
        mArreglo[1][1]="-";
        
        System.out.println("*************************************");
        System.out.println("   Bienvenidos al juego del gato!!   ");
        System.out.println("*************************************");
        System.out.println("Ingrese el nombre del primer Jugador.....");
        mPlayer1=mValor.nextLine();
        System.out.println("Ingrese el nombre del segundo Jugador.....");
        mPlayer2=mValor.nextLine();
        System.out.println(mPlayer1 +" Juega con X y "+ mPlayer2 +" Juega con O");
        
        for(int i=1; i<=9; i++){
            mAux=i%2;
            if(mAux==0){
                System.out.println("Turno de "+ mPlayer1);
                mGato=mValor.nextLine();
                mArreglo[1][1]=mGato;
                System.out.println(mArreglo[1][1]);
            }else{
                System.out.println("Turno de "+ mPlayer2);
                mGato=mValor.nextLine();
                mArreglo[2][2]=mGato;
                System.out.println(mArreglo[2][2]);
            }
        }
        
        
    }
    
}
