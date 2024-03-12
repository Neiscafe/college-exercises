/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp.data;

import chatapp.domain.ApiService;
import chatapp.domain.Contato;
import chatapp.domain.Mensagem;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author m74048
 */
public class MockApiService implements ApiService {

    private ArrayList<Contato> contatos;
    private ArrayList<Mensagem> mensagens;

    public MockApiService() {
        contatos = new ArrayList();
        contatos.add(new Contato("999", "Global", "2024-03-11"));
        contatos.add(new Contato("1", "Douglas", "2024-03-11"));
        contatos.add(new Contato("2", "Alex", "2024-03-11"));
        mensagens = new ArrayList();
    }

    @Override
    public ArrayList<Contato> getAllContacts() {
        return contatos;
    }

    @Override
    public void createContact(Contato c) {
        contatos.add(c);
    }

    @Override
    public void sendMessage(Contato c, Mensagem m) {

    }

    @Override
    public ArrayList<Mensagem> getAllMessages(Contato c) {
        Stream<Mensagem> filtradas = mensagens.stream().filter(x -> c.getId().equals(x.getSenderId()));
        return (ArrayList) filtradas.collect(Collectors.toList());
    }

    @Override
    public void cleanAllMessages(Contato c) {
        mensagens.removeIf(x -> {
            return x.getSenderId().equals(c.getId());
        });
    }

    @Override
    public void cleanAllMessages() {
        mensagens.clear();
    }
}
