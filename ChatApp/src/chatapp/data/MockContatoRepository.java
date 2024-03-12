/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp.data;

import chatapp.domain.ApiService;
import chatapp.domain.Contato;
import chatapp.domain.ContatoRepository;
import java.util.ArrayList;

public class MockContatoRepository implements ContatoRepository {
    private final ApiService api;

    public MockContatoRepository() {
        api = new MockApiService();
    }
    
    @Override
    public ArrayList<Contato> getAllContatos() {
        return api.getAllContacts();
    }

    @Override
    public void criarContato(Contato c) {
        api.createContact(c);
    }
    
}
