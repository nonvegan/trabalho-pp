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
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
//Classe que estende a classe JmenuteItem permitindo a inclusão de objetos Sistema, podendo assim ser adicionadas a um menu que e ser modificadas através do tratamento de eventos.
public class LinkedMenuSistemaItem extends JMenuItem implements ActionListener {

    private Sistema sistema;
    private User user;
    private int opção;
    public static final int ELIMINAR = 0;
    public static final int RESETARDEFAULT = 1;

    public LinkedMenuSistemaItem(Sistema sistema, int opção) {
        super();
        this.sistema = sistema;
        this.opção = opção;
        if (opção == ELIMINAR) {
            setText("Apagar todas");
            setToolTipText("Apaga todas as gravações, exceto a Default.");
        }
        if (opção == RESETARDEFAULT) {
            setText("Resetar Default");
            setToolTipText("Substitui a gravação default por uma nova.");
        }
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {          //Evento rescrito para que a quando do click no MenuItem todas as gravações podem ser eliminadas ou a gravação default pode ser resetada.
        if (opção == ELIMINAR) {
            int confirmarInt = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende eliminar todas as gravações exceto a Default?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
            if (confirmarInt == 0) {//se SIM
                Save saveDefault = sistema.getListaSaves().get(0);//elimina todas as gravações exceto a primeira(default);
                sistema.getListaSaves().clear();
                sistema.getListaSaves().add(saveDefault);
                sistema.setCurrentSave(saveDefault);
            }
        }

        if (opção == RESETARDEFAULT) {//RESETA a primeira gravação(default)
            int confirmarInt = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende resetar a gravação Default?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
            if (confirmarInt == 0) {//se SIM
                if (sistema.getCurrentSave().getNomeSave().equals("Default")) {//se a gravação selecionda for a default
                    sistema.getListaSaves().set(0, new Save("Default").newDefaultSave());
                    sistema.setCurrentSave(sistema.getListaSaves().get(0));//seleciona a nova default
                } else {
                    sistema.getListaSaves().set(0, new Save("Default").newDefaultSave());//reseta a primeira, default
                }
            }
        }

    }
}
