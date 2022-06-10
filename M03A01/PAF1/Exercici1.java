/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAF1;

/**
 *
 * @author estemon
 */

// Aquest exercici demana que l'aplicació retorni una sèrie de valors sobre aigua necessària i freqüència de rec
// en funció de quatre paràmetres que es donen: si és una planta amb flors, si és d'interior, si el test és compartit
// i si està en un lloc amb llum natural.

// Per realitzar-lo s'ha optat per l'ús de valors booleans, per poder utilitzar condicionals niats

public class Exercici1 {
  
  public static final String T_AIGUA = "\tAigua necessària:  ";
  public static final String T_DOSI = "\t\tFreqüència setmanal:  ";
  public static final String T_TEST = "\tMireu les indicacions del test de la planta.";
  
  public static void main (String[] args) {
    
    int aigua = 0, dosi = 0;
    boolean flors = false, interior = false, testCompartit = false, llumNatural = false; // modifiqueu aquests valors per saber la quantitat d'aigua i la freqüència amb què heu de regar
    
    if (flors) {
      if (interior) {
        if (testCompartit) {
          if (llumNatural) {
            aigua = 120; dosi = 3;
          } else {
            aigua = 100; dosi = 2;
          }
        } else {
          if (llumNatural) {
            aigua = 90; dosi = 1;
          } else {
            aigua = 115; dosi = 2;
          }
        }
      } else {
        if (llumNatural) {
          aigua = 200; dosi = 1;
        } else {
          aigua = 150; dosi = 4;
        }
      }
      System.out.print(T_AIGUA + aigua + T_DOSI + dosi);
    } else {
      System.out.println(T_TEST);
    }
    
  }
}
