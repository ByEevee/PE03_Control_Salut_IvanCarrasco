import java.util.InputMismatchException;
import java.util.Scanner;
public class Control_Salut {
public static void main(String[] args) {
    //declarar variables
    
    String nomComplet;
    String opcioTriada, tornarAlMenu;
    int edat;
    double pes,alçada;
    Scanner esc = new Scanner(System.in);
    boolean dadesIntroduides = false;
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
                System.out.println(" ");
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
                else if (nomComplet.matches("[a-zA-ZÀ-ÿ\\s]"))// si el nom no conté només lletres i espais
                {
                System.out.println("ERROR: El nom no pot contenir números.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                break;
                }
    
                try {
                System.out.println(" ");
                System.out.println("Introdueix la teva edat:");
                edat = esc.nextInt();
                    if (edat <= 0 || edat > 120) 
                    {
                        System.out.println("ERROR: L'edat és massa gran o petita.");
                        System.out.println("");
                        System.out.println("Tornant al menú principal...");
                        System.out.println("");
                        break;
                    }
                }       
                catch (InputMismatchException e) 
                {
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
                

                try {
                    System.out.println(" ");
                    System.out.println("Introdueix el teu pes (en kg):");
                    String entrada = esc.next().replace(',', '.'); 
                    pes = Double.parseDouble(entrada);

                    // Validar rango
                    if (pes <= 0 || pes > 400) {
                        System.out.println("ERROR: El pes ha d'estar entre 0 i 400 kg.");
                        System.out.println("");
                        System.out.println("Tornant al menú principal...");
                        System.out.println("");
                        break;
                    }

                    // Validar decimals (máxim 3)
                    if ((pes *1000) % 1 != 0) {
                        System.out.println("ERROR: El pes no pot tenir més de 3 decimals.");
                        System.out.println("");
                        System.out.println("Tornant al menú principal...");
                        System.out.println("");
                        break;
                    }


                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("ERROR: Format de número incorrecte.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    break;
                }
                catch (Exception e) 
                {
                    System.out.println("Error: Introdueix un valor vàlid per al pes.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    break;
                        
                }
                            
                                
                try {
                        System.out.println(" ");
                        System.out.println("Introdueix la teva alçada (en metres, pots usar coma o punt):");

                        String entrada = esc.next().replace(',', '.'); 
                        alçada = Double.parseDouble(entrada);

                        if (alçada <= 0.5) 
                        {
                            System.out.println("ERROR: L'alçada és massa petita.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            break;
                        } 
                        else if (alçada > 2.5) 
                        {
                            System.out.println("ERROR: L'alçada és massa gran, ha d'estar entre 0.5-2.5 metres.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            break;
                        }

                        // Validar màxim 3 decimals
                        
                        if (alçada * 1000 % 1 != 0)
                        {
                            System.out.println("ERROR: L'alçada no pot tenir més de 3 decimals.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            break;
                        }

                        

                } catch (Exception e)
                {
                    System.out.println("Error: Introdueix un valor vàlid per a l'alçada.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    break;
                }
                
                    System.out.println(" ");
                    System.out.println("Dades introduides correctament!");
                    System.out.println(" ");
                    dadesIntroduides = true; // Marca que les dades han estat introduïdes

                    

                    System.out.println("vols tornar al menú principal? (si/no)");
                    tornarAlMenu = esc.next();
                    if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                        esc.nextLine(); 
                        break; // Torna al menú principal
                    } else {
                        System.out.println("Sortint del programa...");
                        esc.close();
                        System.exit(0);
                        ; // Sortir del programa
                    }

          
    
           
     }

    }
    
    
     
    

}
}



