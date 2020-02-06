/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.LinkedMenuSaveItem;
import BackEnd.LinkedMenuSistemaItem;
import BackEnd.Save;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import BackEnd.Sistema;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Login extends javax.swing.JFrame {

    
    private Sistema sistemaLogin;

    public Login(Sistema sistema) {
        sistemaLogin = sistema;
        sistemaLogin.setCurrentUser(null); //Current User null
        initComponents();
        refreshMenu(); //Atualiza o menu
        setLabelsVisible(false); //Torna os labels de erro não visíveis
        setTitle(Sistema.NOMEPROGRAMA + " - Login"); //Título da janela
        setIconImage(sistemaLogin.getIconFrame()); //Ícon da janela
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//Fechar a janela não faz nada
        setLocationRelativeTo(null);//Janela no meio do ecrã
        addWindowListener(new WindowAdapter() {//adiciona um listener
            @Override
            public void windowClosing(WindowEvent e) { //Listener de fechar a janela
                if (!sistemaLogin.isSaved()) {//Se houver alterações
                    int input = JOptionPane.showConfirmDialog(null, "Pretende guardar as alterações feitas?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
                    switch (input) {
                        case 0: { //se responder SIM
                            try {
                                sistemaLogin.setDashboardWindow(null);
                                sistemaLogin.setProjetoWindow(null);
                                sistemaLogin.setTodosProjetosWindow(null);
                                sistemaLogin.writeSistema(null); //Remove as referências para as janelas e tenta guardar o ficheiro em disco
                            } catch (IOException ex) {
                                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        System.exit(0); //fecha o programa
                        case 1: //responder NÃO
                            System.exit(0); //fecha o programa
                    }
                } else {//se não houver alterações
                    System.exit(0); //fecha o programa
                }
            }
        });      
    }

    public void refreshMenu() { //Atualiza o menu

        selecionarGravaçõesFicheiroMenu.removeAll();//remove todos os saves do menu de selecionar gravações
        eliminarGravaçõesFicheiroMenu.removeAll();//remove todos os saves do menu de eliminar gravações
        for (Save save : sistemaLogin.getListaSaves()) {//para cada save 

            selecionarGravaçõesFicheiroMenu.add(new LinkedMenuSaveItem(sistemaLogin, save, LinkedMenuSaveItem.MUDAR)); //adicionar ao menu de selecionar
            eliminarGravaçõesFicheiroMenu.add(new LinkedMenuSaveItem(sistemaLogin, save, LinkedMenuSaveItem.APAGAR)); //adicionar ao menu de eliminar
        }
        if (sistemaLogin.getListaSaves().size() > 1) {
            eliminarGravaçõesFicheiroMenu.add(new JPopupMenu.Separator());
            eliminarGravaçõesFicheiroMenu.add(new LinkedMenuSistemaItem(sistemaLogin, LinkedMenuSistemaItem.ELIMINAR));//adicionar ao menu item para eliminar todas
        }
        eliminarGravaçõesFicheiroMenu.add(new JPopupMenu.Separator());
        eliminarGravaçõesFicheiroMenu.add(new LinkedMenuSistemaItem(sistemaLogin, LinkedMenuSistemaItem.RESETARDEFAULT)); //adicionar ao menu item para resetar a default
    }

    public void setLabelsVisible(boolean booleano) {
        usernameEmptyLabel.setVisible(booleano);
        passwordEmptyLabel.setVisible(booleano);
        usernameErrorLabel.setVisible(booleano);
        passwordErrorLabel.setVisible(booleano);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameEmptyLabel = new javax.swing.JLabel();
        usernameErrorLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        passwordEmptyLabel = new javax.swing.JLabel();
        passwordErrorLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        EntrarButton = new javax.swing.JButton();
        registarButton = new javax.swing.JButton();
        passwordCheckBox = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        ficheiroMenu = new javax.swing.JMenu();
        guardarFicheiroItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        novaFicheiroItem = new javax.swing.JMenuItem();
        selecionarGravaçõesFicheiroMenu = new javax.swing.JMenu();
        eliminarGravaçõesFicheiroMenu = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        sobreMenu = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestor de Projetos - Login");
        setBackground(new java.awt.Color(54, 54, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(410, 330));
        setMinimumSize(new java.awt.Dimension(410, 330));
        setPreferredSize(new java.awt.Dimension(410, 330));
        setResizable(false);
        setSize(new java.awt.Dimension(410, 350));

        LoginLabel.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        LoginLabel.setText("Login");

        usernameLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        usernameLabel.setText("Username");

        usernameTextField.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        usernameTextField.setToolTipText("Username");
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyReleased(evt);
            }
        });

        usernameEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        usernameEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        usernameEmptyLabel.setText("*");

        usernameErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        usernameErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
        usernameErrorLabel.setText("Introduza um username existente");

        passwordLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyReleased(evt);
            }
        });

        passwordEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        passwordEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        passwordEmptyLabel.setText("*");

        passwordErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        passwordErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
        passwordErrorLabel.setText("Introduza a password correta");

        sairButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        EntrarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        EntrarButton.setText("Entrar");
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });

        registarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        registarButton.setText("Registar");
        registarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarButtonActionPerformed(evt);
            }
        });

        passwordCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordCheckBox.setText("Mostrar ");
        passwordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckBoxActionPerformed(evt);
            }
        });

        ficheiroMenu.setText("Ficheiro");
        ficheiroMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                ficheiroMenuMenuSelected(evt);
            }
        });

        guardarFicheiroItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardarFicheiroItem.setText("Guardar");
        guardarFicheiroItem.setToolTipText("Guarda todas as gravações em ficheiro");
        guardarFicheiroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFicheiroItemActionPerformed(evt);
            }
        });
        ficheiroMenu.add(guardarFicheiroItem);
        ficheiroMenu.add(jSeparator1);

        novaFicheiroItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        novaFicheiroItem.setText("Nova");
        novaFicheiroItem.setToolTipText("Cria uma nova gravação e autoseleciona-la para edição");
        novaFicheiroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaFicheiroItemActionPerformed(evt);
            }
        });
        ficheiroMenu.add(novaFicheiroItem);

        selecionarGravaçõesFicheiroMenu.setText("Gravações");
        selecionarGravaçõesFicheiroMenu.setToolTipText("Escolher uma gravação para edição");
        ficheiroMenu.add(selecionarGravaçõesFicheiroMenu);

        eliminarGravaçõesFicheiroMenu.setText("Eliminar");
        eliminarGravaçõesFicheiroMenu.setToolTipText("Gerir as gravações guardadas");
        ficheiroMenu.add(eliminarGravaçõesFicheiroMenu);
        ficheiroMenu.add(jSeparator2);

        jMenuBar1.add(ficheiroMenu);
        ficheiroMenu.getAccessibleContext().setAccessibleName("File");

        sobreMenu.setText("Sobre");

        sobreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        sobreMenuItem.setText("Sobre Gestor de Projetos");
        sobreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuItemActionPerformed(evt);
            }
        });
        sobreMenu.add(sobreMenuItem);

        jMenuBar1.add(sobreMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameErrorLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(passwordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordErrorLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameLabel)
                                        .addComponent(passwordLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordTextField)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sairButton)
                                .addGap(3, 3, 3)
                                .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registarButton))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLabel)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(usernameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordErrorLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        String erro = "";
        if (usernameTextField.getText().isEmpty()) {//Se username estiver vazio, adicionar ao erro
            usernameEmptyLabel.setVisible(true);
        }
        if (String.valueOf(passwordTextField.getPassword()).isEmpty()) { //Se password estiver vazia, tornar passwordEmptyLabel visível
            passwordEmptyLabel.setVisible(true);
        }
        if (usernameTextField.getText().isEmpty() || String.valueOf(passwordTextField.getPassword()).isEmpty()) {//Se username ou password estiverem vazios, adicionar ou erro
            erro += "Faltam preencher campos.\n";
        }
        if (!sistemaLogin.getCurrentSave().getListaUsersSave().isUserNameListaUsers(usernameTextField.getText())) { //Se username não for encontrado, adicionar ou erro 
            usernameErrorLabel.setVisible(true);
            erro += "Username não encontrado.\n";
        } else {
            if (!sistemaLogin.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameTextField.getText()).getPasswordUser().equals(String.valueOf(passwordTextField.getPassword()))) {//Se password não corresponder à password do utilizador, adicionar ou erro
                passwordErrorLabel.setVisible(true);
                erro += "Password errada.\n";
            }
        }
        if (erro.isEmpty()) {//se não houver erros
            sistemaLogin.setCurrentUser(sistemaLogin.getCurrentSave().getListaUsersSave().getUserListaUsers(usernameTextField.getText()));//tornar o current user, o user logado
            new Dashboard(sistemaLogin).setVisible(true);//nova janela Dashboard
            dispose();//dispose da janela
        } else {//se houver errors
            JOptionPane.showMessageDialog(this, erro, "Erro de Login", JOptionPane.ERROR_MESSAGE);//mensagem de erro
        }

    }//GEN-LAST:event_EntrarButtonActionPerformed

    private void registarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarButtonActionPerformed
        dispose();//faz dispose da janela
        new Registo(sistemaLogin).setVisible(true); // nova janela de registo
    }//GEN-LAST:event_registarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        if (!sistemaLogin.isSaved()) {//Se houver alterações
            int input = JOptionPane.showConfirmDialog(null, "Pretende guardar as alterações feitas?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Mensagem de confirmação
            switch (input) {
                case 0: //Se responder SIM
                    try {
                        sistemaLogin.setCurrentUser(null);
                        sistemaLogin.setDashboardWindow(null);
                        sistemaLogin.setProjetoWindow(null);
                        sistemaLogin.setTodosProjetosWindow(null);
                        sistemaLogin.writeSistema(null); //Tenta guardadar(depois de eliminar as referências para as janelas)
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.exit(0);//fecha o programa
                    break;
                case 1:// Se responder NÃO
                    System.exit(0); //fecha o programa
                    break;
            }
        } else {//se não houver alterações
            System.exit(0); //fecha o programa 
        }
    }//GEN-LAST:event_sairButtonActionPerformed

    private void passwordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckBoxActionPerformed
        if (passwordCheckBox.isSelected()) {
            passwordTextField.setEchoChar((char) 0);//Mostra os caracteres
        } else {
            passwordTextField.setEchoChar('•');//Esconde os caracteres
        }
    }//GEN-LAST:event_passwordCheckBoxActionPerformed

    private void usernameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyReleased
        usernameTextField.setText(usernameTextField.getText().trim());
        usernameEmptyLabel.setVisible(false);
        usernameErrorLabel.setVisible(false);
        if (usernameTextField.getText().isEmpty()) {
            usernameEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_usernameTextFieldKeyReleased

    private void passwordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyReleased
        passwordErrorLabel.setVisible(false);
        passwordEmptyLabel.setVisible(false);
        if (String.valueOf(passwordTextField.getPassword()).isEmpty()) {
            passwordEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_passwordTextFieldKeyReleased

    private void guardarFicheiroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFicheiroItemActionPerformed
        try {
            sistemaLogin.setDashboardWindow(null);
            sistemaLogin.setProjetoWindow(null);
            sistemaLogin.setTodosProjetosWindow(null);
            sistemaLogin.writeSistema(this);//tenta guardar o ficheiro depois de eliminar as referências para janelas
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarFicheiroItemActionPerformed

    private void novaFicheiroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaFicheiroItemActionPerformed
        String nome = JOptionPane.showInputDialog(null, "Nova gravação", "Escolha o seu nome.", JOptionPane.DEFAULT_OPTION);//Mensagem de input para escolher nome
         if (nome != null) {//se não cancelar
            if (nome.isBlank()) {//se for vazia
                JOptionPane.showMessageDialog(this, "Nome em branco não permitido.", "Nome inválido", JOptionPane.CANCEL_OPTION);//mensagem de erro
            } else {

                if (sistemaLogin.containsNomeSave(nome)) { // se nome já em  uso
                    JOptionPane.showMessageDialog(this, "Nome já em uso.", "Nome inválido", JOptionPane.CANCEL_OPTION); //mensagem de erro
                } else {
                    Save novoSave = new Save(nome);
                    sistemaLogin.setCurrentSave(novoSave);
                    sistemaLogin.getListaSaves().add(novoSave);
                    JOptionPane.showMessageDialog(this, "Nova gravação " + sistemaLogin.getCurrentSave().getNomeSave() + "gerada com sucesso e selecionada para edição.", "Mudança de gravação.", JOptionPane.WARNING_MESSAGE);//mensagem de erro
                    sistemaLogin.setSaved(false);
                    refreshMenu();
                }
            }
        } 

    }//GEN-LAST:event_novaFicheiroItemActionPerformed

    private void ficheiroMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_ficheiroMenuMenuSelected
        refreshMenu();// Atualiza a barra de menu
    }//GEN-LAST:event_ficheiroMenuMenuSelected

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        new Sobre(sistemaLogin).setVisible(true);//Cria uma instância Sobre e torna-la visível
    }//GEN-LAST:event_sobreMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JMenu eliminarGravaçõesFicheiroMenu;
    private javax.swing.JMenu ficheiroMenu;
    private javax.swing.JMenuItem guardarFicheiroItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem novaFicheiroItem;
    private javax.swing.JCheckBox passwordCheckBox;
    private javax.swing.JLabel passwordEmptyLabel;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registarButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JMenu selecionarGravaçõesFicheiroMenu;
    private javax.swing.JMenu sobreMenu;
    private javax.swing.JMenuItem sobreMenuItem;
    private javax.swing.JLabel usernameEmptyLabel;
    private javax.swing.JLabel usernameErrorLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
