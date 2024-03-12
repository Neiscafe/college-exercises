package chatapp.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import static java.util.UUID.randomUUID;

public class Contato {
    private final String id = randomUUID().toString();
    private final String codigo;
    private final String nome;
    private final String dataUltimaMensagem;

    public Contato(String codigo, String nome, String dataUltimaMensagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataUltimaMensagem = dataUltimaMensagem;
    }    

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataUltimaMensagem() {
        return dataUltimaMensagem;
    }    

    public String getCodigo() {
        return codigo;
    }
    
    public String getDataUltimaMensagemFormatada(){
        LocalDate data = LocalDate.parse(getDataUltimaMensagem());
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return dataFormatada;
    }
   
}
