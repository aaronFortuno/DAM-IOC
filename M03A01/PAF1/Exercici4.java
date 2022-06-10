/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAF1;

/**
 *
 * @author estemon
 */

// Aquest exercici demanava construir, a partir d'una array donada (arrayTemperatures)
// una array (jo en vaig fer una de nova, copiant la original) en què amb l'algoritme de
// bombolla es mostressin les temperatures ordenades

// Addicionalment, també es demanava que les temperatures de l'array original, per als valors
// entre x i y temperatura (TEMP_MAX i TEMP_MIN) es canviés aquest per un nou valor (TEMP_AJUST)

// També demanava fer la publicació de les dades mitjançant un for que anés recorrent les arrays
// i mostrant els missatges adequats

public class Ex4_FortunoR {
  
  public static final float TEMP_MIN = 10f;
  public static final float TEMP_MAX = 15f;
  public static final float TEMP_AJUST = 12.5f;
  
  public static final String T_MITJANA = "La temperatura mitjana és: ";
  public static final String T_AJUSTADES = "Les temperatures ajustades són: ";
  public static final String T_AJUSTATS_PRE = "S'han modificat ";
  public static final String T_AJUSTATS_POST = " temperatures.";
  
  public static void main (String[] args) {
    
    float[] arrayTemperatures = {17.5f, 15f, 18f, 11.7f, 10.5f, 16f, 18.4f, 13.6f};
    float[] arrayTemperaturesOrdenades = new float[arrayTemperatures.length];
    float acumulat = 0;
    float mitjana = 0;
    int ajustats = 0;
    
    // còpia arrayTemperatures a nova arrayTemperaturesOrdenades
    for (int i = 0; i < arrayTemperatures.length; i++) {
      arrayTemperaturesOrdenades[i] = arrayTemperatures[i];
    }
    
    // bucle ordenació
    for (int i = 0; i < arrayTemperaturesOrdenades.length; i++) {
      for (int j = 0; j < arrayTemperaturesOrdenades.length - 1; j++) {
        if (arrayTemperaturesOrdenades[j] < arrayTemperaturesOrdenades[i]) {
          float aux = arrayTemperaturesOrdenades[j];
          arrayTemperaturesOrdenades[j] = arrayTemperaturesOrdenades[i];
          arrayTemperaturesOrdenades[i] = aux;
        }
      }
    }
    
    // mostra valors ordenats
    for (int i = 0; i < arrayTemperaturesOrdenades.length; i++) {
      System.out.println(i + ": " + arrayTemperaturesOrdenades[i]);
    }
    
    // calcula i mostra mitjana
    for (int i = 0; i < arrayTemperaturesOrdenades.length; i++) {
      acumulat += arrayTemperaturesOrdenades[i];
    }
    mitjana = acumulat / arrayTemperaturesOrdenades.length;
    System.out.println(T_MITJANA + mitjana + "\n\n");
    
    
    // modifica valors entre 10 i 15
    for (int i = 0; i < arrayTemperatures.length; i++) {
      if (arrayTemperatures[i] >= TEMP_MIN && arrayTemperatures[i] <= TEMP_MAX) {
        arrayTemperatures[i] = TEMP_AJUST;
        ajustats++;
      }
    }
    
    // mostra valors ajustats
    System.out.println(T_AJUSTADES);
    for (int i = 0; i < arrayTemperatures.length; i++) {
      System.out.println(i + ": " + arrayTemperatures[i]);
    }
    
    // calcula i mostra mitjana ajustada
    acumulat = 0f; // neteja acumulat anterior
    for (int i = 0; i < arrayTemperatures.length; i++) {
      acumulat += arrayTemperatures[i];
    }
    mitjana = acumulat / arrayTemperatures.length;
    System.out.println(T_MITJANA + mitjana);
    
    // mostra quants valors s'han modificat
    System.out.println(T_AJUSTATS_PRE + ajustats + T_AJUSTATS_POST);
  }
}
