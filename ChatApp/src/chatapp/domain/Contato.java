package chatapp.domain;

import java.time.LocalDate;
import java.util.UUID;
import static java.util.UUID.randomUUID;

public class Contato {
    final String id = randomUUID().toString();
    final String nome;
    final String dataUltimaMensagem;

    public Contato(String nome, String dataUltimaMensagem) {
        this.nome = nome;
        this.dataUltimaMensagem = dataUltimaMensagem;
    }
}
