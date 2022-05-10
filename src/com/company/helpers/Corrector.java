package com.company.helpers;

public class Corrector {

    public static String correctString(String aux){      //Funcion para de volver la forma correta de las palabras( manejo de espacios y mayusculas)
        String auxFinal;
        if (aux == null) {
            auxFinal = null;
        } else {
            aux = aux.trim();
            if (aux.isEmpty()) {
                auxFinal = null;
            } else {
                auxFinal = aux.substring(0, 1).toUpperCase();
                auxFinal += aux.substring(1).toLowerCase();

                while (auxFinal.contains("  ")) {
                    auxFinal = auxFinal.replaceAll("  ", " ");
                }
                if (auxFinal.contains(" ")) {
                    String[] strAux = auxFinal.split("\\s+");
                    auxFinal = strAux[0] + " ";
                    for (int i = 1; i < strAux.length; i++) {
                        auxFinal += strAux[i].substring(0, 1).toUpperCase();
                        auxFinal += strAux[i].substring(1).toLowerCase();
                        auxFinal += " ";
                    }
                }
            }
        }
        return auxFinal;
    }


}
