package contar_palabras;

import java.util.HashMap;

public class ContarPalabras {
    
    public static void main (String [] args){
        System.out.println("hola Contar palabras");

        String text = "es un comentario de prueba para comentario video fio fio fio";
        String [] listaPalabras = text.split(" ");

        System.out.println(listaPalabras.length);
            for(int i = 0 ; i < listaPalabras.length ; i++){
                System.out.println( " la palabra en la posicion "+ i + " es  : " + listaPalabras[i]);
            }
        
        HashMap<String,Integer> palabrasHash = new HashMap<>();

        // put (clave,valor )
        // constaint keys 
            for ( int i = 0 ; i < listaPalabras.length ; i++){
                if (!palabrasHash.containsKey(listaPalabras[i]) ) {
                    palabrasHash.put(listaPalabras[i], 1);
                } else {
                    int valorActual = palabrasHash.get(listaPalabras[i]);
                    palabrasHash.put(listaPalabras[i], valorActual + 1);
                }
            }

            System.out.println(palabrasHash.toString());


    }

    // -ingesar un texto string
    // -separado en una lista
    // -hashmpa (clave : palabra del texto , valor : int numero )
    // -imprimir
    
}
