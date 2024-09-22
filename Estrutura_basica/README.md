# Estrutura basica do java

A linguagem Java é baseada em classe e métodos (linguagem orientada a objeto - poo) Todo código precisa estar dentro de uma classe. O método main é o ponto de entrada de execução.

<strong>A estrutura básica:</strong> Cada programa Java precisa de uma classe principal que contém o método “main”, onde a execução do programa começa.

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!"); // Exibe mensagem no console
        }
    }

<strong>Classe:</strong> Cada código Java é escrito dentro de uma classe. No exemplo acima, a classe é Main.

<strong>Método main:</strong> É o ponto de entrada para qualquer aplicação Java. A assinatura exata é public static void main(String[] args).

<strong>System.out.println():</strong> Utilizado para exibir texto no console.

## Case-sensitive

Java é uma linguagem case-sensitive, o que significa que distingue maiúsculas de minúsculas. Isso implica que palavras com a mesma sequência de letras, mas com letras maiúsculas ou minúsculas diferentes, são tratadas como diferentes.

Nomes de variaveis: Em Java, "minhaVariavel" e "minhavarivel" são nomes de variáveis completamente diferentes, pois a linguagem diferencia as letras maiúsculas e minúsculas.

    int minhaVariavel = 10;
    int MinhaVariavel = 20;
    
    System.out.println(minhaVariavel);  // Imprime 10
    System.out.println(MinhaVariavel);  // Imprime 20

Nomes de métodos: "metodoExemplo" e "metodoexemplo" são considerados métodos distintos.

    public void metodoExemplo() {
        System.out.println("Método com 'E' maiúsculo.");
    }
    
    public void metodoexemplo() {
        System.out.println("Método com 'e' minúsculo.");
    }

Nomes de classes: "MinhaClasse" e "minhaclasse" são classes completamente diferentes

    public class MinhaClasse {
        // código
    }
    
    public class minhaclasse {
        // código
    }

## Palavras chaves

As palavras chaves, são palavras que não podem ser usadas no java, pois elas são reservadas a recursos da linguagem como: Abstract, Assert, Boolean, Break, Byte, Case, Catch, Char, Class, Const

## Linguagem Estaticamente Tipada

Em uma linguagem estaticamente tipada, o tipo de cada variável (como int, String, boolean, etc.) é determinado em tempo de compilação, ou seja, antes de o programa ser executado. Isso significa que você precisa declarar o tipo de cada variável explicitamente ou que o compilador precisa ser capaz de inferir o tipo de alguma forma antes que o programa seja executado.

Em Java, você deve declarar o tipo das variáveis no momento em que as cria. Se tentar atribuir valores de tipos diferentes de forma incorreta, você receberá erros de compilação.

    int idade = "trinta";  // Erro! Você não pode atribuir uma String a um int

## Comentarios
Comentários: são partes do código que não são executados, servem para a documentação, exemplo
    
    /*
        Comentario de varias linhas
    */

    // Comentatio de uma unica linha

<hr/>

# Tipos de dados em Java

Os tipos de dados especificam os diferentes tamanhos e valores que podem ser armazenados na variável. Existem dois tipos de dados em Java:

<strong>Tipos de dados primitivos: </strong> Os tipos de dados primitivos incluem boolean, char, byte, short, int, long, float e double.

<strong>Tipos de dados não primitivos: </strong> Os tipos de dados não primitivos incluem Classes , Interfaces e Arrays .

## Dados primitivos

Na linguagem Java, tipos de dados primitivos são os blocos de construção da manipulação de dados. Esses são os tipos de dados mais básicos disponíveis na linguagem Java .
    
 - <strong>boolean:</strong> Armazenar apenas dois valores possíveis: true e false.
 - <strong>byte:</strong> É um inteiro de complemento de dois com sinal de 8 bits. Seu intervalo de valores fica entre -128 e 127 (inclusive
 - <strong>char:</strong> É um único caractere Unicode de 16 bits.
 - <strong>short:</strong>  É um inteiro de complemento de dois com sinal de 16 bits. Seu intervalo de valores fica entre -32.768 a 32.767 (inclusive)
 - <strong>int:</strong> É um inteiro de complemento de dois com sinal de 32 bits
 - <strong>long:</strong> É um inteiro de complemento de dois de 64 bits.
 - <strong>float:</strong> É um ponto flutuante IEEE 754 de precisão simples de 32 bits.
 - <strong>double:</strong> É um ponto flutuante IEEE 754 de 64 bits de precisão dupla

## Dados não primitivos

Os tipos de referência armazenam endereços de memória (ou referências) que apontam para objetos. Ao contrário dos tipos primitivos, esses tipos são armazenados no heap e possuem comportamento (métodos) associado a eles. Aqui estão alguns exemplos:

 - <strong>Classes</strong>: Uma classe é um tipo referenciado, e toda instância de classe é um objeto. Qualquer classe que você definir ou usar é considerada um tipo referenciado.

       class Pessoa {
        String nome;
        int idade;
       }
    
       Pessoa pessoa1 = new Pessoa();

 - <strong>Strings</strong>: Embora pareça um tipo primitivo, String em Java é uma classe (portanto, um tipo referenciado).
            
       String texto = "Hello, Java!";

 - <strong>Arrays</strong>: Arrays em Java também são tipos referenciados, mesmo que contenham tipos primitivos. Um array é um objeto que armazena uma coleção de elementos do mesmo tipo.

        int[] numeros = {1, 2, 3, 4, 5};
        Pessoa[] pessoas = new Pessoa[10];

 - <strong>Interfaces</strong>: Uma interface em Java define um contrato que outras classes devem seguir. Como os objetos que implementam interfaces são tipos de referência, eles podem ser tratados como o tipo da interface.

       interface Animal {
          void fazerSom();
       }

       class Cachorro implements Animal {
          public void fazerSom() {
             System.out.println("Au Au");
          }
       }
    
       Animal meuCachorro = new Cachorro(); 

- <strong>Enums (Enumerações)</strong>: Um enum é um tipo especial de classe que representa um conjunto fixo de constantes. Ele é tratado como um tipo referenciado em Java.

      enum DiaDaSemana {
       SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
      }

      DiaDaSemana dia = DiaDaSemana.SEGUNDA;

Nota: Tipos de referência podem conter o valor especial null, que indica a ausência de um objeto.Nos tipos primitivos é obrigado haver um valor, não é possível deixar uma variável como o valor null (se ela for um int, deve conter 0, quando queremos que a mesma não tenha nenhum valor).

## Wrappers (Empacotamento de tipos primitivos)

Java também fornece classes wrapper que encapsulam os tipos primitivos em um objeto, permitindo que eles sejam tratados como tipos referenciados. Essas classes são úteis quando você precisa usar tipos primitivos em estruturas que exigem objetos, como as classes genéricas ArrayList ou HashMap.

- byte -> Byte
- short -> Short
- int -> Integer
- long -> Long
- float -> Float
- double -> Double
- char -> Character
- boolean -> Boolean

<hr>

# Variaveis 

Uma variável é um contêiner que contém o valor enquanto o programa Java é executado. Uma variável é atribuída com um tipo de dado. elas podem ser de três tipos: “local”, “instância” e estática 

 - <strong>Local</strong>: Uma variável declarada dentro do corpo do método é chamada de variável local. Você pode usar essa variável somente dentro daquele método e os outros métodos na classe nem sequer sabem que a variável existe.
 - <strong>Instância</strong>: Uma variável declarada dentro da classe, mas fora do corpo do método, é chamada de variável de instância
 - <strong>Estática</strong>: Uma variável que é declarada como estática é chamada de variável estática. Ela não pode ser local. Você pode criar uma única cópia da variável estática e compartilhá-la entre todas as instâncias da classe. A alocação de memória para variáveis estáticas acontece apenas uma vez quando a classe é carregada na memória.

       public class A{  
         static int m=100;//static variable  
         void method(){    
           int n=90;//local variable    
         }  
         public static void main(String args[]){  
          int data=50;//instance variable    
         }  
       }

<hr>

# Condicionais

Permitem que o código tome decisões com base em expressões que podem ser verdadeiras ou falsas. Isso possibilita que o programa execute diferentes blocos de código dependendo da condição.

## If

A instrução if é usada para executar um bloco de código se uma condição for verdadeira. Você pode adicionar a cláusula else para executar outro bloco de código se a condição for falsa e else if para testar múltiplas condições.

      if (condição) {
         // código executado se a condição for verdadeira
      } else if (outraCondição) {
         // código executado se outraCondição for verdadeira
      } else {
         // código executado se nenhuma condição anterior for verdadeira
      }
## Switch

O switch é uma alternativa ao if-else quando você tem múltiplas condições para testar a igualdade de uma variável com diferentes valores. Ele torna o código mais legível quando há muitas opções.

      switch (variável) {
         case valor1:
         // código executado se variável == valor1
         break;
      case valor2:
         // código executado se variável == valor2
         break;
      // você pode ter quantos cases forem necessários
         default:
         // código executado se nenhum case for verdadeiro
         break;
      }

O break é usado para sair do switch após executar um bloco de código. Se você não usar break, o código continuará executando os próximos cases (o que geralmente não é desejado).

O default é opcional e será executado se nenhuma das condições anteriores for atendida.

## Operador ternário

O operador ternário é uma forma concisa de escrever uma condição if-else. Ele pode ser útil para expressões simples, onde você quer atribuir um valor com base em uma condição.


<strong>Notas</strong>: Mantenha suas condições simples e claras. Se uma condição if ou um switch estiver muito complexo, considere refatorar o código em métodos separados.

<strong>Notas</strong>: Use o operador ternário com moderação. Ele é útil para condições curtas, mas pode tornar o código confuso se usado de forma excessiva ou com expressões longas.

## Operadores de comparação

Permiten que o código tome decisões com base em condições específicas, sendo eles

- <strong>' ==: '</strong> Testa se dois valores são iguais.
- <strong>' !=: '</strong> Verifica se dois valores são diferentes.
- <strong>' >: '</strong> Determina se um valor é maior que o outro.
- <strong>' <: '</strong> Verifica se um valor é menor que o outro.
- <strong>' >=: '</strong> Testa se um valor é maior ou igual ao outro.
- <strong>' <=: '</strong> Avalia se um valor é menor ou igual ao outro.

## Operadores Lógicos

são frequentemente usados em conjunto com os operadores de comparação para formar condições mais complexas:

- <strong> &&: </strong> Retorna verdadeiro se ambas as condições forem verdadeiras.
- <strong> ||: </strong> Retorna verdadeiro se pelo menos uma das condições for verdadeira.

<strong>Nota:</strong> Para comparar objetos em Java (como String), use o método .equals(), pois == verifica a referência de memória, não o valor em si.

# Métodos/Funções 

Um método é um bloco de código que só é executado quando é chamado.Você pode passar dados, conhecidos como parâmetros, para um método.

Métodos são usados ​​para executar certas ações e também são conhecidos como funções. Por que usar métodos? Para reutilizar código: defina o código uma vez e use-o muitas vezes.

O java já vem com alguns métodos pré definidos, como é o caso do “System.out.println()”, mas podemos criar os nossos proprios metodos. Os métodos devem ser declarados sempre dentro de uma class, devemos indicar o tipo do método “static” por exemplo, depois o tipo de retorno “void”, depois o nome seguido de parentes, dentro dos parentes é possível passar parâmetros (que vão ser usados dentro do método). 

      public class Main {
         static void myMethod() {
            // code to be executed
         }
      }

Para chamar a sua nova classe, devemos levar algumas coisas em conta. caso a classe que irá chamar o seu novo método, esteja no mesmo escopo, você só precisará usar o nome do método mais os parentes.

Caso a classe (que vai chamar o seu método), esteja fora do escopo da sua classe recém criada, será necessário,instanciar ela (caso não seja estática), para só depois usar o método 

      myMethod();

## Parâmetros e Argumentos

Informações podem ser passadas para métodos como um parâmetro. Parâmetros agem como variáveis ​​dentro do método. Os parâmetros são especificados após o nome do método, dentro dos parênteses. Você pode adicionar quantos parâmetros quiser, basta separá-los com uma vírgula.

      public class Main {
         static void myMethod(String fname) {
            System.out.println(fname + " Refsnes");
         }
      
         public static void main(String[] args) {
            myMethod("Liam");
            myMethod("Jenny");
            myMethod("Anja");
         }
      }

<strong>Nota</strong>:  ao trabalhar com vários parâmetros, a chamada do método deve ter o mesmo número de argumentos e parâmetros, e os argumentos devem ser passados ​​na mesma ordem.

## Expressões lambda

É um pequeno bloco de código que recebe parâmetros e retorna um valor. Expressões lambda são semelhantes a métodos, mas não precisam de um nome e podem ser implementadas diretamente no corpo de um método.

      public class Main {
         public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(5);
            numbers.add(9);
            numbers.forEach( (n) -> { System.out.println(n); } );
         }
      }
<hr>

# Trabalhando com data

Quando precisamos trabalhar com datas e horas em java, podemos recorrer a uma série de bibliotecas que já estão disponíveis para uso (Não é necessário reinventar a roda). algumas dessas bibliotecas são

- <strong>java.time.LocalDate</strong> — Representa apenas a hora de acordo com o calendário ISO.
- <strong>java.time.LocalTime</strong> — Representa apenas a hora de forma legível por humanos.
- <strong>java.time.LocalDateTime</strong> — Tanto a Data quanto a Hora sem fuso horário serão manipuladas aqui. Esta é uma combinação de LocalDate e LocalTime.
- <strong>java.time.ZonedDateTime</strong> — LocalDateTime combina com o fuso horário fornecido usando a classe ZoneId .
- <strong>java.time.OffsetTime</strong> — Manipula o tempo com um deslocamento de fuso horário correspondente de Greenwich/UTC, sem um ID de fuso horário.
- <strong>java.time.OffsetDateTime</strong> — Manipula uma data e hora com um deslocamento de fuso horário correspondente de Greenwich/UTC, sem um ID de fuso horário.
- <strong>java.time.Clock</strong> — Fornece acesso ao instante, data e hora atuais em qualquer fuso horário.
- <strong>java.time.Instant</strong> — representa o início de um nanossegundo na linha do tempo e é útil para gerar um registro de data e hora para representar o tempo da máquina
- <strong>java.time.Duration</strong> — Diferença entre dois instantes, medida em segundos ou nanossegundos e não usa construções baseadas em datas, como anos, meses e dias, embora a classe forneça métodos que convertem para dias, horas e minutos.
- <strong>java.time.Period</strong> — Para definir a diferença entre datas em valores baseados em datas (anos, meses, dias).
- <strong>java.time.ZoneId</strong> — especifica um identificador de fuso horário e fornece regras para conversão entre um Instant e um LocalDateTime .
- <strong>java.time.ZoneOffset</strong> — Especifica um deslocamento de fuso horário de Greenwich/UTC.

<hr>

# Trabalhando com loops

São usados para executar repetidamente um bloco de código enquanto uma condição é verdadeira ou para percorrer uma coleção de dados. Eles são essenciais para automatizar tarefas repetitivas.

## For

Este é usado quando você sabe o número de vezes que deseja repetir um bloco de código. Ele possui três partes principais: "inicialização", "condição" e "atualização".

      for (int i = 0; i < 5; i++) {
         System.out.println("Contagem: " + i);
      }

## While

Este é usado quando você deseja repetir um bloco de código enquanto uma condição for verdadeira . Ao contrário for, o whileé mais adequado quando você não sabe exatamente quantas vezes o loop será executado.

      int contador = 0;
      while (contador < 5) {
         System.out.println("Contagem: " + contador);
         contador++;
      }

## For-each

Este é usado para percorrer arrays ou coleções . Ele simplifica a sintaxe quando você precisa iterar sobre todos os elementos de uma coleção, sem precisar gerenciar contadores manualmente.

      int[] numeros = {1, 2, 3, 4, 5};
      for (int numero : numeros) {
         System.out.println("Número: " + numero);
      }

## Uso do break e do continue

- <strong>break:</strong> é usado para encerrar um loop imediatamente . Quando o breaké encontrado, o loop é interrompido e a execução continua fora do loop.
- <strong>continue:</strong> é usado para pular a iteração atual e continuar com a próxima iteração do loop. Ou seja, ele pula o restante do código dentro do loop para aquela iteração específica.

<hr>

# Tratamento de exceções

O tratamento de exceções é o processo de gerenciar e responder a condições excepcionais que podem ocorrer durante a execução de um programa

Quando surge uma situação excepcional, um objeto de exceção é criado e lançado para propagar o erro na pilha de chamadas até que ele seja capturado e tratado.

## Exceções verificadas e não verificadas

<strong>Exceções verificadas:</strong> São exceções que são verificadas em tempo de compilação, o que significa que o compilador impõe o tratamento dessas exceções. Exemplos incluem IOException, SQLException e ClassNotFoundException.

<strong>Exceções não verificadas:</strong> Também conhecidas como exceções de tempo de execução, essas exceções não exigem tratamento explícito e não são verificadas pelo compilador. Exemplos incluem NullPointerException, ArrayIndexOutOfBoundsException e ArithmeticException.

## Bloco try-catch

O bloco try-catch é a construção fundamental usada para manipular exceções em Java. O bloco try contém o código que pode lançar uma exceção, enquanto o bloco catch manipula a exceção se ela ocorrer

      try {
         // Código que pode lançar uma exceção
      } catch (Exception e) {
         // Código de tratamento de exceção
      }

É possível fazer o tratamento de vários blocos de try-catch separados, podendo cada um deles realizar o tratamento. Os blocos catch são avaliados sequencialmente, e o primeiro bloco catch correspondente é executado

      try {
         // Código que pode lançar uma exceção
      } catch (IOException e) {
         // Código de tratamento de IOException
      } catch (SQLException e) {
         // Código de tratamento de SQLException
      } catch (Exception e) {
         // Código genérico de tratamento de exceção
      }

finally: é opcional, mas útil ao lidar com tratamento de exceções. Ele permite executar código de limpeza que deve sempre ser executado. é executado independete se uma exeção é lançada ou não

      try {
         // Código que pode lançar uma exceção
      } catch (Exception e) {
         // Código de tratamento de exceção
      } finally {
         // Código de limpeza
      }

## throw 

Caso seja necessário é possível fazer o lançamento de exceções explicitamente usando o throw.

      public  void  validateAge ( int age)  throws IllegalArgumentException {
         if (age < 0 ) {
            throw  new  IllegalArgumentException ( "A idade não pode ser negativa" );
         }
      }

<strong>Nota:</strong> é possível criar exceções personalizadas, ao criar suas próprias class, sendo essa estendida da class “Exception” ou “RuntimeException”.Exceções personalizadas podem encapsular erros específicos do aplicativo e fornecer informações mais significativas durante o tratamento de exceções.

      public class CustomException extends Exception {
          public CustomException(String message) {
              super(message);
          }
      }


