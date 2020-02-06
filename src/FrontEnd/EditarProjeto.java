/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Projeto;
import BackEnd.Sistema;
import BackEnd.User;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class EditarProjeto extends javax.swing.JFrame {

    private Sistema sistemaEditarProjeto;
    private Projeto projetoEditarProjeto;
    DefaultListModel usersAssociadosListModel = new DefaultListModel();
    DefaultListModel usersNãoAssociadosListModel = new DefaultListModel();

    public EditarProjeto(Sistema sistema, Projeto projeto) {
        sistemaEditarProjeto = sistema;
        projetoEditarProjeto = projeto;
        initComponents();
        setCurrentValues(); //carrega os valores do projeto
        setUserListsModels(); //carrega a lista de utilizadores
        setSelectedDate(); //carrega a data limite
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Fechar janela não faz nada
        setTitle(Sistema.NOMEPROGRAMA + "Código : " + projetoEditarProjeto.getCodProjeto() + " / Título: " + projetoEditarProjeto.getTítuloProjeto());//Título da janela
        setIconImage(sistema.getIconFrame()); //Ícon da janela
        setLocationRelativeTo(null); //Janela no meio do ecrã
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarProjetoLabel = new javax.swing.JLabel();
        descriçãoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        removerButton = new javax.swing.JButton();
        AdicionarButton = new javax.swing.JButton();
        dataLimiteLabel = new javax.swing.JLabel();
        userAssociadosTabbedPane = new javax.swing.JTabbedPane();
        userAssociadosScrollPane = new javax.swing.JScrollPane();
        userAssociadosLista = new javax.swing.JList<>();
        utilizadoresTabbedPane = new javax.swing.JTabbedPane();
        utilizadoresScrollPane = new javax.swing.JScrollPane();
        utilizadoresLista = new javax.swing.JList<>();
        editarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        horasLimiteComboBox = new javax.swing.JComboBox<>();
        minutosLimiteComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataLimiteChooserCombo = new datechooser.beans.DateChooserCombo();
        nomeEmptyLabel = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();
        códigoProjetoValue = new javax.swing.JLabel();
        códigoProjetoLabel = new javax.swing.JLabel();
        descriçãoScrollPane = new javax.swing.JScrollPane();
        descriçãoEditorPane = new javax.swing.JEditorPane();
        dataLimiteLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 700));
        setResizable(false);

        editarProjetoLabel.setFont(new java.awt.Font("Lucida Console", 0, 28)); // NOI18N
        editarProjetoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editarProjetoLabel.setText("Editar Projeto");

        descriçãoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        descriçãoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriçãoLabel.setText("Descrição");

        nomeLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeLabel.setText("Código");

        nomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTextFieldKeyReleased(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        AdicionarButton.setText("Adicionar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        dataLimiteLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataLimiteLabel.setText("Data Limite");

        userAssociadosLista.setToolTipText("");
        userAssociadosLista.setDragEnabled(true);
        userAssociadosScrollPane.setViewportView(userAssociadosLista);

        userAssociadosTabbedPane.addTab("Associados", userAssociadosScrollPane);

        utilizadoresScrollPane.setViewportView(utilizadoresLista);

        utilizadoresTabbedPane.addTab("Utilizadores", utilizadoresScrollPane);

        editarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        voltarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        horasLimiteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        minutosLimiteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutosLimiteComboBox.setToolTipText("Horas");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Minutos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Horas");

        dataLimiteChooserCombo.setFormat(1);
        dataLimiteChooserCombo.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 18));
        dataLimiteChooserCombo.setLocale(new java.util.Locale("pt", "PT", ""));

        nomeEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        nomeEmptyLabel.setText("*");

        eliminarButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        códigoProjetoValue.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N

        códigoProjetoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        códigoProjetoLabel.setText("Nome");

        descriçãoScrollPane.setViewportView(descriçãoEditorPane);

        dataLimiteLabel1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataLimiteLabel1.setText("Hora Limite");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userAssociadosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(utilizadoresTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descriçãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarProjetoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataLimiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dataLimiteLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(horasLimiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minutosLimiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dataLimiteChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(códigoProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(códigoProjetoValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(descriçãoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(voltarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(editarProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(códigoProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeEmptyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(códigoProjetoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataLimiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataLimiteChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasLimiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosLimiteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLimiteLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriçãoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriçãoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userAssociadosTabbedPane)
                    .addComponent(utilizadoresTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarButton)
                    .addComponent(removerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextFieldKeyReleased
        nomeEmptyLabel.setVisible(false);
        if (nomeTextField.getText().isEmpty()) {
            nomeEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_nomeTextFieldKeyReleased

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        for (String usersSelecionados : userAssociadosLista.getSelectedValuesList()) {//Retira utilizador da listamodel de associados e adiciona-lo à lista de não associados
            usersNãoAssociadosListModel.addElement(usersSelecionados);
            usersAssociadosListModel.removeElement(usersSelecionados);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
        for (String usersSelecionados : utilizadoresLista.getSelectedValuesList()) {//Adiciona utilizador para a lista de assoacidos e remove-lo da lista de não associados
            usersAssociadosListModel.addElement(usersSelecionados);
            usersNãoAssociadosListModel.removeElement(usersSelecionados);
        }
    }//GEN-LAST:event_AdicionarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();//faz dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        if (!sistemaEditarProjeto.getCurrentSave().getListaProjetosSave().getListaProjetos().contains(projetoEditarProjeto)) {//Se projeto não for encontrado, manda mensagem de erro
            JOptionPane.showMessageDialog(this, "Este projeto não existe ou foi eliminado", "Erro ao editar o projeto.", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        int intConfirmar = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende apagar o Projeto " + projetoEditarProjeto.getTítuloProjeto() + " ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
        if (intConfirmar == 0) {//Se responder SIM
            sistemaEditarProjeto.getCurrentSave().getListaProjetosSave().getListaProjetos().remove(projetoEditarProjeto);
            sistemaEditarProjeto.setSaved(false);
            sistemaEditarProjeto.getProjetoWindow().dispose();
            sistemaEditarProjeto.getDashboardWindow().refreshUI();
            dispose();
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        if (!sistemaEditarProjeto.getCurrentSave().getListaProjetosSave().getListaProjetos().contains(projetoEditarProjeto)) {//Se projeto não for encontrado manda mensagem de erro
            JOptionPane.showMessageDialog(this, "Este projeto não existe ou foi eliminado", "Erro ao editar o projeto.", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        String erro = "";
        if (dataLimiteChooserCombo.getSelectedDate() != null) {
            if (LocalDateTime.of(dataLimiteChooserCombo.getSelectedDate().get(Calendar.YEAR), dataLimiteChooserCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteChooserCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH), horasLimiteComboBox.getSelectedIndex(), minutosLimiteComboBox.getSelectedIndex()).isBefore(LocalDateTime.now())) {
                erro += "Data Limite inválida (Data antes de hoje).\n";
            }
        } else {
            erro += "Data Limite inválida.\n";
        }
        if (nomeTextField.getText().isEmpty()) {//Se nome estiver vazio acrescentar ao erro
            erro += "Nome inválido.\n";
            nomeLabel.setVisible(true);
        }

        if (!erro.isEmpty()) {//se houver erros

            JOptionPane.showMessageDialog(this, erro, "Erro ao editar o projeto.", JOptionPane.ERROR_MESSAGE); //mander mensagems de erro
        } else {
            int confirmarInt = JOptionPane.showConfirmDialog(this, "Confirmação", "Tem a certeza que pretende alterar os dados deste projeto?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
            if (confirmarInt == 0) {//Se responder SIM
                projetoEditarProjeto.setTítuloProjeto(nomeTextField.getText());//editar  título
                projetoEditarProjeto.setDescriçãoProjeto(descriçãoEditorPane.getText()); // editar descrição
                projetoEditarProjeto.setDataLimiteProjeto(LocalDateTime.of(dataLimiteChooserCombo.getSelectedDate().get(Calendar.YEAR), dataLimiteChooserCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataLimiteChooserCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH), horasLimiteComboBox.getSelectedIndex(), minutosLimiteComboBox.getSelectedIndex()));//editar data limite
                projetoEditarProjeto.getListaAssociatedUsersProjeto().getListaUsers().clear(); //remove todos os utilizadores da lista  de associados
                for (Object usernameAdicionado : usersAssociadosListModel.toArray()) { //adiciona à lista de associados utlizadores associados
                    projetoEditarProjeto.getListaAssociatedUsersProjeto().getListaUsers().add(sistemaEditarProjeto.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameAdicionado.toString().substring(usernameAdicionado.toString().indexOf("( ") + 2, usernameAdicionado.toString().indexOf(" )"))));
                }
                sistemaEditarProjeto.setSaved(false);  //Atualizar o estado do sistema como não gravado
                sistemaEditarProjeto.getDashboardWindow().refreshUI();//Atualiza as janelas do sistema
                dispose();//faz dispose da janela
            }
        }
    }//GEN-LAST:event_editarButtonActionPerformed

    public void setUserListsModels() {//Carrega a listaModel de utilizadores associados e utilizadores não associados
        for (User user : sistemaEditarProjeto.getCurrentSave().getListaUsersSave().getListaUsers()) {
            if (!user.equals(sistemaEditarProjeto.getCurrentUser())) {
                if (!projetoEditarProjeto.getListaAssociatedUsersProjeto().getListaUsers().contains(user)) {
                    usersNãoAssociadosListModel.addElement(user.getNomeUser() + " ( " + user.getUsernameUser() + " )");
                } else {
                    usersAssociadosListModel.addElement(user.getNomeUser() + " ( " + user.getUsernameUser() + " )");
                }
            }
        }
        userAssociadosLista.setModel(usersAssociadosListModel);
        utilizadoresLista.setModel(usersNãoAssociadosListModel);
    }

    public void setSelectedDate() {//Carrega a data Limite
        LocalDateTime instant = projetoEditarProjeto.getDataLimiteProjeto();
        Calendar calendarStart = Calendar.getInstance();
        horasLimiteComboBox.setSelectedIndex(projetoEditarProjeto.getDataLimiteProjeto().getHour());
        minutosLimiteComboBox.setSelectedIndex(projetoEditarProjeto.getDataLimiteProjeto().getMinute());
        calendarStart.set(instant.getYear(), instant.getMonthValue() - 1, instant.getDayOfMonth());
        dataLimiteChooserCombo.setSelectedDate(calendarStart);
    }

    public void setCurrentValues() { //carrega os dados do projeto
        nomeEmptyLabel.setVisible(false);
        códigoProjetoValue.setText(String.valueOf(projetoEditarProjeto.getCodProjeto()));
        nomeTextField.setText(projetoEditarProjeto.getTítuloProjeto());
        descriçãoEditorPane.setText(projetoEditarProjeto.getDescriçãoProjeto());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JLabel códigoProjetoLabel;
    private javax.swing.JLabel códigoProjetoValue;
    private datechooser.beans.DateChooserCombo dataLimiteChooserCombo;
    private javax.swing.JLabel dataLimiteLabel;
    private javax.swing.JLabel dataLimiteLabel1;
    private javax.swing.JEditorPane descriçãoEditorPane;
    private javax.swing.JLabel descriçãoLabel;
    private javax.swing.JScrollPane descriçãoScrollPane;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel editarProjetoLabel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JComboBox<String> horasLimiteComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> minutosLimiteComboBox;
    private javax.swing.JLabel nomeEmptyLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JList<String> userAssociadosLista;
    private javax.swing.JScrollPane userAssociadosScrollPane;
    private javax.swing.JTabbedPane userAssociadosTabbedPane;
    private javax.swing.JList<String> utilizadoresLista;
    private javax.swing.JScrollPane utilizadoresScrollPane;
    private javax.swing.JTabbedPane utilizadoresTabbedPane;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
