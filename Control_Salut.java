import java.util.InputMismatchException;
import java.util.Scanner;
public class Control_Salut { 
public static void main(String[] args) {
    //declarar variables
    
    String nomComplet = null;
    String opcioTriada, tornarAlMenu, elegirModificar;
    int edat = 0;
    double pes = 0,alçada = 0, imc = 0 ;
    Scanner esc = new Scanner(System.in);
    boolean dadesIntroduides = false, programa = true;


    while (programa) //Bucle infinit per tornar al menu principal 
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
            case "a", "a)", "A", "A)", "Introduir dades personals", "introduir dades personals", "a) Introduir dades personals", "A) Introduir dades personals", "a) introduir dades personals", "A) introduir dades personals" :
                
                System.out.println("Has triat l'opcio: Introduir dades personals");
                System.out.println(" ");
                System.out.println("Introdueix el teu nom complet:");
                nomComplet = esc.nextLine();
            
                if (nomComplet.trim().isEmpty()) {
                System.out.println("ERROR: El nom no pot estar buit.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                esc.nextLine();
                break;
                }
                 // es salta tot el codi i aleshores el bucle while torna al menú principal

                else if (nomComplet.length() > 50) {
                System.out.println("ERROR: El nom és massa llarg.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                esc.nextLine();
                break;
            
                }
                else if (nomComplet.matches("[a-zA-ZÀ-ÿ\\s]"))// si el nom no conté només lletres i espais
                {
                System.out.println("ERROR: El nom no pot contenir números.");
                System.out.println("");
                System.out.println("Tornant al menú principal...");
                System.out.println("");
                esc.nextLine();
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
                        esc.nextLine();
                        break;
                    }
                }       
                catch (InputMismatchException e) 
                {
                    System.out.println("Edat no pot ser decimal ni text.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
                    break;
                     
                
                }
                catch (Exception e) 
                {
                    System.out.println("Error: Introdueix un valor vàlid per a l'edat.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
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
                        esc.nextLine();
                        break;
                    }

                    // Validar decimals (máxim 3)
                    if ((pes *1000) % 1 != 0) {
                        System.out.println("ERROR: El pes no pot tenir més de 3 decimals.");
                        System.out.println("");
                        System.out.println("Tornant al menú principal...");
                        System.out.println("");
                        esc.nextLine();
                        break;
                    }


                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("ERROR: Format de número incorrecte.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
                    break;
                }
                catch (Exception e) 
                {
                    System.out.println("Error: Introdueix un valor vàlid per al pes.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
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
                            esc.nextLine();
                            break;
                        } 
                        else if (alçada > 2.5) 
                        {
                            System.out.println("ERROR: L'alçada és massa gran, ha d'estar entre 0.5-2.5 metres.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break;
                        }

                        // Validar màxim 3 decimals
                        
                        if (alçada * 1000 % 1 != 0)
                        {
                            System.out.println("ERROR: L'alçada no pot tenir més de 3 decimals.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break;
                        }

                        

                } catch (Exception e)
                {
                    System.out.println("Error: Introdueix un valor vàlid per a l'alçada.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
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
                        programa = false;
                         // Sortir del programa
                    }

          
    
            case "b", "b)", "B", "B)", "Modificar dades personals", "modificar dades personals", "b) Modificar dades personals", "B) Modificar dades personals", "b) modificar dades personals", "B) modificar dades personals":
                
                System.out.println("Has triat l'opcio: Modificar dades personals");
                System.out.println(" ");

                if (!dadesIntroduides) 
                {
                    System.out.println("No hi ha dades per modificar. Si us plau, introdueix les teves dades primer.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
                    break; // Torna al menú principal

                } 
                else 
                {
                    System.out.println("Quina dada vols modificar?");
                    System.out.println("1. Nom complet");
                    System.out.println("2. Edat");
                    System.out.println("3. Pes");
                    System.out.println("4. Alçada");
                    System.out.println("5. Tornar al menú principal");
                    elegirModificar = esc.nextLine();
                    switch (elegirModificar) {
                        case "1", "Nom complet", "nom complet", "1. Nom complet", "1) Nom complet", "1) nom complet", "Nom Complet", "NOM COMPLET":
                            
                            System.out.println(" ");
                            System.out.println("Introdueix el teu nom complet:");
                            nomComplet = esc.nextLine();
                        
                            if (nomComplet.trim().isEmpty()) {
                            System.out.println("ERROR: El nom no pot estar buit.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break;
                            }
                            // es salta tot el codi i aleshores el bucle while torna al menú principal

                            else if (nomComplet.length() > 50) {
                            System.out.println("ERROR: El nom és massa llarg.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break;
                        
                            }
                            else if (nomComplet.matches("[a-zA-ZÀ-ÿ\\s]"))// si el nom no conté només lletres i espais
                            {
                            System.out.println("ERROR: El nom no pot contenir números.");
                            System.out.println("");
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break;
                            }
                                 System.out.println(" ");
                                    System.out.println("Dada Modificada correctament!");
                                    System.out.println(" ");
                                    System.out.println("vols tornar al menú principal? (si/no)");
                                    tornarAlMenu = esc.next();
                                        if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                                            esc.nextLine(); 
                                            break; // Torna al menú principal
                                        } 
                                        else {
                                            System.out.println("Sortint del programa...");
                                            esc.close();
                                            programa = false;
                                            // Sortir del programa
                                        }
                                  
                            break;

                        case "2", "Edat", "edat", "2. Edat", "2) Edat", "2) edat", "EDAT":
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
                                        esc.nextLine();
                                        break;
                                    }
                                }       
                                catch (InputMismatchException e) 
                                {
                                    System.out.println("Edat no pot ser decimal ni text.");
                                    System.out.println("");
                                    System.out.println("Tornant al menú principal...");
                                    System.out.println("");
                                    esc.nextLine();
                                    break;
                                    
                                
                                }
                                catch (Exception e) 
                                {
                                    System.out.println("Error: Introdueix un valor vàlid per a l'edat.");
                                    System.out.println("");
                                    System.out.println("Tornant al menú principal...");
                                    System.out.println("");
                                    esc.nextLine();
                                    break;         
                                    
                                }
                                        System.out.println(" ");
                                            System.out.println("Dada Modificada correctament!");
                                            System.out.println(" ");
                                            System.out.println("vols tornar al menú principal? (si/no)");
                                            tornarAlMenu = esc.next();
                                                if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                                                    esc.nextLine(); 
                                                    break; // Torna al menú principal
                                                } 
                                                else {
                                                    System.out.println("Sortint del programa...");
                                                    esc.close();
                                                    programa = false;
                                                    ; // Sortir del programa
                                                }
                            case "3", "Pes", "pes", "3. Pes", "3) Pes", "3) pes", "PES":
                                try 
                                {
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
                                        esc.nextLine();
                                        break;
                                    }

                                    // Validar decimals (máxim 3)
                                    if ((pes *1000) % 1 != 0) {
                                        System.out.println("ERROR: El pes no pot tenir més de 3 decimals.");
                                        System.out.println("");
                                        System.out.println("Tornant al menú principal...");
                                        System.out.println("");
                                        esc.nextLine();
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
                                    System.out.println(" ");
                                        System.out.println("Dada Modificada correctament!");
                                        System.out.println(" ");
                                        System.out.println("vols tornar al menú principal? (si/no)");
                                        tornarAlMenu = esc.next();
                                            if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                                                esc.nextLine(); 
                                                break; // Torna al menú principal
                                            } 
                                            else {
                                                System.out.println("Sortint del programa...");
                                                esc.close();
                                                programa = false;
                                             // Sortir del programa
                                            }

                        case "4", "Alçada", "alçada", "4. Alçada", "4) Alçada", "4) alçada", "ALÇADA":
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
                                        esc.nextLine();
                                        break;
                                    } 
                                    else if (alçada > 2.5) 
                                    {
                                        System.out.println("ERROR: L'alçada és massa gran, ha d'estar entre 0.5-2.5 metres.");
                                        System.out.println("");
                                        System.out.println("Tornant al menú principal...");
                                        System.out.println("");
                                        esc.nextLine();
                                        break;
                                    }

                                    // Validar màxim 3 decimals
                                    
                                    if (alçada * 1000 % 1 != 0)
                                    {
                                        System.out.println("ERROR: L'alçada no pot tenir més de 3 decimals.");
                                        System.out.println("");
                                        System.out.println("Tornant al menú principal...");
                                        System.out.println("");
                                        esc.nextLine();
                                        break;
                                    }

                                    

                            } catch (Exception e)
                            {
                                System.out.println("Error: Introdueix un valor vàlid per a l'alçada.");
                                System.out.println("");
                                System.out.println("Tornant al menú principal...");
                                System.out.println("");
                                esc.nextLine();
                                break;
                                
                            }
                                    System.out.println(" ");
                                        System.out.println("Dada Modificada correctament!");
                                        System.out.println(" ");
                                        System.out.println("vols tornar al menú principal? (si/no)");
                                        tornarAlMenu = esc.next();
                                            if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) {
                                                esc.nextLine(); 
                                                break; // Torna al menú principal
                                            } 
                                            else {
                                                System.out.println("Sortint del programa...");
                                                esc.close();
                                                programa = false;
                                                 // Sortir del programa
                                            }

                        case "5", "Tornar al menú principal", "tornar al menú principal", "5. Tornar al menú principal", "5) Tornar al menú principal", "5) tornar al menú principal", "TORNAR AL MENÚ PRINCIPAL":
                            System.out.println("Tornant al menú principal...");
                            System.out.println("");
                            esc.nextLine();
                            break; // Torna al menú principal
                        }
                                
                                    
                            }            
            
            case "c", "c)", "C", "C)", "Veure dades personals", "veure dades personals", "c) Veure dades personals", "C) Veure dades personals", "c) veure dades personals", "C) veure dades personals":
                
                System.out.println("Has triat l'opcio: Veure dades personals");
                System.out.println(" ");

                if (!dadesIntroduides) 
                {
                    System.out.println("No hi ha dades per veure. Si us plau, introdueix les teves dades primer.");
                    System.out.println("");
                    System.out.println("Tornant al menú principal...");
                    System.out.println("");
                    esc.nextLine();
                    break; // Torna al menú principal

                } 
                else 
                {
                    nomComplet = normalitzarNom(nomComplet);
                    System.out.println("Mostrant dades personals:");
                    System.out.printf("Nom complet: %s%n", nomComplet);
                    System.out.println(" ");
                    System.out.println("Edat: " + edat);
                    System.out.println(" ");
                    System.out.printf("Pes: %.2f", pes, "kg");
                    System.out.println(" ");
                    System.out.printf("Alçada: %.2f", alçada, "metres");
                    System.out.println(" ");
                    imc = (pes / (alçada*alçada));
                    System.out.println("IMC: " + imc);
                    // calcular quin es el teu index dintre de la normalitat
                        if (imc <18.5){
                            System.out.println("Vosté està en un index de pes baix");
                        }
                           
                           
                        if (pes >= 18.5 || pes<=24.99999) 
                        {
                          System.out.println("Vosté està en un index de pes normal"); 
                          
                        }
                        else if (pes >= 25 || pes <= 29.9999)
                        {
                            System.out.println("Vosté està en un index de sobrepès");
                            System.out.println(" ");
                       
                        }
                        else{
                            System.out.println("Vosté està en un index d'obesitat");
                           
                        }

                    
                     System.out.println(" ");
                            System.out.println("Vols tornar al menú principal (si/no)");
                            tornarAlMenu = esc.nextLine();

                            if (tornarAlMenu.equals("si") || tornarAlMenu.equals("Si") || tornarAlMenu.equals("SI") || tornarAlMenu.equals("sí") || tornarAlMenu.equals("Sí") || tornarAlMenu.equals("SÍ")) 
                            {
                                System.out.println(" ");
                                System.out.println("Tornant al menú principal...");
                                break; // Torna al menú principal
                            } 
                            else 
                            {
                                System.out.println("Sortint del programa...");
                    
                                programa = false;
                                // Sortir del programa
                            }
                    
                    
                }
                case "d", "D", "d)", "D)", "Sortir del programa", "sortir del programa", "d) Sortir del programa", "d) sortir del programa", "D) Sortir del programa", "D) sortir del programa" :

                System.out.println(" ");
                System.out.println("Sortint del programa...");
                programa = false;
    }
    }


    }

public static String normalitzarNom(String nom) {
    String[] parts = nom.trim().split("\\s+");
    StringBuilder normalized = new StringBuilder();

    for (String part : parts) {
        if (part.length() > 0) {
            normalized.append(Character.toUpperCase(part.charAt(0)));
            normalized.append(part.substring(1).toLowerCase());
            normalized.append(" ");
        }
    }

    return normalized.toString().trim();
}

    
    }
    






