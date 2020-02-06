/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
//Classe que estende a classe JmenuteItem permitindo a inclusão de objetos Save, podendo assim ser adicionadas a um menu que e ser modificadas através do tratamento de eventos.
public class LinkedMenuSaveItem extends JMenuItem implements ActionListener {

    private Sistema sistema;
    private Save save;
    private int opção;
    public static final int MUDAR = 0;
    public static final int APAGAR = 1;

    public LinkedMenuSaveItem(Sistema sistema, Save save, int opção) {
        super(save.getNomeSave());
        this.sistema = sistema;
        this.save = save;
        this.opção = opção;
        addActionListener(this);
        if (save.equals(sistema.getCurrentSave())) {
            setText(getText() + " (Atual)");
        }
        setToolTipText(" Último save: " + save.getDataÚltimoSave());
    }

    @Override
    public void actionPerformed(ActionEvent e) {                                                //Evento rescrito para que a quando do click no MenuItem a gravação possa ser selecionada para edição no objeto Sistema ou apagada da lista de gravações
        if (this.opção == MUDAR) {//MUDA a gravação selecionada
            if (!save.equals(sistema.getCurrentSave())) {//Se a gravação for selecionada não for a atual
                sistema.setCurrentSave(save);//muda a gravação
                JOptionPane.showMessageDialog(null, "Gravação " + sistema.getCurrentSave().getNomeSave() + " selecionada para edição.", "Mudança de gravação.", JOptionPane.WARNING_MESSAGE);//mensagem de aviso
                sistema.setSaved(false);//sistema não gravado
            }
        }
        if (opção == APAGAR) {//APAGA a gravação selecionada
            if (save.getNomeSave().equals("Default")) {//mensagem de aviso. default não pode ser apagada
                JOptionPane.showMessageDialog(null, "Não é permitido apagar a gravação default", "Erro ao apagar gravação", JOptionPane.ERROR_MESSAGE);
            } else {//se não for a defult
                int input = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende apagar a gravação " + save.getNomeSave(), "Apagar gravação", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
                if (input == 0) {//se responder SIM

                    if (save.equals(sistema.getCurrentSave())) {//se a selecionada for a atual
                        sistema.getListaSaves().remove(save);//remove
                        sistema.setCurrentSave(sistema.getListaSaves().get(0));//seleciona a default
                    } else {//se não
                        sistema.getListaSaves().remove(save);//remove a selecionada
                    }

                    JOptionPane.showMessageDialog(null, "A gravação " + save.getNomeSave() + " foi apagada.", "Gravação apagada", JOptionPane.INFORMATION_MESSAGE);//mensagem de aviso
                    sistema.setSaved(false);//sistema não gravado
                }
            }
        }

    }
}
