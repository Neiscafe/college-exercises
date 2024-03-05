/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp.data;

import chatapp.domain.ApiService;
import chatapp.domain.Contato;
import java.util.ArrayList;

/**
 *
 * @author m74048
 */
public class ApiServiceImpl implements ApiService{
    private ArrayList<Contato> contatos = new ArrayList();

    @Override
    public ArrayList<Contato> getAllContacts() {
        return contatos;
    }

    @Override
    public void createContact(Contato c) {
        contatos.add(c);
    }

    @Override
    public void alterContact(Contato c) {
        contatos.
    }
    
}
