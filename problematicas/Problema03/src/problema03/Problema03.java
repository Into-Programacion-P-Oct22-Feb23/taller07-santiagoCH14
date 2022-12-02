/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author DETPC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 2;
        int contador = 1;

        do {
            System.out.printf("%d\n", numero);
            numero = numero + 3;
            System.out.printf("%d\n", numero);
            numero = numero * 2;
            System.out.printf("%d\n", numero);
            numero = numero + 7;
            System.out.printf("%d\n", numero);
            numero = numero + 9;
            System.out.printf("%d\n", numero);
            numero = numero + 11;
            System.out.printf("%d\n", numero);
            contador = contador + 1;

        } while (contador <= 1);

    }

}
