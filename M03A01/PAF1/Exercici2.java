/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAF1;

/**
 *
 * @author estemon
 */

// Aquest programa demanava calcular la dosi d'un medicament a un pacient en funció del pes del pacient,
// de si tenia patologies prèvies o no, o si forma part d'un col·lectiu de risc.

// En funció de aquests paràmetres, es realitza el càlcul d'una o altra forma i s'indica l'usuari quina és
// la dosificació necessària

public class Ex2_FortunoR {
  
  public static final String T_PES_MINIM = "No arriba al pes mínim. No es pot administrar aquest medicament.";
  public static final String T_DOSI = "La dosi necessària (per 100ml) és de:  ";
  
  public static final int PATOL_NO = 20;
  public static final int PATOL_SI = 5;
  
  public static final double PES_MES_80 = 0.15;
  public static final double PES_45_80 = 0.07;
  public static final double PES_25_45 = 0.02;
  
  public static final double RISC_SI = 0.05;
  
  public static void main (String[] args) {
    
    boolean pesMinim; // aquest valor es calcula automàticament a partir del pes del pacient
    boolean patologiesPrevies = false, collectiuRisc = false; // modifiqueu els valors per indicar si el pacient pateix patologies prèvies o si forma part d'un col·lectiu de risc
    int pes = 75; // indiqueu el pes del pacient
    double dosi = 100f;
    
    // comprova si arriba al pes mínim
    if (pes >= 25) {
      
      // comprova si té patologies prèvies
      if (patologiesPrevies) {
        pes += 5;
      } else {
        pes += 20;
      }
      
      // calcular dosi
      if (pes > 80) {
        dosi *= PES_MES_80;
      } else if (pes > 45) {
        dosi *= PES_45_80;
      } else {
        dosi *= PES_25_45;
      }
      
      // comprova si forma part de col·lectiu de risc i recalcular dosi
      if (collectiuRisc) {
        dosi -= (dosi * RISC_SI);
      }
      
      // mostra dosi a administrar
      System.out.print(T_DOSI + dosi);
    } else {
      System.out.println(T_PES_MINIM);
    }
  }
}
