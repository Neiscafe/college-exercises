package chatapp.domain;

import java.util.ArrayList;

/**
 *
 * @author m74048
 */
public interface MensagemRepository {
    ArrayList<Mensagem> getAllMessages(Contato c);
    void cleanAllMessages(Contato c);
    void cleanAllMessages();
    void sendMessage(Contato c, Mensagem m);
}
