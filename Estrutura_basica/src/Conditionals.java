public class Conditionals {
    public static void example(){
        //Exemplo do uso da condicional if (com elses)

        int number = 10;

        if (number > 10) {
            System.out.println("O número é maior que 10");
        } else if (number == 10) {
            System.out.println("O número é igual a 10");
        } else {
            System.out.println("O número é menor que 10");
        }

        //Exemplo com o uso do switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }

        //Exemplo de uso do operador tenario
        int numberTested = 5;
        String resultado = (numberTested > 0) ? "Positivo" : "Negativo";
        System.out.println(resultado);

        //Operadores logicos
        int x = 10;
        int y = 20;

        if (x <= y || x == y){
            System.out.println("Esta condição é verdadeira.");
        }else{
            System.out.println("Esta condição é falsa.");
        }

    }
}
