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
        String mPlayer1, mPlayer2, mPos1, mPos2;
        int mAux, mVer, mHor;
        String[][] mArreglo =  new String[3][3];
        
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
                System.out.println("Turno de "+ mPlayer2);
                System.out.println("Ingrese posicion vertical");
                mPos1 = mValor.nextLine();
                System.out.println("Ingrese posicion vertical");
                mPos2 = mValor.nextLine();
                
                mVer=Integer.parseInt(mPos1);
                mHor=Integer.parseInt(mPos2);
                
                mArreglo[mHor][mVer]= " O ";
                
            }else{
                System.out.println("Turno de "+ mPlayer1);
                System.out.println("Ingrese posicion vertical");
                mPos1 = mValor.nextLine();
                System.out.println("Ingrese posicion vertical");
                mPos2 = mValor.nextLine();
                
                mVer=Integer.parseInt(mPos1);
                mHor=Integer.parseInt(mPos2);
                
                mArreglo[mHor][mVer]=" X ";
            }
        }
        
        System.out.println("-----------------------------");
        System.out.println("| "+mArreglo[0][0]+" | "+mArreglo[0][1]+" | "+mArreglo[0][2]+" |");
        System.out.println("-----------------------------");
        System.out.println("| "+mArreglo[1][0]+" | "+mArreglo[1][1]+" | "+mArreglo[1][2]+" |");
        System.out.println("-----------------------------");
        System.out.println("| "+mArreglo[2][0]+" | "+mArreglo[2][1]+" | "+mArreglo[2][2]+" |");
        System.out.println("-----------------------------");
        
        
    }
    
}
