

package Exercicis_8_Exemples;

import java.util.Scanner;

public class Exemple_02 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        

        Persona alumnes[] = new Persona[1];
        Persona alumne;
        
        for (int i = 0; i < alumnes.length; i++) {
        
            alumne = new Persona();
            
            System.out.printf("Alumne %d: \n", i + 1);
            System.out.print("Nom: ");
            alumne.nom = sc.nextLine();
            
            System.out.print("Cognom: ");
            alumne.cognom = sc.nextLine();
            
            System.out.print("Dni: ");
            alumne.dni = sc.nextLine();
            
            System.out.print("Mida: ");
            alumne.mida = sc.nextInt();
            
            System.out.print("Pes: ");
            alumne.pes = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            
            alumnes[i] = alumne;
        }
        
        System.out.println(alumnes[0]);
        
//        System.out.println("Llistat d'alumnes\n");
//        System.out.printf("%20s %20s %10s %5s %6s\n",
//                "Nom", "Cognom", "Dni", "Talla", "Pes");
//        
//        for (int i = 0; i < alumnes.length; i++) {
//        
//            System.out.printf("%20s %20s %10s %5d %6.2f\n",
//                    alumnes[i].nom, alumnes[i].cognom, alumnes[i].dni,
//                    alumnes[i].mida, alumnes[i].pes);
//        }
    }
}
