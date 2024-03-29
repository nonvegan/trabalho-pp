/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.ListaTarefas;
import BackEnd.Projeto;
import BackEnd.Sistema;
import BackEnd.Tarefa;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class TarefaFrontEnd extends javax.swing.JFrame {

    private Sistema sistemaTarefaFrontEnd;
    private Tarefa tarefaTarefaFrontEnd;
    private Projeto projetoTarefaFrontEnd;
    private ListaTarefas listaTarefaFrontEnd;

    public TarefaFrontEnd(Sistema sistema, Tarefa tarefa) {
        sistemaTarefaFrontEnd = sistema;
        tarefaTarefaFrontEnd = tarefa;
        projetoTarefaFrontEnd = sistemaTarefaFrontEnd.getCurrentSave().getListaProjetosSave().getProjetoTarefa(tarefaTarefaFrontEnd);
        listaTarefaFrontEnd = projetoTarefaFrontEnd.getListaTarefasTarefaProjeto(tarefaTarefaFrontEnd);
        initComponents();
        setCurrentValues();//carrega os valores da tarefa
        setTitle(Sistema.NOMEPROGRAMA + " - Tarefa -  " + tarefaTarefaFrontEnd.getTítuloTarefa() + " ( " + projetoTarefaFrontEnd.getTítuloProjeto());//Título da janela
        setIconImage(sistemaTarefaFrontEnd.getIconFrame());//Ícon da janela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//fechar janela faz dispose da janela
        setLocationRelativeTo(null);//centra a janela
        if (tarefaTarefaFrontEnd.getOwnerTarefa() != sistemaTarefaFrontEnd.getCurrentUser() && projetoTarefaFrontEnd.getOwnerProjeto() != sistemaTarefaFrontEnd.getCurrentUser()) {// se não for owner do projeto e da tarefa, não pode editar a tarefa
            editarButton.setVisible(false);
        }
        if (tarefaTarefaFrontEnd.getOwnerTarefa() != sistemaTarefaFrontEnd.getCurrentUser() && tarefaTarefaFrontEnd.getAssociatedUserTarefa() != sistemaTarefaFrontEnd.getCurrentUser()) {// se não for owner da tarefa e associado à tarefa  não pode concluír a tarefa
            concluírCheckBox.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButton = new javax.swing.JButton();
        dataCriaçãoLabel = new javax.swing.JLabel();
        prioridadeLabel = new javax.swing.JLabel();
        perfilLabel = new javax.swing.JLabel();
        ownerLabel = new javax.swing.JLabel();
        utlizadorAssociadoLabel = new javax.swing.JLabel();
        dataLimiteLabel = new javax.swing.JLabel();
        dataConclusãoLabel = new javax.swing.JLabel();
        títuloLabel = new javax.swing.JLabel();
        utlizadorAssociadoValue = new javax.swing.JLabel();
        editarButton = new javax.swing.JToggleButton();
        títuloValue = new javax.swing.JLabel();
        dataLimiteValue = new javax.swing.JLabel();
        dataCriaçãoValue = new javax.swing.JLabel();
        ownerValue = new javax.swing.JLabel();
        prioridadeValue = new javax.swing.JLabel();
        dataConclusãoValue = new javax.swing.JLabel();
        descriçãoLabel = new javax.swing.JLabel();
        concluírCheckBox = new javax.swing.JCheckBox();
        descriçãoScrollPanel = new javax.swing.JScrollPane();
        descriçãoEditorPanel = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(525, 600));
        setResizable(false);

        voltarButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        dataCriaçãoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataCriaçãoLabel.setText("D. Criação");
        dataCriaçãoLabel.setToolTipText("Idade do utilizador");

        prioridadeLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        prioridadeLabel.setText("Prioridade");
        prioridadeLabel.setToolTipText("Data de Registo do utilizador");

        perfilLabel.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        perfilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilLabel.setText("Tarefa");

        ownerLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        ownerLabel.setText("Owner");
        ownerLabel.setToolTipText("Nome do utilizador");

        utlizadorAssociadoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        utlizadorAssociadoLabel.setText("Associado");
        utlizadorAssociadoLabel.setToolTipText("Sexo do utilizador");

        dataLimiteLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataLimiteLabel.setText("D. Limite");
        dataLimiteLabel.setToolTipText("Email do utilizador");

        dataConclusãoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataConclusãoLabel.setText("D. Conclusão");
        dataConclusãoLabel.setToolTipText("Número de telemóvel do utilizador");

        títuloLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        títuloLabel.setText("Título");
        títuloLabel.setToolTipText("Username do utilizador");

        utlizadorAssociadoValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        utlizadorAssociadoValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                utlizadorAssociadoValueMouseClicked(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        títuloValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        dataLimiteValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        dataCriaçãoValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        ownerValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ownerValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ownerValueMouseClicked(evt);
            }
        });

        prioridadeValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        dataConclusãoValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        descriçãoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descriçãoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriçãoLabel.setText("Descrição");

        concluírCheckBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        concluírCheckBox.setText("Concluída");
        concluírCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluírCheckBoxActionPerformed(evt);
            }
        });

        descriçãoEditorPanel.setEditable(false);
        descriçãoEditorPanel.setOpaque(false);
        descriçãoScrollPanel.setViewportView(descriçãoEditorPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dataLimiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataConclusãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(utlizadorAssociadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataCriaçãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ownerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(títuloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prioridadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(títuloValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ownerValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(utlizadorAssociadoValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataCriaçãoValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataLimiteValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prioridadeValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataConclusãoValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(concluírCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(descriçãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descriçãoScrollPanel)
                            .addComponent(perfilLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(voltarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editarButton, voltarButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(títuloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(títuloValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(utlizadorAssociadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utlizadorAssociadoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prioridadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridadeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataCriaçãoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCriaçãoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLimiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLimiteValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataConclusãoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataConclusãoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(concluírCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriçãoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriçãoScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButton))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editarButton, voltarButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();//dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        new EditarTarefa(sistemaTarefaFrontEnd, projetoTarefaFrontEnd, tarefaTarefaFrontEnd).setVisible(true);//nova janela editar
        dispose();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void ownerValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerValueMouseClicked
        new Perfil(sistemaTarefaFrontEnd, tarefaTarefaFrontEnd.getOwnerTarefa()).setVisible(true);
    }//GEN-LAST:event_ownerValueMouseClicked

    private void utlizadorAssociadoValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_utlizadorAssociadoValueMouseClicked
        new Perfil(sistemaTarefaFrontEnd, tarefaTarefaFrontEnd.getAssociatedUserTarefa()).setVisible(true);
    }//GEN-LAST:event_utlizadorAssociadoValueMouseClicked

    private void concluírCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluírCheckBoxActionPerformed
        if (concluírCheckBox.isSelected()) {//Se checkbox estiver concluída
            int confirmaçãoInt = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende concluír a tarefa " + tarefaTarefaFrontEnd.getTítuloTarefa() + " ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);//mensagem de confirmação
            if (confirmaçãoInt == 0) {//se SIM
                tarefaTarefaFrontEnd.terminarTarefa();
                sistemaTarefaFrontEnd.setSaved(false);//não gravado
                sistemaTarefaFrontEnd.getDashboardWindow().refreshUI();//atualiza as janelas
                dispose();
            } else {
                concluírCheckBox.setSelected(false);
            }
        } else {//Se checkbox estiver não concluída
            int confirmaçãoInt = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende continuar a tarefa " + tarefaTarefaFrontEnd.getTítuloTarefa() + " ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);//mensagem de confirmação
            if (confirmaçãoInt == 0) {//se SIM
                tarefaTarefaFrontEnd.recomeçarTarefa();
                sistemaTarefaFrontEnd.setSaved(false);//não gravado
                sistemaTarefaFrontEnd.getDashboardWindow().refreshUI();//atualiza as janelas
                dispose();
            }
        }
    }//GEN-LAST:event_concluírCheckBoxActionPerformed

    public void setCurrentValues() {//carrega os valores da tarefa
        títuloValue.setText(tarefaTarefaFrontEnd.getTítuloTarefa());
        ownerValue.setText(tarefaTarefaFrontEnd.getOwnerTarefa().getNomeUser() + " ( " + tarefaTarefaFrontEnd.getOwnerTarefa().getUsernameUser() + " )");
        utlizadorAssociadoValue.setText(tarefaTarefaFrontEnd.getAssociatedUserTarefa().getNomeUser() + " ( " + tarefaTarefaFrontEnd.getAssociatedUserTarefa().getUsernameUser() + " )");
        dataCriaçãoValue.setText(tarefaTarefaFrontEnd.getDataÍnicioTarefa().toLocalDate().toString() + "  " + tarefaTarefaFrontEnd.getDataÍnicioTarefa().getHour() + " : " + tarefaTarefaFrontEnd.getDataÍnicioTarefa().getMinute());
        dataLimiteValue.setText(tarefaTarefaFrontEnd.getDataLimiteTarefa().toLocalDate().toString() + "  " + tarefaTarefaFrontEnd.getDataLimiteTarefa().getHour() + " : " + tarefaTarefaFrontEnd.getDataLimiteTarefa().getMinute());
        if (!(tarefaTarefaFrontEnd.getDataConclusãoTarefa() == null)) {
            dataConclusãoValue.setText(tarefaTarefaFrontEnd.getDataConclusãoTarefa().toLocalDate().toString() + "  " + tarefaTarefaFrontEnd.getDataConclusãoTarefa().getHour() + " : " + tarefaTarefaFrontEnd.getDataConclusãoTarefa().getMinute());
        } else {
            dataConclusãoValue.setText(tarefaTarefaFrontEnd.getTempoStringTarefa());
            if (tarefaTarefaFrontEnd.isAtrasada()) {
                dataConclusãoValue.setForeground(Color.red);//Cor vermelhda se estiver atrasada
            } else {
                dataConclusãoValue.setForeground(new Color(34, 139, 34));//cor verde se não estiver atrasada
            }
        }
        if (tarefaTarefaFrontEnd.isConcluídaTarefa()) {
            concluírCheckBox.setSelected(true);
        } else {
            concluírCheckBox.setSelected(false);
        }
        prioridadeValue.setText(tarefaTarefaFrontEnd.getPrioridadeTarefa());
        descriçãoEditorPanel.setText(tarefaTarefaFrontEnd.getDescriçãoTarefa());
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox concluírCheckBox;
    private javax.swing.JLabel dataConclusãoLabel;
    private javax.swing.JLabel dataConclusãoValue;
    private javax.swing.JLabel dataCriaçãoLabel;
    private javax.swing.JLabel dataCriaçãoValue;
    private javax.swing.JLabel dataLimiteLabel;
    private javax.swing.JLabel dataLimiteValue;
    private javax.swing.JEditorPane descriçãoEditorPanel;
    private javax.swing.JLabel descriçãoLabel;
    private javax.swing.JScrollPane descriçãoScrollPanel;
    private javax.swing.JToggleButton editarButton;
    private javax.swing.JLabel ownerLabel;
    private javax.swing.JLabel ownerValue;
    private javax.swing.JLabel perfilLabel;
    private javax.swing.JLabel prioridadeLabel;
    private javax.swing.JLabel prioridadeValue;
    private javax.swing.JLabel títuloLabel;
    private javax.swing.JLabel títuloValue;
    private javax.swing.JLabel utlizadorAssociadoLabel;
    private javax.swing.JLabel utlizadorAssociadoValue;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
