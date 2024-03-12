package chatapp;

import chatapp.data.MockContatoRepository;
import chatapp.data.MockMensagemRepository;
import chatapp.domain.Contato;
import chatapp.domain.ContatoRepository;
import chatapp.domain.Mensagem;
import chatapp.domain.MensagemRepository;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChatApp {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final ContatoRepository contactRepo = new MockContatoRepository();
        final MensagemRepository mensagemRepo = new MockMensagemRepository();
        
        while (true) {
            System.out.println("Sua lista de contatos: ");
            ArrayList<Contato> contatos = contactRepo.getAllContatos();
            contatos.forEach(x -> {
                System.out.println(String.format("%s - %s | %s", x.getCodigo(), x.getNome(), x.getDataUltimaMensagemFormatada()));
            });
            String input = scan.next();
            Contato contatoSelecionado = contatos.stream().filter(x -> {
                return x.getCodigo().equals(input);
            }).findAny().orElse(null);
            if (contatoSelecionado==null) {
                System.out.println("O contato não existe!");
                continue;
            }
            System.out.println("/n/n/n");
            ArrayList<Mensagem> mensagens = mensagemRepo.getAllMessages(contatoSelecionado);
            mensagens.forEach(x->{
                System.out.println(String.format("%s : %s / %s", x.getConteudo(), x.getDataEnvio(), x.getDataLeitura()));
            });
        }
    }

}
