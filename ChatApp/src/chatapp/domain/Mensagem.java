package chatapp.domain;

import static java.util.UUID.randomUUID;

public class Mensagem {
    private final String conteudo;
    private final String dataEnvio;
    private String dataLeitura;
    private final String id = randomUUID().toString();
    private final String senderId;

    public Mensagem(String conteudo, String dataEnvio, String dataLeitura, String senderId) {
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.dataLeitura = dataLeitura;
        this.senderId = senderId;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public String getId() {
        return id;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }
}
