package tp;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        EpicDoubleHashMap<Integer, String, String> map = new EpicDoubleHashMap<>();

        Scanner scr = new Scanner(System.in);
        int opc= -1;
        while (opc !=6){
            System.out.print("=".repeat(50));
            System.out.println("\nBienvenido a nuestro Menu de Operaciones!");

            System.out.println("\n1.Mostrar key por 1 Valor \n2.Mostrar key por otro valor \n3.Mostrar Key por 2 valores "
                    + "\n4.Remover key \n5.Salir \n");
            System.out.print("\nPor favor elija su opcion: ");

            opc = scr.nextInt();

            switch (opc) {
                case 1:
                    map.addFirstType(5,"Bulldog");
                    System.out.println(map.getFirstMap1());
                    System.out.print(" ");
                    break;

                case 2:
                    map.addSecondType(2,"Bull Terrier");
                    System.out.println(map.getSecondMap2());
                    System.out.print(" ");
                    break;

                case 3:
                    System.out.println(map.addTwo(1,"Chihuahua", "Pitbull"));
                    System.out.print(" ");
                    break;

                case 4:
                    map.removeFirstType(5);
                    System.out.println(map.getFirstMap1());
                    System.out.print(" ");
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Seleccion Incorrecta. Ingrese una opcion del menu.");
                    break;
            }
        }
        System.out.println("\nPrograma finalizado!");
    }



        /*EpicDoubleHashMap<Integer, String, String> map = new EpicDoubleHashMap<>();
        map.addFirstType(5,"Bulldog");
        map.addSecondType(2,"Bull Terrier");
        map.addTwo(1,"Chihuahua", "Pitbull");
        System.out.println(map.getSecondMap2(5));

        map.removeFirstType(5);
        System.out.println(map.getFirstMap1());


        System.out.println("Trabajo Practico 2");
*/





}




