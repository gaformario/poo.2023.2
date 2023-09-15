package Aula5;

import Aula4.Cliente;
import Aula4.Conta;

public class MainObject {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carls Rafael");
        Cliente c2 = new Cliente("Carls Rafael");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.equals(c2));

        Conta conta1 = new Conta(c1);
        System.out.println(conta1);
    }

}
