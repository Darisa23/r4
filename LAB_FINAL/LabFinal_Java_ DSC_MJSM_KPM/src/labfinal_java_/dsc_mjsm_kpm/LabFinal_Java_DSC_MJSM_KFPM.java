/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_java_.dsc_mjsm_kpm;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Sanguino
 */
public class LabFinal_Java_DSC_MJSM_KFPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int j = 0, i, d1, d2, sum1 = 0, sum2 = 0, punt1, punt2, c = 1, t, caso = 0, yv, e,
                numJug2, numjug1, famas, puntos, n1j2, n2j2, n3j2, n4j2, n1j1, n2j1, n3j1, n4j1, intentos, instrucciones = 0;
        int p1, p2, p3, p4, p5, p6, p7, p8, p9;
        boolean otro = true;
        String jug1 = "", jug2 = "", p, op, ip1, ip2, ip3, ip4, ip5, ip6, ip7, ip8, ip9, opt = "5", ins, x = "1", margarita, casilla, ant;
        ant = "0";
        //**********************
        /*
        BONUS #3: Implementamos la clase JOptionPane, Para ello importamos la librería Swing que permite el manejo de interfaces gráficas.
        Con esta clase es posible mostrar ventanas standards llamadas Dialogs para solicitar y mostrar información al usuario.
         */
        //MENÚ:
        while (!opt.equalsIgnoreCase("0")) {
            System.out.println("se muestra el menú");
            opt = JOptionPane.showInputDialog(null, "𝙱𝚒𝚎𝚗𝚟𝚎𝚗𝚒𝚍𝚘 𝚊 𝚕𝚊 𝙼𝚒𝚜𝚌𝚎𝚕𝚊𝚗𝚎𝚊 𝚍𝚎 𝙹𝚞𝚎𝚐𝚘𝚜 🎮🎮🎮  \n\n\t\t𝟷. Ｄ𝚊ｄ𝚘ｓ  🎲\n\t\t𝟸. Ｐ𝚞ｎ𝚝ｏ ｙ Ｆ𝚊ｍ𝚊 🎯\n\t\t"
                    + "𝟹. Ｍ𝚊ｒ𝚐ａ𝚛ｉ𝚝ａ ✼\n\t𝟺. Ｓ𝚊ｌ𝚒ｒ\n\n Elija una opción: \n", "ιɳι𝓬ισ", JOptionPane.INFORMATION_MESSAGE);
            while (!opt.equalsIgnoreCase("1") & !opt.equalsIgnoreCase("2") & !opt.equalsIgnoreCase("3") & !opt.equalsIgnoreCase("4")) {
                System.out.println("digitó una opción inválida del menú");
                JOptionPane.showMessageDialog(null, "Opción inválida, debe elegir un número del menú", "e̷r̷r̷o̷r̷", 2);
                opt = JOptionPane.showInputDialog("\t\t1.Dados\n\t\t2.Punto y Fama\n\t\t3.Margarita\n\t4.Salir\nElija una opción: ");
            }
            //***********************
            /* El juego de los dados y la margarita están diseñados para realizarse en parejas, al inicio de nuestro programa
           registraremos en las variables, "jug1" y "jug2" sus nombres, con el fin de hacer una 
           experiencia más personalizada. Para el caso de punto y fama, se registra solo un jugador.
             */
            if (!opt.equalsIgnoreCase("4")) {
                if (!opt.equalsIgnoreCase("2")) {
                    while (jug1.equals("")) {
                        jug1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador #1:\n", "ɾҽցιs𝜏ɾσ", 3);
                    }
                    System.out.println("El jugador número uno fue: " + jug1);
                    while (jug2.equals("")) {
                        jug2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador #2:\n", "ɾҽցιs𝜏ɾσ", 3);
                        System.out.println("El jugador número dos fue: " + jug2);
                    }
                } else {
                    while (jug1.equals("")) {
                        jug1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador #1:\n", "ɾҽցιs𝜏ɾσ", 3);
                    }
                    System.out.println("El jugador fue: " + jug1);
                }
                //Preguntamos al usuario si desea leer las instrucciones antes de jugar:
                instrucciones = JOptionPane.showConfirmDialog(null, "Desea leer las instrucciones del juego antes de empezar?", "🕹🕹🕹", JOptionPane.YES_NO_OPTION, 3);
            }
            //Juego #1: "DADOS"
            switch (opt) {

                case "1":
                    System.out.println("Eligió la opción del juego de los dados");
                    JOptionPane.showMessageDialog(null, "╰•★★  *ੈ✩‧₊˚ 🇧  🇮  🇪  🇳"
                            + "  🇻  🇪  🇳  🇮  🇩  🇴    🇦  🇱    🇯  🇺  🇪  🇬  🇴    🇩  🇪    🇱  🇴  🇸    🇩  🇦  🇩  🇴  🇸 ˚₊‧✩*ੈ★★•╯", "🎲🎲🎲", -1);
                    if (instrucciones == 0) {
                        ins = "𝙸𝙽𝚂𝚃𝚁𝚄𝙲𝙲𝙸𝙾𝙽𝙴𝚂:\n\n⋆ Los jugadores se turnan para lanzar dos dados.\n"
                                + "⋆ Si sacas un doble (mismos números en ambos dados), ganas 1 punto y lanzas de nuevo.\n"
                                + "⋆ Si no sacas un doble, sumas los valores de los dados y pasas el turno al siguiente jugador.\n"
                                + "⋆ El jugador con la mayor suma en una jugada gana 3 puntos.\n"
                                + "⋆ Si ambos jugadores sacan el mismo valor, la jugada se anula y se repite.\n"
                                + "⋆ El juego continúa hasta que un jugador obtiene una ventaja de 15 puntos o se completan 21 jugadas.\n"
                                + "⋆ Gana el jugador que obtenga una ventaja de 15 puntos sobre su rival.\n"
                                + "⋆ Si ningún jugador alcanza esta ventaja, gana quien tenga más puntos después de 21 rondas.";
                        JOptionPane.showMessageDialog(null, ins, "🎲🎲🎲", 1);
                    }
                    intentos = 0;
                    do {
                        if (intentos == 0) {
                            x = JOptionPane.showInputDialog(null, "1. START GAME\n2. Escoger otro juego\n↳ Escoja una opción: ", "🎲🎲🎲", 3);
                        } else {
                            x = JOptionPane.showInputDialog(null, "1. Volver a jugar\n2. Escoger otro juego\n↳ Escoja una opción:", "🎲🎲🎲", 3);
                        }
                        while (!x.equalsIgnoreCase("1") & !x.equalsIgnoreCase("2")) {
                            System.out.println("digitó una opción diferente de 1/2");
                            x = JOptionPane.showInputDialog(null, "Escoja una opción válida (1.Jugar/2.Salir):", "N̷ú̷m̷e̷r̷o̷ i̷n̷v̷á̷l̷i̷d̷o̷", 2);
                        }
                        if (x.equals("1")) {
                            System.out.println("intento #" + (intentos + 1) + " del juego de los dados");
                            punt1 = 0;
                            punt2 = 0;
                            j = 0;
                            e = 0;
                            do {
                                if (sum1 != sum2 | e == 0) {
                                    System.out.println("ronda: " + (j + 1));
                                    JOptionPane.showMessageDialog(null, "𝚁ｏ𝚗ｄ𝚊 # " + (j + 1), "🎲🎲🎲", -1);
                                } else {

                                    System.out.println("se repitió la ronda " + (j + 1));
                                    JOptionPane.showMessageDialog(null, "𝚁ｏ𝚗ｄ𝚊 # " + (j + 1) + " se repite", "🎲🎲🎲", -1);
                                }
                                if (j + 1 == 21) {
                                    System.out.println("Última ronda:");
                                    JOptionPane.showMessageDialog(null, "𝙴ｓ𝚝ａ  ｅ𝚜  𝚕ａ  ｕ𝚕ｔ𝚒ｍ𝚊  𝚛ｏ𝚗ｄ𝚊", "🎲🎲🎲", -1);
                                }
                                d1 = 0;
                                d2 = 0;
                                System.out.println("Turno de: " + jug1);
                                //Inicia jugando el jugador#1
                                while (d1 == d2) {
                                    do {
                                        p = JOptionPane.showInputDialog(null, jug1 + " por favor, lance los dados digitando * ", "🎲🎲🎲", -1);
                                    } while (!p.equals("*"));
                                    //se generan los 2 números de los dados aleatoriamente:
                                    d1 = ran.nextInt(6) + 1;
                                    d2 = ran.nextInt(6) + 1;
                                    sum1 = d1 + d2;
                                    System.out.println("resultado: " + d1 + " --- " + d2);
                                    JOptionPane.showMessageDialog(null, "" + d1 + " --- " + d2, "Resultado:", -1);
                                    //Revisamos si sacó doble:
                                    if (d1 == d2) {
                                        System.out.println("por ser doble, tiró de nuevo");
                                        punt1 = punt1 + 1;
                                        if (punt1 == 1) {
                                            JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug1 + " 𝑜𝒷𝓉𝓊𝓋𝒾𝓈𝓉𝑒 𝓊𝓃 𝒹𝑜𝒷𝓁𝑒!!!\nHas ganado un punto\nllevas " + punt1 + " punto\ntira de nuevo!", "🎲🎲🎲", -1);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug1 + " 𝑜𝒷𝓉𝓊𝓋𝒾𝓈𝓉𝑒 𝓊𝓃 𝒹𝑜𝒷𝓁𝑒!!!\nHas ganado otro punto\nllevas " + punt1 + " puntos\ntira de nuevo!", "🎲🎲🎲", -1);
                                        }
                                    }
                                }
                                //turno jugador# 2
                                d1 = 0;
                                d2 = 0;
                                System.out.println("Turno de: " + jug2);
                                JOptionPane.showMessageDialog(null, "𝙴ｓ ｅ𝚕  𝚝ｕ𝚛ｎ𝚘   "
                                        + "𝚍ｅ " + jug2, "🎲🎲🎲", -1);
                                while (d1 == d2) {
                                    do {
                                        p = JOptionPane.showInputDialog(null, jug2 + " por favor, lance los dados digitando * ", "🎲🎲🎲", -1);
                                    } while (!p.equals("*"));
                                    d1 = ran.nextInt(6) + 1;
                                    d2 = ran.nextInt(6) + 1;
                                    sum2 = d1 + d2;
                                    System.out.println("resultado: " + d1 + " --- " + d2);
                                    JOptionPane.showMessageDialog(null, "" + d1 + " --- " + d2, "Resultado:", JOptionPane.PLAIN_MESSAGE);
                                    if (d1 == d2) {
                                        System.out.println("por ser doble, tiró de nuevo");
                                        punt2 = punt2 + 1;
                                        if (punt2 == 1) {
                                            JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug2 + " 𝑜𝒷𝓉𝓊𝓋𝒾𝓈𝓉𝑒  𝓊𝓃  𝒹𝑜𝒷𝓁𝑒!!!\nHas ganado un punto\nllevas " + punt2 + " punto\n tira de nuevo!", "🎲🎲🎲", -1);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug2 + " 𝑜𝒷𝓉𝓊𝓋𝒾𝓈𝓉𝑒  𝓊𝓃  𝒹𝑜𝒷𝓁𝑒!!!\nHas ganado otro punto\nllevas " + punt2 + " puntos\ntira de nuevo!", "🎲🎲🎲", -1);
                                        }
                                    }
                                }
                                //Comparamos resultados
                                if (sum1 == sum2) {
                                    System.out.println("empataron");
                                    e = e + 1;
                                    JOptionPane.showMessageDialog(null, "𝙴ｓ𝚝ｏ  ｈ𝚊   𝚜ｉ𝚍ｏ ｕ𝚗   𝚎ｍ𝚙ａ𝚝ｅ!!  ｎ𝚒ｎ𝚐ｕ𝚗ｏ ｓ𝚎   𝚕ｌ𝚎ｖ𝚊   𝚕ｏ𝚜   𝚙ｕ𝚗ｔ𝚘ｓ", "🎲🎲🎲", -1);
                                } else {
                                    //el acumulador "j" lleva la cuenta de las rondas.
                                    j = j + 1;
                                    if (sum1 < sum2) {
                                        punt2 = punt2 + 3;
                                        System.out.println("la ronda #" + j + " la ganó " + jug2);
                                        JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug2 + "  !!!\n𝒯𝑒  𝒽𝒶𝓈  𝓁𝓁𝑒𝓋𝒶𝒹𝑜  𝓁𝒶  𝓋𝒾𝒸𝓉𝑜𝓇𝒾𝒶  𝑒𝓃  𝑒𝓈𝓉𝒶  𝓇𝑜𝓃𝒹𝒶!\nllevas " + punt2 + " puntos", "🎲🎲🎲", -1);
                                    } else {
                                        punt1 = punt1 + 3;
                                        System.out.println("la ronda #" + j + " la ganó " + jug1);
                                        JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug1 + " !!!\n𝒯𝑒  𝒽𝒶𝓈  𝓁𝓁𝑒𝓋𝒶𝒹𝑜  𝓁𝒶  𝓋𝒾𝒸𝓉𝑜𝓇𝒾𝒶  𝑒𝓃  𝑒𝓈𝓉𝒶  𝓇𝑜𝓃𝒹𝒶!\nllevas " + punt1 + " puntos", "🎲🎲🎲", -1);
                                    }
                                }
                            } while (j < 21 & punt1 - punt2 <= 15 & punt2 - punt1 <= 15);
                            //Luego de que uno de los jugadores alcance una ventaja mayor a 15 puntos o pasen 21 rondas, comparamos quién tiene más puntos, para anunciar al ganador:
                            if (punt1 > punt2) {
                                System.out.println("ganó " + jug1);
                                if (j == 21) {
                                    JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈  𝑒𝓃  𝓁𝒶  𝒿𝓊𝑔𝒶𝒹𝒶  𝟤𝟣 " + jug1 + " 𝒽𝒶  𝑔𝒶𝓃𝒶𝒹𝑜  𝑒𝓈𝓉𝑒  𝒿𝓊𝑒𝑔𝑜!", "🎲🎲🎲", -1);
                                } else {
                                    JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈 " + jug1 + " 𝒽𝒶  𝒶𝓁𝒸𝒶𝓃𝓏𝒶𝒹𝑜  𝓊𝓃𝒶  𝓋𝑒𝓃𝓉𝒶𝒿𝒶  𝒹𝑒 " + (punt1 - punt2) + " 𝓅𝓊𝓃𝓉𝑜𝓈  𝓎  𝒽𝒶  𝑔𝒶𝓃𝒶𝒹𝑜  𝑒𝓈𝓉𝑒  𝒿𝓊𝑒𝑔𝑜!", "🎲🎲🎲", -1);
                                }
                            } else {
                                System.out.println("ganó " + jug2);
                                if (j == 21) {
                                    JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈  𝑒𝓃  𝓁𝒶  𝒿𝓊𝑔𝒶𝒹𝒶  𝟤𝟣 " + jug2 + " 𝒽𝒶  𝑔𝒶𝓃𝒶𝒹𝑜  𝑒𝓈𝓉𝑒  𝒿𝓊𝑒𝑔𝑜!", "🎲🎲🎲", -1);
                                } else {
                                    JOptionPane.showMessageDialog(null, "𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈 " + jug2 + " 𝒽𝒶  𝒶𝓁𝒸𝒶𝓃𝓏𝒶𝒹𝑜  𝓊𝓃𝒶  𝓋𝑒𝓃𝓉𝒶𝒿𝒶  𝒹𝑒 " + (punt2 - punt1) + " 𝓅𝓊𝓃𝓉𝑜𝓈  𝓎  𝒽𝒶  𝑔𝒶𝓃𝒶𝒹𝑜  𝑒𝓈𝓉𝑒  𝒿𝓊𝑒𝑔𝑜!", "🎲🎲🎲", -1);
                                }
                            }
                        }
                    } while (!x.equalsIgnoreCase("2"));
                    System.out.println("fin del juego de los dados");
                    JOptionPane.showMessageDialog(null, "𝙷ａ𝚜ｔ𝚊  𝚕ｕ𝚎ｇ𝚘,  ¡𝚟ｕ𝚎ｌ𝚟ａ ｐ𝚛ｏ𝚗ｔ𝚘!", "🎲🎲🎲", -1);
                    break;

                //Juego #2: "PUNTO Y FAMA"
                case "2":
                    System.out.println(jug1 + "Eligió el juego de Punto y Fama");
                    JOptionPane.showMessageDialog(null, "*ੈ✩‧₊˚ 🇧  🇮  🇪  🇳  🇻  🇪  🇳  🇮  🇩  🇴    🇦  🇱    🇯  🇺  🇪  🇬  🇴    🇩  🇪    🇵  🇺  🇳  🇹  🇴    🇾    🇫  🇦  🇲  🇦 ˚₊‧✩*ੈ", "🎯🎯🎯", -1);
                    if (instrucciones == 0) {
                        ins = "𝙸𝙽𝚂𝚃𝚁𝚄𝙲𝙲𝙸𝙾𝙽𝙴𝚂:\n\n⋆ El PC generará un número de cuatro cifras sin dígitos repetidos.\n"
                                + "⋆ Ingresa una combinación de cuatro cifras asegurándote de que no tenga dígitos repetidos.\n"
                                + "⋆ Recibirás el resultado de tu intento indicando cuántos dígitos están en la misma posición (famas) y cuántos están en el número pero en diferente posición (puntos).\n"
                                + "⋆ Repite el proceso hasta que aciertes el número.\n"
                                + "⋆ Al final, se te mostrará el total de intentos empleados.";
                        JOptionPane.showMessageDialog(null, ins, "🎯🎯🎯", -1);
                    }
                    intentos = 0;
                    do {
                        if (intentos == 0) {
                            x = JOptionPane.showInputDialog(null, "1. START GAME\n2. Escoger otro juego\n↳ Escoja una opción: ", "🎯🎯🎯", 3);
                        } else {
                            x = JOptionPane.showInputDialog(null, "1. Volver a jugar\n2. Escoger otro juego\n↳ Escoja una opción:", "🎯🎯🎯", 3);
                        }
                        while (!x.equalsIgnoreCase("1") & !x.equalsIgnoreCase("2")) {
                            System.out.println("digitó una opción diferente de 1/2");
                            x = JOptionPane.showInputDialog(null, "Escoja una opción válida (1.Jugar/2.Salir):", "N̷ú̷m̷e̷r̷o̷ i̷n̷v̷á̷l̷i̷d̷o̷", 2);
                        }
                        if (x.equals("1")) {
                            intentos = 0;
                            do {
                                //Generamos un número aleatorio de 4 cifras
                                numjug1 = ran.nextInt(9999);
                                //Separamos las cifras de número y las guardamos en variables:
                                n1j1 = numjug1 % 10;
                                n2j1 = numjug1 / 10 % 10;
                                n3j1 = numjug1 / 100 % 10;
                                n4j1 = numjug1 / 1000 % 10;
                                //El númeor solo será valido si es mayor a 1000 y todas sus cifras son diferentes. En caso contrario se repite el proceso.
                            } while (numjug1 < 1000 || n1j1 == n2j1 || n1j1 == n3j1 || n1j1 == n4j1 || n2j1 == n3j1 || n2j1 == n4j1 || n3j1 == n4j1);
                            System.out.println("El jugador uno (PC) generó el número: " + numjug1);
                            JOptionPane.showMessageDialog(null, "El jugador uno (PC) ha generado el número que tienes que adivinar.\n𝐵𝓊𝑒𝓃𝒶 𝓈𝓊𝑒𝓇𝓉𝑒!!", "🎯🎯🎯", -1);
                            i = 0;
                            do {
                                do {
                                    if (i == 0) {
                                        //Solicitamos el número. 
                                        /*Nota: Como estamos trabajando con la librería swing que toma la entrada del usuario como una cadena de carcteres
                                                debemos convertir esa cadena en un número entero, para ello utilizamos el método Interger.parseInt()
                                                que se encarga de devolver la cadena como un tipo primitivo int.
                                        */
                                        numJug2 = Integer.parseInt(JOptionPane.showInputDialog(null, "𝙿𝚘𝚛 𝚏𝚊𝚟𝚘𝚛, 𝚒𝚗𝚝𝚎𝚗𝚝𝚎 𝚊𝚍𝚒𝚟𝚒𝚗𝚊𝚛 𝚎𝚕 𝚗ú𝚖𝚎𝚛𝚘 𝚍𝚎 𝚌𝚞𝚊𝚝𝚛𝚘 𝚌𝚒𝚏𝚛𝚊𝚜: ", "🎯🎯🎯", 3));
                                    } else {
                                        //en caso de que el número sea menor a 1000 o tenga cifras repetidas, se solicita el número nuevamente:
                                        numJug2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese un número válido de cuatro cifras (no puede repetir los digitos): ", "N̷ú̷m̷e̷r̷o̷ i̷n̷v̷á̷l̷i̷d̷o̷", 2));
                                    }
                                    System.out.println("en el intento #" + (i + 1) + " ingresó el número: " + numJug2);
                                    //Descomponemos el número que ingresó el usuario:
                                    n1j2 = numJug2 % 10;
                                    n2j2 = numJug2 / 10 % 10;
                                    n3j2 = numJug2 / 100 % 10;
                                    n4j2 = numJug2 / 1000 % 10;
                                    i = i + 1;
                                } while (numJug2 < 1000 || numJug2 > 9999 || n1j2 == n2j2 || n1j2 == n3j2 || n1j2 == n4j2 || n2j2 == n3j2 || n2j2 == n4j2 || n3j2 == n4j2);
                                i = 0;
                                famas = 0;
                                puntos = 0;
                                intentos = intentos + 1;
                                //revisamos las famas, (números en las posiciones correctas).
                                if (n1j2 == n1j1) {
                                    famas = famas + 1;
                                }
                                if (n2j2 == n2j1) {
                                    famas = famas + 1;
                                }
                                if (n3j2 == n3j1) {
                                    famas = famas + 1;
                                }
                                if (n4j2 == n4j1) {
                                    famas = famas + 1;
                                }
                                //revisamos los puntos, (números correctos en posiciones equivocadas).
                                if (n1j2 == n2j1 || n1j2 == n3j1 || n1j2 == n4j1) {
                                    puntos = puntos + 1;
                                }
                                if (n2j2 == n1j1 || n2j2 == n3j1 || n2j2 == n4j1) {
                                    puntos = puntos + 1;
                                }
                                if (n3j2 == n1j1 || n3j2 == n2j1 || n3j2 == n4j1) {
                                    puntos = puntos + 1;
                                }
                                if (n4j2 == n1j1 || n4j2 == n2j1 || n4j2 == n3j1) {
                                    puntos = puntos + 1;
                                }
                                System.out.println("Famas: " + famas + " Puntos: " + puntos);
                                JOptionPane.showMessageDialog(null, numJug2 + "\nFamas: " + famas + " Puntos: " + puntos, "🎯🎯🎯", 1);
                            } while (famas < 4);
                            System.out.println("¡Felicidades," + jug1 + " Ganaste! Has adivinado el número en " + intentos + " intentos.");
                            JOptionPane.showMessageDialog(null, "¡𝐹𝑒𝓁𝒾𝒸𝒾𝒹𝒶𝒹𝑒𝓈, " + jug1 + " 𝑔𝒶𝓃𝒶𝓈𝓉𝑒!  𝐻𝒶𝓈  𝒶𝒹𝒾𝓋𝒾𝓃𝒶𝒹𝑜  𝑒𝓁  𝓃ú𝓂𝑒𝓇𝑜  𝑒𝓃 " + intentos + "  𝒾𝓃𝓉𝑒𝓃𝓉𝑜𝓈.", "🎯🎯🎯", -1);
                        }
                    } while (!x.equalsIgnoreCase("2"));
                    System.out.println("fin del juego de punto y fama");
                    JOptionPane.showMessageDialog(null, "𝙷ａ𝚜ｔ𝚊   𝚕ｕ𝚎ｇ𝚘,  ¡𝚟ｕ𝚎ｌ𝚟ａ   ｐ𝚛ｏ𝚗ｔ𝚘!", "🎯🎯🎯", -1);
                    break;

                //Juego #3: "LA MARGARITA"
                case "3":
                    op = "start";
                    System.out.println("ingresó al juego de la margarita");
                    JOptionPane.showMessageDialog(null, "*ੈ✩‧₊˚ 🇧  🇮  🇪  🇳  🇻  🇪  🇳  🇮  🇩  🇴     🇦  🇱     🇯  🇺  🇪  🇬  🇴     🇩  🇪     🇱  🇦     🇲  🇦  🇷  🇬  🇦  🇷  🇮  🇹  🇦 ˚₊‧✩*ੈ", "✼✼✼", -1);
                    if (instrucciones == 0) {
                        ins = "𝙸𝙽𝚂𝚃𝚁𝚄𝙲𝙲𝙸𝙾𝙽𝙴𝚂:\n\n• Los jugadores se turnan para retirar fichas del tablero. Cada ficha retirada se marca con el símbolo \"○\".\n"
                                + "• En cada turno, el jugador puede retirar hasta dos fichas:\n"
                                + "\t  ⋆ La primera ficha puede ser retirada de cualquier casilla que no esté vacía.\n"
                                + "\t  ⋆ La segunda ficha, si se elige retirar, debe estar en una casilla contigua a la primera ficha retirada en el mismo turno\n"
                                + "• El juego finaliza cuando todas las casillas están vacías. El jugador que retira la última ficha es el ganador.";
                        JOptionPane.showMessageDialog(null, ins);
                    }
                    intentos = 0;
                    do {
                        if (intentos == 0) {
                            x = JOptionPane.showInputDialog(null, "1. START GAME\n2. Escoger otro juego\n↳ Escoja una opción: ", "✼✼✼", 3);
                        } else {
                            x = JOptionPane.showInputDialog(null, "1. Volver a jugar\n2. Escoger otro juego\n↳ Escoja una opción:", "✼✼✼", 3);
                        }
                        while (!x.equalsIgnoreCase("1") & !x.equalsIgnoreCase("2")) {
                            System.out.println("digitó una opción diferente de 1/2");
                            x = JOptionPane.showInputDialog(null, "Escoja una opción válida (1.Jugar/2.Salir):", "N̷ú̷m̷e̷r̷o̷ i̷n̷v̷á̷l̷i̷d̷o̷", 2);
                        }
                        if (x.equals("1")) {

                            ip1 = "◉";
                            ip2 = "◉";
                            ip3 = "◉";
                            ip4 = "◉";
                            ip5 = "◉";
                            ip6 = "◉";
                            ip7 = "◉";
                            ip8 = "◉";
                            ip9 = "◉";
                            p1 = 0;
                            p2 = 0;
                            p3 = 0;
                            p4 = 0;
                            p5 = 0;
                            p6 = 0;
                            p7 = 0;
                            p8 = 0;
                            p9 = 0;
                            //
                            // Mostrar gráficamente el juego al usuario
                            margarita = ("\n                      1    2    3\n                    4              5\n                    6              7\n                        8       9\n\n                 "
                                    + "  " + ip1 + "     " + ip2 + "     " + ip3 + "\n              " + ip4 + "                       " + ip5 + "\n              " + ip6 + "                       " + ip7 + "\n                     " + ip8 + "        " + ip9);
                            System.out.println(margarita);
                            // Establecer de quién es el turno
                            do {
                                if (c == 1) {
                                    System.out.print("\nEs el turno de " + jug1 + " escoja la casilla de la ficha que desea retirar: ");
                                    casilla = JOptionPane.showInputDialog(null, margarita + "\n\nEs el turno de " + jug1 + " escoja la casilla de la ficha que desea retirar: ", "✼✼✼", 3);
                                    while (!casilla.equalsIgnoreCase("1") & !casilla.equalsIgnoreCase("2") & !casilla.equalsIgnoreCase("3") & !casilla.equalsIgnoreCase("4") & !casilla.equalsIgnoreCase("5") & !casilla.equalsIgnoreCase("6") & !casilla.equalsIgnoreCase("7") & !casilla.equalsIgnoreCase("8") & !casilla.equalsIgnoreCase("9")) {
                                        System.out.print("La casilla no existe, ingrese otro valor: ");
                                        casilla = JOptionPane.showInputDialog(null, margarita + "\n\nLa casilla no existe, ingrese otro valor: ", "✼✼✼", 2);
                                    }
                                } else {
                                    System.out.print("\nEs el turno de " + jug2 + " escoja la casilla de la ficha que desea retirar: ");
                                    casilla = JOptionPane.showInputDialog(null, margarita + "\n\nEs el turno de " + jug2 + " escoja la casilla de la ficha que desea retirar: ", "✼✼✼", 1);
                                    while (!casilla.equalsIgnoreCase("1") & !casilla.equalsIgnoreCase("2") & !casilla.equalsIgnoreCase("3") & !casilla.equalsIgnoreCase("4") & !casilla.equalsIgnoreCase("5") & !casilla.equalsIgnoreCase("6") & !casilla.equalsIgnoreCase("7") & !casilla.equalsIgnoreCase("8") & !casilla.equalsIgnoreCase("9")) {
                                        System.out.print("La casilla no existe, ingrese otro valor: ");
                                        casilla = JOptionPane.showInputDialog(null, margarita + "\n\nLa casilla no existe, ingrese otro valor: ", "✼✼✼", 2);
                                    }
                                }
                                t = 2;
                                while (t == 2 | t == 1) {
                                    yv = 0;
                                    switch (casilla) {
                                        //Para cada caso se siguen las etapas que comentaré en el caso 1:
                                        case "1":
                                            //Se valida si es la primera ficha que retira el jugador en su turno:
                                            if (t == 2) {
                                                //Se valida que la casilla este vacía:
                                                if (p1 == 0) {
                                                    p1 = 1;
                                                    ip1 = "○";
                                                    if (p2 == 0 || p4 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } //En caso de que sea la segunda ficha que va a escoger en su turno:
                                            else {
                                                //se valida que esta sea una casilla contigua a la primera que eligió:
                                                if ((ant.equals("4") | ant.equals("2")) & p1 == 0) {
                                                    p1 = 1;
                                                    ip1 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "2":
                                            if (t == 2) {
                                                if (p2 == 0) {
                                                    p2 = 1;
                                                    ip2 = "○";
                                                    if (p1 == 0 || p3 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("1") | ant.equals("3")) & p2 == 0) {
                                                    p2 = 1;
                                                    ip2 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "3":
                                            if (t == 2) {
                                                if (p3 == 0) {
                                                    p3 = 1;
                                                    ip3 = "○";
                                                    if (p2 == 0 || p5 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("5") | ant.equals("2")) & p3 == 0) {
                                                    p3 = 1;
                                                    ip3 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "4":
                                            if (t == 2) {
                                                if (p4 == 0) {
                                                    p4 = 1;
                                                    ip4 = "○";
                                                    if (p1 == 0 || p6 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("1") | ant.equals("6")) & p4 == 0) {
                                                    p4 = 1;
                                                    ip4 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "5":
                                            if (t == 2) {
                                                if (p5 == 0) {
                                                    p5 = 1;
                                                    ip5 = "○";
                                                    if (p3 == 0 || p7 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("3") | ant.equals("7")) & p5 == 0) {
                                                    p5 = 1;
                                                    ip5 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "6":
                                            if (t == 2) {
                                                if (p6 == 0) {
                                                    p6 = 1;
                                                    ip6 = "○";
                                                    if (p8 == 0 || p4 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("4") | ant.equals("8")) & p6 == 0) {
                                                    p6 = 1;
                                                    ip6 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "7":
                                            if (t == 2) {
                                                if (p7 == 0) {
                                                    p7 = 1;
                                                    ip7 = "○";
                                                    if (p5 == 0 || p9 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("5") | ant.equals("9")) & p7 == 0) {
                                                    p7 = 1;
                                                    ip7 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "8":
                                            if (t == 2) {
                                                if (p8 == 0) {
                                                    p8 = 1;
                                                    ip8 = "○";
                                                    if (p6 == 0 || p9 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("6") | ant.equals("9")) & p8 == 0) {
                                                    p8 = 1;
                                                    ip8 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                        case "9":
                                            if (t == 2) {
                                                if (p9 == 0) {
                                                    p9 = 1;
                                                    ip9 = "○";
                                                    if (p7 == 0 || p8 == 0) {
                                                        otro = true;
                                                    } else {
                                                        otro = false;
                                                    }
                                                } else {
                                                    System.out.println("\nEsta casilla ya está vacía");
                                                    JOptionPane.showMessageDialog(null, "Esta casilla ya está vacía", "e̷r̷r̷o̷r̷", 2);
                                                    yv = 1;
                                                }
                                            } else {
                                                if ((ant.equals("7") | ant.equals("8")) & p9 == 0) {
                                                    p9 = 1;
                                                    ip9 = "○";
                                                    t = 0;
                                                    if (c == 1) {
                                                        c = 2;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    caso = 0;
                                                } else {
                                                    System.out.println("\nCasilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía");
                                                    JOptionPane.showMessageDialog(null, "Casilla inválida, recuérde que debe ser una casilla contigua y esta debe estar vacía", "e̷r̷r̷o̷r̷", 2);
                                                    caso = 1;
                                                }
                                            }
                                            break;
                                    }
                                    margarita = ("\n                      1    2    3\n                    4              5\n                    6              7\n                        8       9\n\n                 "
                                            + "  " + ip1 + "     " + ip2 + "     " + ip3 + "\n              " + ip4 + "                       " + ip5 + "\n              " + ip6 + "                       " + ip7 + "\n                     " + ip8 + "        " + ip9);
                                    //capturamos el caso de que la persona haya elegido una casilla que ya estaba vacía:
                                    if (yv == 1) {
                                        System.out.println(margarita);
                                        System.out.print("\nElija nuevamente la casilla de la ficha que desea retirar: ");
                                        casilla = JOptionPane.showInputDialog(null, margarita + "\n\nElija nuevamente la casilla de la ficha que desea retirar: ", "✼✼✼", 3);
                                        while (!casilla.equalsIgnoreCase("1") & !casilla.equalsIgnoreCase("2") & !casilla.equalsIgnoreCase("3") & !casilla.equalsIgnoreCase("4") & !casilla.equalsIgnoreCase("5") & !casilla.equalsIgnoreCase("6") & !casilla.equalsIgnoreCase("7") & !casilla.equalsIgnoreCase("8") & !casilla.equalsIgnoreCase("9")) {
                                            System.out.print("La casilla no existe, ingrese otro valor: ");
                                            casilla = JOptionPane.showInputDialog(null, margarita + "\n\nLa casilla no existe, ingrese otro valor: ", "✼✼✼", 2);
                                        }
                                    } else {
                                        if (t == 2) {
                                            System.out.println(margarita);
                                            /*Luego de que el jugador saca la primera ficha de su turno, preguntamos si quiere usar la segunda opurtunidad de sacar una
                                pero esto solo en caso de que tenga casillas contiguas disponibles:
                                             */
                                            if (otro) {
                                                System.out.println("Desea sacar otra ficha? ");
                                                t = JOptionPane.showConfirmDialog(null, margarita + "\n\nDesea sacar otra ficha?", "✼✼✼", JOptionPane.YES_NO_OPTION, 3);
                                                if (t == 0) {
                                                    t = 1;
                                                } else {
                                                    t = 0;
                                                }
                                            } else {
                                                if (p1 == 0 | p2 == 0 | p3 == 0 | p4 == 0 | p5 == 0 | p6 == 0 | p7 == 0 | p8 == 0 | p9 == 0) {
                                                    System.out.println("\nNo es posible para usted sacar otra ficha, dado que no cuenta con casillas continuas disponibles.");
                                                    JOptionPane.showMessageDialog(null, "No es posible para usted sacar otra ficha, dado que no cuenta con casillas continuas disponibles.", "✼✼✼", 1);
                                                    t = 0;
                                                }
                                            }
                                            //De elegir sacar otra ficha, preguntamos cuál desea sacar:
                                            if (t == 1) {
                                                ant = casilla;
                                                System.out.println(margarita);
                                                System.out.print("\nEscoja la casilla de la segunda ficha que desea retirar, recuerde que debe ser contigua: ");
                                                casilla = JOptionPane.showInputDialog(null, margarita + "\n\nEscoja la casilla de la segunda ficha que desea retirar, recuerde que debe ser contigua: ", "✼✼✼", 3);
                                                t = 1;
                                                while (!casilla.equalsIgnoreCase("1") & !casilla.equalsIgnoreCase("2") & !casilla.equalsIgnoreCase("3") & !casilla.equalsIgnoreCase("4") & !casilla.equalsIgnoreCase("5") & !casilla.equalsIgnoreCase("6") & !casilla.equalsIgnoreCase("7") & !casilla.equalsIgnoreCase("8") & !casilla.equalsIgnoreCase("9")) {
                                                    System.out.print("La casilla no existe, ingrese otro valor: ");
                                                    casilla = JOptionPane.showInputDialog(null, margarita + "\n\nLa casilla no existe, ingrese otro valor: ", "✼✼✼", 2);
                                                }
                                            } else {
                                                if (c == 1) {
                                                    c = 2;
                                                } else {
                                                    c = 1;
                                                }
                                            }
                                        }//Pedimos nuevamente la segunda ficha que desea retirar:
                                        if (caso == 1) {
                                            System.out.println(margarita);
                                            System.out.print("\nElija la segunda ficha que desea retirar nuevamente: ");
                                            casilla = JOptionPane.showInputDialog(null, margarita + "\n\nElija la segunda ficha que desea retirar nuevamente: ", "✼✼✼", 3);
                                            while (!casilla.equalsIgnoreCase("1") & !casilla.equalsIgnoreCase("2") & !casilla.equalsIgnoreCase("3") & !casilla.equalsIgnoreCase("4") & !casilla.equalsIgnoreCase("5") & !casilla.equalsIgnoreCase("6") & !casilla.equalsIgnoreCase("7") & !casilla.equalsIgnoreCase("8") & !casilla.equalsIgnoreCase("9")) {
                                                System.out.print("La casilla no existe, ingrese otro valor: ");
                                                casilla = JOptionPane.showInputDialog(null, margarita + "\n\nLa casilla no existe, ingrese otro valor: ", "✼✼✼", 2);
                                            }
                                        }
                                        // Terminar el ciclo principal cuando todas las casillas están vacías
                                        if (p1 == 1 && p2 == 1 && p3 == 1 && p4 == 1 && p5 == 1 && p6 == 1 && p7 == 1 && p8 == 1 && p9 == 1) {
                                            op = "fin";
                                            intentos = intentos + 1;
                                            // Decir que jugador ganó evaluando la variable que representa al jugador
                                            if (c == 2) {
                                                System.out.println("\nFelicidades, ganó " + jug1);
                                                JOptionPane.showMessageDialog(null, "Felicidades, " + jug1 + " has ganado este juego", "✼✼✼", -1);
                                            } else {
                                                System.out.println("\nFelicidades, ganó " + jug2);
                                                JOptionPane.showMessageDialog(null, "Felicidades, " + jug2 + " has ganado este juego", "✼✼✼", -1);
                                            }
                                            t = 0;
                                        }
                                    }
                                }
                            } while (op.equals("start"));
                        }
                    } while (!x.equalsIgnoreCase("2"));
                    JOptionPane.showMessageDialog(null, "𝙷ａ𝚜ｔ𝚊  𝚕ｕ𝚎ｇ𝚘,  ¡𝚟ｕ𝚎ｌ𝚟ａ  ｐ𝚛ｏ𝚗ｔ𝚘!", "", -1);
                    break;
                case "4":
                    System.out.println("GRACIAS POR HABER SIDO NUESTRA PROFE\n FIN.");
                    JOptionPane.showMessageDialog(null, "·.★·.·´¯`·.·★ Ｅｓｐｅｒａｍｏｓ   ｈａｙａｓ   ｄｉｓｆｒｕｔａｄｏ   ｄｅ   ｌｏｓ   ｊｕｅｇｏｓ ★·.·´¯`·.·★.·", "\t\t\t𝕗𝕚𝕟", -1);
                    opt = "0";
                    break;
            }
        }
    }
}
