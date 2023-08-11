public class Ex2Lista {
    public static void main(String[] args) {
        int soma = 0;

        int limite = 4000000;

        int anterior = 1;
        int atual = 2;

        while (atual <= limite) {
            if (atual % 2 == 0) {
                soma+= atual;
                
            }

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            
        }

        System.out.println("Soma dos numeros pares: " + soma);
    }
}
