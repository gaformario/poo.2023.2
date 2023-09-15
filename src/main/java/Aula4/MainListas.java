package Aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainListas {
    
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Dylan");
        nomes.add("Rafael");
        nomes.add("Gabriel");
        nomes.add("Humberto");
        nomes.add("Humberto");
        nomes.remove("Humberto");


        Collections.sort(nomes);
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
