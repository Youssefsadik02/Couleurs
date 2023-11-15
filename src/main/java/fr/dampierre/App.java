package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier=new Scanner (System.in);
        System.out.print("Quelle couleur souhaitez-vous?");
        String lettre= clavier.next();
        clavier.close();
        System.out.println( couleurs(lettre));


    }
    public static String couleurs ( String lettre) {
        String couleur="";
        if (lettre.equals("r") || lettre.equals("R")){
          couleur="Vous avez choisi le rouge";    
        }
        else if (lettre.equals("b") || lettre.equals("B")) {
            couleur="Vous avez choisi le bleu"; 
            
        } 
        else if (lettre.equals("v") || lettre.equals("V")){
            couleur="Vous avez choisi le vert";
        }
        else {
            couleur="connais pas";
        }
         
        return couleur;    
        } 
 }    

