//Exemplo basico de uma classe em java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Chamando a classe de variaveis
        Variables.example();

        System.out.println();

        //Chamando a classe de condições
        Conditionals.example();

        System.out.println();

        //Exemplo com uso de metodos
        Method.exemple("Leandro");

        System.out.println();

        //Exemplo com o uso de datas
        Date.Example();

        System.out.println();

        //Exemplo com o uso de loops
        Loops.exemple();

        //Exemplo usando exceções
        Exceptions.exemple();
    }
}