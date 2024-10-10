import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Recuerda que 1 es si y 0 es no");

        System.out.println("Funciona");

        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("No lo toques");
                System.out.println("Sin problemas");
            break;
            case 0:
                System.out.println("¿lo tocaste?");

                int numero2 = sc.nextInt();
                if (numero2 == 0){
                System.out.println("¿Tendrás problemas?");

                int numero3 = sc.nextInt();
                if (numero3 == 0){
                    System.out.println("Olvidate del tema");
                    System.out.println("Sin problemas");

                }else if (numero3 == 1){
                    System.out.println("Pobre inbecil");
                    System.out.println("¿Puedes culpar a alguien?");

                    int numero4 = sc.nextInt();
                    if (numero4 == 1){
                        System.out.println("Sin problemas");
                    }else if (numero4 == 0){
                        System.out.println("Olvidate del tema");
                        System.out.println("Sin problemas");
                    }
                }
                }else if (numero2 == 1){
                    System.out.println("¡La Cagaste!");
                    System.out.println("¿Álguien lo sabe?");

                    int numero5 = sc.nextInt();
                    if (numero5 == 0){
                        System.out.println("Escondelo :D");
                        System.out.println("Sin problemas");

                    }else if (numero5 == 1){
                        System.out.println("Pobre imbecil");
                        System.out.println("¿Puedes culpar a alguien?");

                        int numero6 = sc.nextInt();
                        if (numero6 == 1){
                            System.out.println("Sin problemas");
                        }else if (numero6 == 0){
                            System.out.println("Olvidate del tema");
                            System.out.println("Sin problemas");
                        }
                    }
                }
            break;
            default:
                System.out.println("No has respondido correctamente, estás en problemas :I");
        }

        sc.close();
/*
        if(numero == 1){
            System.out.println("¡No lo toques!");
            System.out.println("Sin problemas");
        }else if(numero == 0){
            System.out.println("¿lo tocaste?");
            if(numero == 1){
                System.out.println(" ");
            }
        }
 */
    }
}