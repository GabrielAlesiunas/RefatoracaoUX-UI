package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calc(2, 3, "+"); //Esperado 5
        calc.calc(10, 4, "-"); //Esperado 6
        calc.calc(3, 3, "*"); //Esperado 15
        calc.calc(8, 2, "/"); //Esperado 4
        calc.calc(8, 0, "/");  //Divisão por zero 
        calc.calc(5, 5, "x");  //Operação inválida
    }
}