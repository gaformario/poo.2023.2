public class Ex3 {
    public static void main(String[] args) { 
        long numero = 600851475143L;
        long maiorDivisor = 1;

        for (long i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                maiorDivisor = i;
                numero /= i;
            }
        }

        System.out.println("O maior divisor primo de 600851475143 é: " + maiorDivisor);
    }
}