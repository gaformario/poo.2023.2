package Aula4;

import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();

        nomes.add("Dylan");
        nomes.add("Rafael");
        nomes.add("Gabriel");
        nomes.add("Humberto");
        nomes.add("Humberto");


        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
