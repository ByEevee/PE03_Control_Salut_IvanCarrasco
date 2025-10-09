import java.util.InputMismatchException;
import java.util.Scanner;
@SuppressWarnings("UseOfSystemOutOrErr")

public class Control_Salut {
public static void main(String[] args) {
    //declarar variables
    
    String nomComplet;
    String opcioTriada, tornarAlMenu;
    int edat;
    double pes,alçada;
    Scanner esc = new Scanner(System.in);
    while (true) //Bucle infinit per tornar al menu principal 
    {
    //inicialitzar menu 
    System.out.println("------------------------------");
    System.out.println("Benvingut al nostre programa de Control de Salut");
    System.out.println("------------------------------");
    //Mostrar opcions per pantalla
    
        System.out.println("Que vols fer?");
    System.out.println("a) Introduir dades personals");
    System.out.println("b) Modificar dades personals");
    System.out.println("c) Veure dades personals");
    System.out.println("d) Sortir del programa");
    opcioTriada = esc.nextLine();

    //Anar a la opcio triada
        switch (opcioTriada) 
        {
            case "a", "a)", "A", "A)", "Introduir dades personals", "introduir dades personals", "a) Introduir dades personals", "A) Introduir dades personals", "a) introduir dades personals", "A) introduir dades personals":
                
                System.out.println("Has triat l'opcio: Introduir dades personals");
                System.out.println("Introdueix el teu nom complet:");
                nomComplet = esc.nextLine();
            
                if (nomComplet.trim().isEmpty()) {
                System.out.println("ERROR: El nom no pot estar buit.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                break;
                }
                 // es salta tot el codi i aleshores el bucle while torna al menú principal

                else if (nomComplet.length() > 50) {
                System.out.println("ERROR: El nom és massa llarg.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                break;
            
                }
                else if (!nomComplet.matches("[a-zA-ZÀ-ÿ\\s]"))// si el nom no conté només lletres i espais
                {
                System.out.println("ERROR: El nom no pot contenir números.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                break;
                }
           
        

            System.out.println("Introdueix la teva edat:");
            try {
            edat = esc.nextInt();
            esc.nextLine(); // neteja el buffer
            if (edat <= 0 || edat > 120) {
                System.out.println("ERROR: L'edat és massa gran o petita.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                break;
            }
            }       
            catch (InputMismatchException e) {
                System.out.println("Edat no pot ser decimal ni text.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
            
            break; 
            
            }
            catch (Exception e) 
            {
                System.out.println("Error: Introdueix un valor vàlid per a l'edat.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                           
                break;
        }


                System.out.println(" ");
                System.out.println("Introdueix el teu pes (en kg):");
                pes = esc.nextDouble();
                if (pes <= 0) 
                {
                    System.out.println("ERROR: El pes és massa petit.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    
                    break;
                    
                }
                else if (pes > 400) 
                {
                    System.out.println("ERROR: El pes és massa gran.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    
                    break;
                    
                
                }
                else if (pes // menys o 2 decimals
                        != Math.round(pes * 100.0) / 100.0)
                {
                    System.out.println("ERROR: El pes és massa petit.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    
                    break;
                    
                }
                { 
                System.out.println(" ");
                System.out.println("Introdueix la teva alçada (en metres):");
                alçada = esc.nextDouble();
                System.out.println(" ");
                System.out.println("Dades introduides correctament!");
                System.out.println(" ");
                System.out.println("Nom complet: " + nomComplet);
                System.out.println("Edat: "  + " anys");
                System.out.println("Pes: " + pes + " kg");
                System.out.println("Alçada: " + alçada + " metres");

                System.out.println("vols tornar al menú principal? (si/no)");
                tornarAlMenu = esc.next();
                if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                    esc.nextLine(); // consume newline left by next()
                    break; // Torna al menú principal
                } else {
                    System.out.println("Sortint del programa...");
                    esc.close();
                    return; // Sortir del programa
                }

          
    
           
     }

    }
    
    
     
    

}
}
}


