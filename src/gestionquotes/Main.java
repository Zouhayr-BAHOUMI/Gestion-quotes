/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionquotes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in) ;
       int choix ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. ajouter une quote");
            System.out.println("2. afficher une quote");
            System.out.println("1. modifier une quote");
            System.out.println("2. supprimer une quote");
            System.out.println("3. Quitter");
            System.out.print("Entrer votre choix: ");
            
            if (cl.hasNextInt()){
                choix= cl.nextInt();
                switch (choix) {
                  case 1:
                        
                  break;
                  case 2:
                        
                  break;
                  case 3:
                      System.out.println("Programme terminé.");
                      cl.close();
                      System.exit(0);
                      break;
                  default:
                      System.out.println("Choix invalide  réessayer.");
            }
            }else {
               System.out.println("entrer une nombre.");
               cl.next();
            }
    }
       
    }
    
}
