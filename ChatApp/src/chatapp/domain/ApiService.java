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
    public abstract ArrayList<Contato> getAllContacts();
    public abstract void createContact(Contato c);
    public abstract void alterContact(Contato c);
}
