package chatapp.domain;

import java.util.ArrayList;

/**
 *
 * @author m74048
 */
public interface ContatoRepository {
    ArrayList<Contato> getAllContatos();
    void criarContato(Contato c);
}
