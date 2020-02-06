/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
//Classe que estende a classe JmenuteItem permitindo a inclusão de objetos User, podendo assim ser adicionadas a um menu que e ser modificadas através do tratamento de eventos.
public class LinkedMenuUserItem extends JMenuItem implements ActionListener {

    private Sistema sistema;
    private User user;
    private int opção;
    public static final int ABRIR = 0;

    public LinkedMenuUserItem(Sistema sistema, User user, int opção) {                  //Evento rescrito para que a quando do click no MenuItem o perfil do utilizador seja aberto.
        super(user.getNomeUser() + " ( " + user.getUsernameUser() + " )");
        this.sistema = sistema;
        this.user = user;
        if (sistema.getCurrentUser().equals(user)) {
            setText(getText() + " (Você)");
        }
        setToolTipText("<Nome Utilizador> (<username>)");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (opção == ABRIR) {
            new Perfil(sistema, user).setVisible(true);
        }
    }

}
