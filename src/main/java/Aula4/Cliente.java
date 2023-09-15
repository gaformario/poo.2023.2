package Aula4;

import java.util.UUID;

public class Cliente {

    String id;
    String nome;

    public Cliente(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + ":" + nome;
    }


}
