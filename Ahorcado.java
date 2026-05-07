import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //clase escaner que nos permite que el usuario escriba
        Scanner scanner =new Scanner(System.in);
        //declaraciones y asiganciones
        String palabraSecreta="inteligencia";
        int intentisMaximos =10;
        int intentos=0;
        boolean palabraAdivinada=false;
        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

//estrucyura de control bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i]='_';
        }

        while (!palabraAdivinada && intentos < intentisMaximos) {
            System.out.println("Palabra a adivinar:" +String.valueOf(letrasAdivinadas)+ " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");

            //usamos la clase escaner para pedir una letra
            char letra=Character.toLowerCase(scanner.next().charAt(0) );


            boolean letraCorrecta=false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta=true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println( "!incorrecto te quedan "+ (intentisMaximos-intentos)+ " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;

                System.out.println("Felicidades , has adivinado ña palabra serceta: "+ palabraSecreta);
            }




        }
        if(!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos game over");


        }
        scanner.close();



    }
}
