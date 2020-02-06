/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.LinkedMenuUserItem;
import BackEnd.ListaTarefas;
import BackEnd.Projeto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import BackEnd.Sistema;
import BackEnd.Tarefa;
import BackEnd.User;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Dashboard extends javax.swing.JFrame {

    private Sistema sistemaDashboard;

    public Dashboard(Sistema sistema) {
        sistemaDashboard = sistema;
        initComponents();
        refreshMenu(); //atualiza a barra de menu
        refreshUI();//atualiza o UI
        setTitle(sistemaDashboard.NOMEPROGRAMA + " - Dashboard - Logado como " + sistemaDashboard.getCurrentUser().getNomeUser() + " ( " + sistemaDashboard.getCurrentUser().getUsernameUser() + " )"); //Nome da janela
        setIconImage(sistema.getIconFrame());  //Icon da janela
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //operação de fechar não faz nada
        setLocationRelativeTo(null);   //Janela no meio do ecrã
        meusProjetosPanel.setLayout(new BoxLayout(meusProjetosPanel, 3)); //Muda o layout do painel
        meusProjetosMaisAtrasadosPanel.setLayout(new BoxLayout(meusProjetosMaisAtrasadosPanel, 3)); //Muda o layout do painel
        meusProjetosMaisProblemáticosPanel.setLayout(new BoxLayout(meusProjetosMaisProblemáticosPanel, 3)); //Muda o layout do painel
        minhasTarefasPanel.setLayout(new BoxLayout(minhasTarefasPanel, 3)); //Muda o layout do painel
        sistemaDashboard.setDashboardWindow(this); //guarda a referência da janel dasahboard no objeto sistema
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {  //Adiciona um listener da janela a fcher
                if (!sistemaDashboard.isSaved()) {//Se o projeto apresentar alterações 
                    int input = JOptionPane.showConfirmDialog(null, "Pretende guardar as alterações feitas?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE); //Pergunta se pretende guardar as alterações, se responder CANCELAR NÃO FAZ NADA 
                    switch (input) {
                        case 0: { //Se responder SIM
                            try {
                                sistemaDashboard.setDashboardWindow(null);//Reseta a janela Dashboard do objeto Sistema
                                sistemaDashboard.setProjetoWindow(null); //Reseta a janela Projeto do objeto Sistema
                                sistemaDashboard.setTodosProjetosWindow(null); //Reseta a janela TodosProjetos do objeto Sistema
                                sistemaDashboard.writeSistema(null);//Tentar guardar a instância em ficheiro
                            } catch (IOException ex) {
                                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                        }
                        System.exit(0); //Fecha o programa
                        case 1:  //Se responder Não
                            System.exit(0); //Fecha o programa
                    }
                } else {//Se não apresentar alterações
                    System.exit(0);  //Fecha o programa
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        todosProjetosButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        editarPerfilButton = new javax.swing.JToggleButton();
        meusProjetosTabbedPane = new javax.swing.JTabbedPane();
        meusProjetosScrollPanel = new javax.swing.JScrollPane();
        meusProjetosPanel = new javax.swing.JPanel();
        meusProjetosMaisAtrasadosScrollPanel = new javax.swing.JScrollPane();
        meusProjetosMaisAtrasadosPanel = new javax.swing.JPanel();
        meusProjetosMaisProblemáticosScrollPanel = new javax.swing.JScrollPane();
        meusProjetosMaisProblemáticosPanel = new javax.swing.JPanel();
        minhasTarefasTabbedPane = new javax.swing.JTabbedPane();
        minhasTarefasScrollPanel = new javax.swing.JScrollPane();
        minhasTarefasPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nãoAtasadosProgressBar = new javax.swing.JProgressBar();
        atrasadosProgressBar = new javax.swing.JProgressBar();
        concluídosProgressBar = new javax.swing.JProgressBar();
        nãoAtrasadosValue = new javax.swing.JLabel();
        atrasadosValue = new javax.swing.JLabel();
        concluídosValue = new javax.swing.JLabel();
        ProjetoLabel = new javax.swing.JLabel();
        novoProjetoButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ficheiroMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        utilizadoresMenu = new javax.swing.JMenu();
        sobreMenu = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestor de Projetos - Dashboard - " + sistemaDashboard.getCurrentUser().getNomeUser() + " ( "+ sistemaDashboard.getCurrentUser().getUsernameUser() + " )");
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        todosProjetosButton.setText("Todos os Projetos");
        todosProjetosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosProjetosButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        editarPerfilButton.setText("Editar Perfil");
        editarPerfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilButtonActionPerformed(evt);
            }
        });

        meusProjetosTabbedPane.setToolTipText("Projetos não terminados, onde estou associado");
        meusProjetosTabbedPane.setMaximumSize(new java.awt.Dimension(1027, 612));
        meusProjetosTabbedPane.setMinimumSize(new java.awt.Dimension(1027, 612));
        meusProjetosTabbedPane.setPreferredSize(new java.awt.Dimension(1027, 612));

        meusProjetosScrollPanel.setMaximumSize(new java.awt.Dimension(620, 32767));

        meusProjetosPanel.setMaximumSize(new java.awt.Dimension(1027, 612));
        meusProjetosPanel.setMinimumSize(new java.awt.Dimension(1027, 612));

        javax.swing.GroupLayout meusProjetosPanelLayout = new javax.swing.GroupLayout(meusProjetosPanel);
        meusProjetosPanel.setLayout(meusProjetosPanelLayout);
        meusProjetosPanelLayout.setHorizontalGroup(
            meusProjetosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        meusProjetosPanelLayout.setVerticalGroup(
            meusProjetosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        meusProjetosScrollPanel.setViewportView(meusProjetosPanel);

        meusProjetosTabbedPane.addTab("Projetos em curso", meusProjetosScrollPanel);

        meusProjetosMaisAtrasadosPanel.setMaximumSize(new java.awt.Dimension(1027, 612));
        meusProjetosMaisAtrasadosPanel.setMinimumSize(new java.awt.Dimension(1027, 612));
        meusProjetosMaisAtrasadosPanel.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout meusProjetosMaisAtrasadosPanelLayout = new javax.swing.GroupLayout(meusProjetosMaisAtrasadosPanel);
        meusProjetosMaisAtrasadosPanel.setLayout(meusProjetosMaisAtrasadosPanelLayout);
        meusProjetosMaisAtrasadosPanelLayout.setHorizontalGroup(
            meusProjetosMaisAtrasadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        meusProjetosMaisAtrasadosPanelLayout.setVerticalGroup(
            meusProjetosMaisAtrasadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        meusProjetosMaisAtrasadosScrollPanel.setViewportView(meusProjetosMaisAtrasadosPanel);

        meusProjetosTabbedPane.addTab("Projetos em curso mais atrasados", meusProjetosMaisAtrasadosScrollPanel);

        meusProjetosMaisProblemáticosPanel.setMaximumSize(new java.awt.Dimension(1027, 612));
        meusProjetosMaisProblemáticosPanel.setMinimumSize(new java.awt.Dimension(1027, 612));
        meusProjetosMaisProblemáticosPanel.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout meusProjetosMaisProblemáticosPanelLayout = new javax.swing.GroupLayout(meusProjetosMaisProblemáticosPanel);
        meusProjetosMaisProblemáticosPanel.setLayout(meusProjetosMaisProblemáticosPanelLayout);
        meusProjetosMaisProblemáticosPanelLayout.setHorizontalGroup(
            meusProjetosMaisProblemáticosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        meusProjetosMaisProblemáticosPanelLayout.setVerticalGroup(
            meusProjetosMaisProblemáticosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        meusProjetosMaisProblemáticosScrollPanel.setViewportView(meusProjetosMaisProblemáticosPanel);

        meusProjetosTabbedPane.addTab("Projetos em curso mais problemáticos", meusProjetosMaisProblemáticosScrollPanel);

        minhasTarefasTabbedPane.setToolTipText("Tarefas não terminadas associadas a mim");
        minhasTarefasTabbedPane.setMaximumSize(new java.awt.Dimension(1027, 612));
        minhasTarefasTabbedPane.setMinimumSize(new java.awt.Dimension(1027, 612));
        minhasTarefasTabbedPane.setPreferredSize(new java.awt.Dimension(1027, 612));

        minhasTarefasPanel.setMaximumSize(new java.awt.Dimension(1027, 612));
        minhasTarefasPanel.setMinimumSize(new java.awt.Dimension(1027, 612));

        javax.swing.GroupLayout minhasTarefasPanelLayout = new javax.swing.GroupLayout(minhasTarefasPanel);
        minhasTarefasPanel.setLayout(minhasTarefasPanelLayout);
        minhasTarefasPanelLayout.setHorizontalGroup(
            minhasTarefasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        minhasTarefasPanelLayout.setVerticalGroup(
            minhasTarefasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        minhasTarefasScrollPanel.setViewportView(minhasTarefasPanel);

        minhasTarefasTabbedPane.addTab("Minhas Tarefas em curso", minhasTarefasScrollPanel);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Não Atrasados    Atrasados        Concluídos   ");

        nãoAtasadosProgressBar.setStringPainted(true);

        atrasadosProgressBar.setStringPainted(true);

        concluídosProgressBar.setStringPainted(true);

        nãoAtrasadosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nãoAtrasadosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        atrasadosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atrasadosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        concluídosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        concluídosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ProjetoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProjetoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        novoProjetoButton.setText("Novoprojeto");
        novoProjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProjetoButtonActionPerformed(evt);
            }
        });

        ficheiroMenu.setText("Ficheiro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ficheiroMenu.add(jMenuItem1);

        jMenuBar1.add(ficheiroMenu);

        utilizadoresMenu.setText("Utilizadores");
        jMenuBar1.add(utilizadoresMenu);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todosProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nãoAtasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nãoAtrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(concluídosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(concluídosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(17, 17, 17))
                                .addComponent(jLabel1)
                                .addComponent(ProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atrasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(atrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarPerfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minhasTarefasTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meusProjetosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProjetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarPerfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(todosProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(novoProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nãoAtasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(concluídosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nãoAtrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(concluídosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atrasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(atrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minhasTarefasTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meusProjetosTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {meusProjetosTabbedPane, minhasTarefasTabbedPane});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try { //Tenta guardar a instância Sistema em ficheiro
            Dashboard dashBoardWindow = sistemaDashboard.getDashboardWindow(); //Guarda a referência para a janela Dashboard
            ProjetoFrontEnd projetoWindow = sistemaDashboard.getProjetoWindow(); //Guarda a referência para a janela Projeto
            TodosProjetos todosProjetosWindow = sistemaDashboard.getTodosProjetosWindow(); //Guarda a referência para a janela TodosProjetos
            sistemaDashboard.setDashboardWindow(null);//Reseta a janela Dashboard do objeto Sistema
            sistemaDashboard.setProjetoWindow(null); //Reseta a janela Projeto do objeto Sistema
            sistemaDashboard.setTodosProjetosWindow(null); //Reseta a janela TodosProjetos do objeto Sistema
            sistemaDashboard.writeSistema(this); //Tentar guardar a instância em ficheiro(Sem as referências às janelos devido ao layout(Não pode ser seriliazado))
            sistemaDashboard.setDashboardWindow(dashBoardWindow);//Repõem a janela Dashboard do objeto Sistema
            sistemaDashboard.setProjetoWindow(projetoWindow); //Repõem a janela Projeto do objeto Sistema
            sistemaDashboard.setTodosProjetosWindow(todosProjetosWindow); //Repõem a janela TodosProjetos do objeto Sistema
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void todosProjetosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosProjetosButtonActionPerformed
        new TodosProjetos(sistemaDashboard).setVisible(true); // Cria uma instância TodosProjetos e torna-la visível
    }//GEN-LAST:event_todosProjetosButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        if (!sistemaDashboard.isSaved()) { //Se o ficheiro apresentar alterações
            int input = JOptionPane.showConfirmDialog(null, "Pretende guardar as alterações feitas?", "Atenção", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);//Pergunta se pretende guardar as alterações
            switch (input) {
                case 0: { //Se responder SIM
                    try {
                        sistemaDashboard.setDashboardWindow(null); //Reseta a janela Dashboard do objeto Sistema
                        sistemaDashboard.setProjetoWindow(null); //Reseta a janela Projeto do objeto Sistema
                        sistemaDashboard.setTodosProjetosWindow(null); //Reseta a janela TodosProjetos do objeto Sistema
                        sistemaDashboard.writeSistema(null); //Tentar guardar a instância em ficheiro (Sem as referências às janelos devido ao layout(Não pode ser seriliazado))
                        sistemaDashboard.setSaved(true); //
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
                System.exit(0);
                case 1: //Se responder NÃO
                    System.exit(0); //Fecha o programa
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_sairButtonActionPerformed

    private void editarPerfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPerfilButtonActionPerformed
        new EditarPerfil(sistemaDashboard).setVisible(true); //Cria uma instância EditarPerfil e torna-la visível
    }//GEN-LAST:event_editarPerfilButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        refreshPanels(); //Atualiza os paineis 
    }//GEN-LAST:event_formMouseClicked

    private void novoProjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProjetoButtonActionPerformed
        new NovoProjeto(sistemaDashboard).setVisible(true);  //Cria uma instância NovoProjeto e torna-la visível
    }//GEN-LAST:event_novoProjetoButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        System.gc();//garbage collection
        java.awt.Window win[] = java.awt.Window.getWindows();//faz dispose de todas as janelas abertas
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
            win[i] = null;
        }
        sistemaDashboard.setCurrentUser(null);//remove o current user
        new Login(sistemaDashboard).setVisible(true); //Cria uma instância login e torna-la visível
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        new Sobre(sistemaDashboard).setVisible(true);//Cria uma instância Sobre e torna-la visível
    }//GEN-LAST:event_sobreMenuItemActionPerformed

    public void refreshUI() { //Método due atualiza os UI de todas as janeleas
        sistemaDashboard.getCurrentSave().getListaProjetosSave().refreshEstadoProjetos(); //atualiza o estados de todos os projetos
        refreshMenu(); //atualiza a barra de menu
        refreshPanels(); //atualiza os paineis
        if (sistemaDashboard.getProjetoWindow() != null) { //atualiza a janela Projeto se existir
            sistemaDashboard.getProjetoWindow().refreshUI();
        }
        if (sistemaDashboard.getTodosProjetosWindow() != null) { //atualiza a janela TodosProjetos se existir
            sistemaDashboard.getTodosProjetosWindow().refreshUI();
        }
    }

    public void refreshMenu() { //Método que atualiza o menu
        utilizadoresMenu.removeAll();
        for (User utilizador : sistemaDashboard.getCurrentSave().getListaUsersSave().getListaUsers()) {
            utilizadoresMenu.add(new LinkedMenuUserItem(sistemaDashboard, utilizador, LinkedMenuUserItem.ABRIR));
        }
    }

    public void refreshPanels() { //Atualiza os paineis
        minhasTarefasPanel.removeAll(); //remove todas as tarefas do painel minhas tarefas
        meusProjetosPanel.removeAll(); //remove todos os projetos do painel meus projetos
        meusProjetosMaisAtrasadosPanel.removeAll(); //remove todos os projetos do painel projetos mais atrasados
        meusProjetosMaisProblemáticosPanel.removeAll(); //remove todos os projetos do painel projetos mais atrasados
        for (Projeto projeto : sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getListaProjetos()) { //Para cada projeto associado ao utilizador
            if (!projeto.getIsConcluídoProjeto()) {  //Se o projeto não estiver concluído
                meusProjetosPanel.add(new ProjetoDisplay(sistemaDashboard, projeto)); //Adiciona o projeto ao painel meus projetos
                meusProjetosPanel.add(new JToolBar.Separator(new Dimension(625, 2))); //Adiciona um separador ao painel meus projetos
            }
            for (ListaTarefas listaTarefas : projeto.getListasTarefas()) { //Para cada lista de tarefas
                for (Tarefa tarefa : listaTarefas.getListaTarefas()) { //Para cada tarefa
                    if (tarefa.getAssociatedUserTarefa().equals(sistemaDashboard.getCurrentUser()) && !tarefa.isConcluídaTarefa()) { //Se o utilizador associado for o utilizador atual e tarefa não estiver concluída
                        minhasTarefasPanel.add(new TarefaDisplay(sistemaDashboard, projeto, tarefa)); //Adiciona a tarefa ao painel minhas tarefas
                        minhasTarefasPanel.add(new JToolBar.Separator(new Dimension(625, 2))); //Adiciona um separador ao painel minhas tarefas
                    }
                }
            }
        }
        int numeroProjetosUser = sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetos(); //Número de projetos associados ao utilizador
        int numeroProjetosNãoConcluídosUser = sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getListaProjetosNãoConcluídos().getNumeroProjetos(); //Numero de projetos não concluídos assoaciados ao utilizador
        int numeroProjetosNãoConcluídosLocal = numeroProjetosNãoConcluídosUser;
        if (numeroProjetosNãoConcluídosLocal > 0) { //Variável com o número de projetos associados ao utilizafor não concluídos, com um máximo de 3, se exitir pelo menos um
            if (numeroProjetosNãoConcluídosLocal > 3) {
                numeroProjetosNãoConcluídosLocal = 3;
            }
            for (int i = 0; i < numeroProjetosNãoConcluídosLocal; i++) {
                meusProjetosMaisAtrasadosPanel.add(new ProjetoDisplay(sistemaDashboard, sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getListaProjetosNãoConcluídos().getListaProjetosOrdenados().getListaProjetos().get(i))); //Adiciona os 3 projetos não concluídos associados a mim  mais atrasados ao painel de projetos não concluídos 
                meusProjetosMaisAtrasadosPanel.add(new JToolBar.Separator(new Dimension(625, 2))); //Adiciona um separados ao painel de projetos mais atrasados
            }
        }

        if (numeroProjetosNãoConcluídosUser > 0) { //
            meusProjetosMaisProblemáticosPanel.add(new ProjetoDisplay(sistemaDashboard, sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getListaProjetosNãoConcluídos().getProjetoMaisUsersEnvolvidos(), " (Utilizadores envolvidos)"));//Adiciona o projeto com mais utilizadores envolvidos ao painel de projetos mais problemáticos
            meusProjetosMaisProblemáticosPanel.add(new JToolBar.Separator(new Dimension(625, 2)));
            meusProjetosMaisProblemáticosPanel.add(new ProjetoDisplay(sistemaDashboard, sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getListaProjetosNãoConcluídos().getProjetoMaisTarefaConcluídas(), " (Tarefas concluídas)")); //Adiciona o projeto com mais tarefas concluídas ao painel
        }

        ProjetoLabel.setText("Número Projetos ( " + numeroProjetosUser + " )"); //Label com o número de projetos associados ao utilizador

        nãoAtasadosProgressBar.setMaximum(numeroProjetosUser); //Atualizado o número máximo de projetos da barra de progresso de projetos não atrasados com o número de projetos associados ao utilizador
        concluídosProgressBar.setMaximum(numeroProjetosUser);//Atualizado o número máximo de projetos da barra de progresso de projetos não atrasados com o número de projetos associados ao utilizador
        atrasadosProgressBar.setMaximum(numeroProjetosUser);//Atualizado o número máximo de projetos da barra de progresso de projetos não atrasados com o número de projetos associados ao utilizador

        nãoAtasadosProgressBar.setValue(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosEmCurso()); //Atualiza o valor da barra de progresso com o número de projetos não atrasados associados ao utilizador
        nãoAtrasadosValue.setText(String.valueOf(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosEmCurso())); //Atualiza o valor com o número de projetos não atrasados associados ao utilizador

        atrasadosProgressBar.setValue(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosAtrasados());  //Atualiza o valor da barra de progresso com o número de projetos atrasados associados ao utilizador
        atrasadosValue.setText(String.valueOf(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosAtrasados())); //Atualiza o valor com o número de projetos atrasados associados ao utilizador

        concluídosProgressBar.setValue(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosConcluídos());  //Atualiza o valor da barra de progresso com o número de projetos concluídos associados ao utilizador
        concluídosValue.setText(String.valueOf(sistemaDashboard.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaDashboard.getCurrentUser()).getNumeroProjetosConcluídos())); //Atualiza o valor com o número de projetos concluídos associados ao utilizador

        //Revadalida os paineis
        minhasTarefasPanel.revalidate();
        meusProjetosPanel.revalidate();
        meusProjetosMaisAtrasadosPanel.revalidate();
        meusProjetosMaisProblemáticosPanel.revalidate();
        nãoAtasadosProgressBar.revalidate();
        atrasadosProgressBar.revalidate();
        concluídosProgressBar.revalidate();
        //re-pinta  os paineis
        minhasTarefasPanel.repaint();
        meusProjetosPanel.repaint();
        meusProjetosMaisAtrasadosPanel.repaint();
        meusProjetosMaisProblemáticosPanel.repaint();
        nãoAtasadosProgressBar.repaint();
        atrasadosProgressBar.repaint();
        concluídosProgressBar.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProjetoLabel;
    private javax.swing.JProgressBar atrasadosProgressBar;
    private javax.swing.JLabel atrasadosValue;
    private javax.swing.JProgressBar concluídosProgressBar;
    private javax.swing.JLabel concluídosValue;
    private javax.swing.JToggleButton editarPerfilButton;
    private javax.swing.JMenu ficheiroMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel meusProjetosMaisAtrasadosPanel;
    private javax.swing.JScrollPane meusProjetosMaisAtrasadosScrollPanel;
    private javax.swing.JPanel meusProjetosMaisProblemáticosPanel;
    private javax.swing.JScrollPane meusProjetosMaisProblemáticosScrollPanel;
    private javax.swing.JPanel meusProjetosPanel;
    private javax.swing.JScrollPane meusProjetosScrollPanel;
    private javax.swing.JTabbedPane meusProjetosTabbedPane;
    private javax.swing.JPanel minhasTarefasPanel;
    private javax.swing.JScrollPane minhasTarefasScrollPanel;
    private javax.swing.JTabbedPane minhasTarefasTabbedPane;
    private javax.swing.JButton novoProjetoButton;
    private javax.swing.JProgressBar nãoAtasadosProgressBar;
    private javax.swing.JLabel nãoAtrasadosValue;
    private javax.swing.JButton sairButton;
    private javax.swing.JMenu sobreMenu;
    private javax.swing.JMenuItem sobreMenuItem;
    private javax.swing.JButton todosProjetosButton;
    private javax.swing.JMenu utilizadoresMenu;
    // End of variables declaration//GEN-END:variables
}
