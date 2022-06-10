/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAF1;

/**
 *
 * @author estemon
 */

// En aquest programa es busca generar unes taules de múltiples a partir d'un nombre donat (valorIni1)
// A més d'això, es calculen un nombre de files addicionals de múltiples (numFiles), que poden ser múltiples posteriors
// (per exemple, si haviem triat el 4 com a valorIni1 i posem a numFiles = 2, ens mostrarà la taula de múltiples de 4, 5 i 6.

// A més, les taules mostrades només havien de mostrar nombres parells.
// Per últim, s'havia de definir un valor de cerca (valorCerca) que fes aturar l'execució del programa i digués per pantalla
// si s'havia trobat el nombre

// Dues coses que no vaig aconseguir fer i demanava l'enunciat (o ho deixava caure a partir dels exemples):
// 1. Que en cas de no trobar cap valorCerca també hi hagués un missatge que indiqués que no s'havia trobat cap valor
// 2. Que en cas de posar numFiles = nombre negatiu, la taula mostrada fos des del nombre més petit fins al valorIni1, és a dir:
// A l'exemple de l'exercici, si valorIni1 = 4 i numFiles = 2, la taula construïda tenia l'aspecte 2... 3... 4...
// Però en el meu cas el que apareixa per pantalla era: 4... 3... 2...

public class Ex3_FortunoR {
  
  public static final int MAX_VALOR = 10;
  public static final String T_VALOR_TROBAT = "--------S'ha trobat el valor de cerca. Finalitzem el programa.";
  
  public static void main (String[] args) {
    
    int valorIni1 = 4;      // valor per generar els múltiples
    int producte1;          // magatzem de productes
    int numFiles = 6;      // files extra a generar
    int valorCerca = 48;    // valor per aturar l'execució
    boolean valorTrobat = false;
    
    System.out.print(valorIni1 + ":\t");
    for (int i = 0; i <= MAX_VALOR; i++) {
      if (!valorTrobat) {
        producte1 = valorIni1 * i;
        if (producte1 != valorCerca) {
          if (producte1 % 2 == 0) {
            System.out.print(producte1 + "\t");
          }
        } else {
          valorTrobat = true;
        }
      }
    }
    System.out.print("\n");
    
    if (numFiles > 0 && !valorTrobat) {
      for (int i = 1; i <= numFiles; i++) {
        if (!valorTrobat) {
          System.out.print((valorIni1 + i) + ":\t");
          for (int j = 0; j <= MAX_VALOR; j++) {
            if (!valorTrobat) {
              producte1 = (valorIni1 + i) * j;
              if (producte1 != valorCerca) {
                if (producte1 % 2 == 0) {
                  System.out.print(producte1 + "\t");
                }
              } else {
                valorTrobat = true;
              }
            }
          }
          System.out.print("\n");
        }
      }
    } else if (numFiles < 0) {
      for (int i = -1; i >= numFiles; i--) {
        if (!valorTrobat) {
          System.out.print((valorIni1 + i) + ":\t");
          for (int j = 0; j <= MAX_VALOR; j++) {
            if (!valorTrobat) {
              producte1 = (valorIni1 + i) * j;
              if (producte1 != valorCerca) {
                if (producte1 % 2 == 0) {
                  System.out.print(producte1 + "\t");
                } 
              } else {
                valorTrobat = true;
              }
            }
          }
          System.out.print("\n");
        }
      }
    }
    
    if (valorTrobat) {
      System.out.print(T_VALOR_TROBAT + ": " + valorCerca);
    }
  }
}
