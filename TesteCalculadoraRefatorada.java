package calculadora_refatorada;

/**
 * Classe de teste para a CalculadoraRefatorada.
 * 
 * Testa todas as operações matemáticas e tratamento de exceções para:
 * - Divisão por zero
 * - Operador inválido
 */
public class TesteCalculadoraRefatorada {
    public static void main(String[] args){
        CalculadoraRefatorada calc = new CalculadoraRefatorada();

        // Testando soma
        System.out.println(calc.calcular(2, 3, "+")); // Resultado esperado: 5

        // Testando subtração
        System.out.println(calc.calcular(10, 4, "-")); // Resultado esperado: 6

        // Testando multiplicação
        System.out.println(calc.calcular(3, 5, "*")); // Resultado esperado: 15

        // Testando divisão
        System.out.println(calc.calcular(8, 2, "/")); // Resultado esperado: 4

        // Testando divisão por zero (deve lançar exceção)
        try{
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage()); // Exibe mensagem de erro
        }

        // Testando operador inválido (deve lançar exceção)
        try{
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage()); // Exibe mensagem de erro
        }
    }
}
