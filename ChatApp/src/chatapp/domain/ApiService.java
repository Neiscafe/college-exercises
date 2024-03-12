/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp.domain;

import java.util.ArrayList;

/**
 *
 * @author m74048
 */
public interface ApiService {
    ArrayList<Contato> getAllContacts();
    void createContact(Contato c);
    void sendMessage(Contato c, Mensagem m);
    ArrayList<Mensagem> getAllMessages(Contato c);
    void cleanAllMessages(Contato c);
    void cleanAllMessages();
}
