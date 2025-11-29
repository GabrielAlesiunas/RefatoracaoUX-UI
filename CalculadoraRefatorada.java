package calculadora_refatorada;

/**
 * Classe CalculadoraRefatorada
 * 
 * Esta classe implementa operações matemáticas básicas (soma, subtração, multiplicação e divisão)
 * e um método genérico "calcular" que recebe dois números e um operador.
 */
public class CalculadoraRefatorada {

    /**
     * Realiza a soma de dois inteiros.
     * 
     * @param a Primeiro número
     * @param b Segundo número
     * @return A soma de a e b
     */
    public int somar(int a, int b){
        return a + b;
    }

    /**
     * Realiza a subtração de dois inteiros.
     * 
     * @param a Primeiro número
     * @param b Segundo número
     * @return A diferença entre a e b
     */
    public int subtrair(int a, int b){
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois inteiros.
     * 
     * @param a Primeiro número
     * @param b Segundo número
     * @return O produto de a e b
     */
    public int multiplicar(int a, int b){
        return a * b;
    }

    /**
     * Realiza a divisão de dois inteiros.
     * Lança IllegalArgumentException se o divisor for zero.
     * 
     * @param a Dividendo
     * @param b Divisor
     * @return O resultado da divisão a / b
     * @throws IllegalArgumentException se b for 0
     */
    public int dividir(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * Realiza o cálculo de acordo com o operador fornecido.
     * Suporta operadores: "+", "-", "*", "/".
     * Lança IllegalArgumentException para operador inválido.
     * 
     * @param a Primeiro número
     * @param b Segundo número
     * @param operador Operador matemático como string
     * @return Resultado do cálculo
     * @throws IllegalArgumentException se operador for inválido ou divisão por zero
     */
    public int calcular(int a, int b, String operador){
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
