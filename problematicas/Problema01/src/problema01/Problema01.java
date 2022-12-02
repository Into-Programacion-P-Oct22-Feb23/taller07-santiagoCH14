/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author DETPC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 0;
        int edad;
        double estatura;
        double edad_promedio;
        double estatura_promedio = 0;
        double suma_edad = 0;
        double suma_estatura = 0;
        String nombre;
        String posicion_campo;
        String informacion_jugador = "";
        int salida;
        boolean bandera = true;

        informacion_jugador = "Listado de Jugadores\n";

        do {

            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posicion del jugador");
            posicion_campo = entrada.nextLine();

            System.out.println("Ingrese la la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();

            nombre = nombre;
            posicion_campo = posicion_campo;
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;

            contador = contador + 1;

            informacion_jugador = String.format("%sListado de Jugadores%s\n",
                    informacion_jugador,
                    nombre,
                    posicion_campo,
                    suma_edad,
                    suma_estatura);

            System.out.println("Ingrese 5  para terminar el proceso"
                    + "cuaquier otro numero para continuar");
            salida = entrada.nextInt();

            if (salida == 5) {
                bandera = false;
            }

        } while (bandera);

        edad_promedio = (double) suma_edad / contador;
        estatura_promedio = (double) estatura_promedio / contador;

        informacion_jugador = String.format("%s\nPromedio de edades: %s.2f"
                + "%s\nPromedio de estaturas: %.2f",
                informacion_jugador,
                edad_promedio,
                estatura_promedio);

        System.out.printf("%s\n", informacion_jugador);
    }

}
