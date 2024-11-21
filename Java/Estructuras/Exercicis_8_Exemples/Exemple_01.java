

package Exercicis_8_Exemples;




public class Exemple_01 {
    

    


    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.nom = "Maria";
        p1.cognom = "Rossell";
        p1.dni = "12345678T";
        p1.mida = 165;
        p1.pes = 70.5;
        
        p2.nom = "Antonio";
        
        System.out.println(p1.nom);
        System.out.println(p1.dni);
        
        System.out.println(p2.nom);
        System.out.println(p2.dni);
        

        System.out.printf("Hola %s %s amb dni: %s. Pesas %.2f i la teva talla es la %d\n",
                p1.nom, p1.cognom, p1.dni, p1.pes, p1.mida);
    }
    
   
    

    
}
