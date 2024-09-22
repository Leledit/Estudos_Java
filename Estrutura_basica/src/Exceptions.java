public class Exceptions {
    public static void exemple(){
        //exemplos simples de try catch
        try {
            // Código que pode lançar uma exceção
        } catch (Exception e) {
            // Código de tratamento de exceção
        }

        //Usando o final

        try {
            // Código que pode lançar uma exceção
        } catch (Exception e) {
            // Código de tratamento de exceção
        } finally {
            // Código de limpeza
        }

        //Usando o throw
        validateAge(0);
    }

    public static void validateAge(Integer age)throws IllegalArgumentException {
        if (age < 0 ) {
            throw  new  IllegalArgumentException ( "A idade não pode ser negativa" );
        }
    }
}
