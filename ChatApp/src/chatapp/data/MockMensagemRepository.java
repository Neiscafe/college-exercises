/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp.data;

import chatapp.domain.ApiService;
import chatapp.domain.Contato;
import chatapp.domain.Mensagem;
import chatapp.domain.MensagemRepository;
import java.util.ArrayList;

/**
 *
 * @author m74048
 */
public class MockMensagemRepository implements MensagemRepository {
    private final ApiService api;
    
    public MockMensagemRepository() {
        api = new MockApiService();
    }
    
    @Override
    public ArrayList<Mensagem> getAllMessages(Contato c) {
        return api.getAllMessages(c);
    }

    @Override
    public void cleanAllMessages(Contato c) {
        api.cleanAllMessages(c);
    }

    @Override
    public void cleanAllMessages() {
       api.cleanAllMessages();
    }

    @Override
    public void sendMessage(Contato c, Mensagem m) {
        api.sendMessage(c, m);
    }
    
}
