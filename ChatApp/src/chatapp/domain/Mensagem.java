package chatapp.domain;

public class Mensagem {
    final String conteudo;
    final String dataEnvio;
    final String dataRecebida;
    final Contato contato;

    public Mensagem(String conteudo, String dataEnvio, String dataRecebida, Contato contato) {
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.dataRecebida = dataRecebida;
        this.contato = contato;
    }
}
