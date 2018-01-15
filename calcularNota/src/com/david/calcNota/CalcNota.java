
package com.david.calcNota;
import javax.swing.JOptionPane;
/**
 *
 * @author dfernandezguerreiro
 */
public class CalcNota {
    
    private static float probaEscrita1,probaEscrita2,totalProEscritas;
    public static void calcularProbasEscritas(){
        //float probaEscrita1,probaEscrita2,totalProEscritas;
        probaEscrita1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a nota da primeira proba : "));
        probaEscrita2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a nota da segunda proba : "));
        totalProEscritas=(probaEscrita1+probaEscrita2)/2;
        totalProEscritas=(totalProEscritas*40)/100;
        System.out.println("Probas teóricas : "+totalProEscritas);
    }
    
    private static float probaPractica,totalProPractica;
    public static void calcularProbaPractica(){
        //float probaPractica,totalProPractica;
        probaPractica=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a nota da proba práctica : "));
        totalProPractica=(probaPractica*40)/100;
        System.out.println("Probas prácticas : "+totalProPractica);
    }
    
    private static float boletins,puntuacionBoletins,totalBoletins;
    public static void calcularBoletins(){
        //float boletins,puntuacionBoletins,totalBoletins;
        boletins=Float.parseFloat(JOptionPane.showInputDialog("Introduzca porcentaxe dos boletíns entregados : "));
        if(boletins>90){
            puntuacionBoletins=2;
        }
        else if(boletins>=70 && boletins<=90){
            puntuacionBoletins=1;
        }else{
            puntuacionBoletins=0;
        }
        totalBoletins=(puntuacionBoletins*20)/100;
        System.out.println("Boletíns : "+totalBoletins);
    }
    
    public static float getNotaFinal(){
        return totalProEscritas+totalProPractica+totalBoletins;
    }
//    public static void amosarTotal(){
//        System.out.println("Nota total : "+(totalProEscritas+totalProPractica+totalBoletins));
//    }
    
}
