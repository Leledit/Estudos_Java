public class Loops {
    public static void exemple(){

        //Exemplo do uso do for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }

        //Exemplo do uso do while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }

        //Exemplo do uso de for-each
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        //Exemplo usando break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // interrompe o loop quando i é igual a 5
            }
            System.out.println(i);
        }

        //Exemplo usando continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // pula a iteração quando i é igual a 2
            }
            System.out.println(i);
        }
    }
}
