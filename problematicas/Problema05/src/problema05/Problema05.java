/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author DETPC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = -1;
        int numero_dos = 3;
        int contador = 1;

        System.out.printf("1 ");

        do {
            if (numero == -1) {
                System.out.printf("%d/%d",
                        numero,
                        numero_dos);
            } else {
                System.out.printf("+%d/%d",
                        numero,
                        numero_dos);
            }
            contador = contador + 1;
            numero = numero * -1;
            numero_dos = numero_dos + 2;

        } while (contador <= 7);

    }
}
