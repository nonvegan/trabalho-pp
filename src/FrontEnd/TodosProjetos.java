/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Projeto;
import BackEnd.Sistema;
import BackEnd.User;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class TodosProjetos extends javax.swing.JFrame {

    private Sistema sistemaTodosProjetos;
    private User userTodosProjetos;

    public TodosProjetos(Sistema sistema) {
        sistemaTodosProjetos = sistema;
        userTodosProjetos = sistema.getCurrentUser();
        initComponents();
        meusProjetosPanel.setLayout(new BoxLayout(meusProjetosPanel, 3));//box layout do painel
        setSelectedDate();
        refreshPanels();//atualiza os paineis
        setTitle(sistemaTodosProjetos.NOMEPROGRAMA + " - Todos os Projetos - Logado como " + sistemaTodosProjetos.getCurrentUser().getNomeUser() + " ( " + sistemaTodosProjetos.getCurrentUser().getUsernameUser() + " )");//Título da janela
        setIconImage(sistemaTodosProjetos.getIconFrame());//Ícon da janela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//fechar a janela faz dispose da janela
        setLocationRelativeTo(null);//centra a janela no ecrã
        if (sistemaTodosProjetos.getTodosProjetosWindow() != null) {//se já existir uma janela Todos os projetos, fecha-la
            sistemaTodosProjetos.getTodosProjetosWindow().dispose();
        }
        sistemaTodosProjetos.setTodosProjetosWindow(this);//associa esta janela como a janela todos os projetos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        tabbedPane = new javax.swing.JTabbedPane();
        meusProjetosScrollPanel = new javax.swing.JScrollPane();
        meusProjetosPanel = new javax.swing.JPanel();
        nãoAtrasadosProgressBar = new javax.swing.JProgressBar();
        atrasadosProgressBar = new javax.swing.JProgressBar();
        concluídosProgressBar = new javax.swing.JProgressBar();
        nãoAtrasadosLabel = new javax.swing.JLabel();
        nãoAtrasadosValue = new javax.swing.JLabel();
        atrasadosValue = new javax.swing.JLabel();
        concluídosValue = new javax.swing.JLabel();
        projetosLabel = new javax.swing.JLabel();
        concluídosLabel = new javax.swing.JLabel();
        atrasadosLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        procurarProjetoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 672));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tabbedPane.setToolTipText("Tarefas não terminadas associadas a mim");
        tabbedPane.setMaximumSize(new java.awt.Dimension(1027, 612));
        tabbedPane.setMinimumSize(new java.awt.Dimension(1027, 612));
        tabbedPane.setPreferredSize(new java.awt.Dimension(1027, 612));

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

        tabbedPane.addTab("Todos os Projetos", meusProjetosScrollPanel);

        nãoAtrasadosProgressBar.setStringPainted(true);

        atrasadosProgressBar.setStringPainted(true);

        concluídosProgressBar.setStringPainted(true);

        nãoAtrasadosLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nãoAtrasadosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nãoAtrasadosLabel.setText("Não Atrasados");

        nãoAtrasadosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nãoAtrasadosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        atrasadosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atrasadosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        concluídosValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        concluídosValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        projetosLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        projetosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        concluídosLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        concluídosLabel.setText("Concluídos");

        atrasadosLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atrasadosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atrasadosLabel.setText("Atrasados");

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        procurarProjetoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarProjetoTextFieldActionPerformed(evt);
            }
        });
        procurarProjetoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                procurarProjetoTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nãoAtrasadosLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nãoAtrasadosValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nãoAtrasadosProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(atrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(concluídosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(atrasadosLabel)
                                            .addComponent(atrasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(concluídosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(concluídosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(projetosLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(procurarProjetoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(voltarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(projetosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(atrasadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(concluídosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nãoAtrasadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(atrasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nãoAtrasadosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(concluídosProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(concluídosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nãoAtrasadosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procurarProjetoTextField)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        refreshUI();//atualiza os paineis
    }//GEN-LAST:event_formMouseClicked

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();//dispose
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void procurarProjetoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procurarProjetoTextFieldKeyReleased
        refreshPanels();//atualiza os paineis
    }//GEN-LAST:event_procurarProjetoTextFieldKeyReleased

    private void procurarProjetoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarProjetoTextFieldActionPerformed
        refreshPanels();
    }//GEN-LAST:event_procurarProjetoTextFieldActionPerformed
    public void refreshUI() {
        sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().refreshEstadoProjetos();
        refreshPanels();
    }

    public void refreshPanels() {//Método que atualiza os paineis
        meusProjetosPanel.removeAll();

        for (Projeto projeto : sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getListaProjetos()) {//para cada projeto relacionado com o utilizador
            if ((procurarProjetoTextField.getText().isEmpty() || procurarString(procurarProjetoTextField.getText(), projeto.getTítuloProjeto()))) {//se o filtro de procurar retornar true
                meusProjetosPanel.add(new ProjetoDisplay(sistemaTodosProjetos, projeto));//adicionar ao painel
                meusProjetosPanel.add(new JToolBar.Separator(new Dimension(625, 2)));//adiciona um seperador
            }
        }

        int numeroProjetosUser = sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetos();//numero de projetos do utilizador

        projetosLabel.setText("Projetos ( " + numeroProjetosUser + " )");

        nãoAtrasadosProgressBar.setMaximum(numeroProjetosUser);//valor máximo da barra de progresso
        atrasadosProgressBar.setMaximum(numeroProjetosUser);//valor máximo da barra de progresso
        concluídosProgressBar.setMaximum(numeroProjetosUser);//valor máximo da barra de progresso

        nãoAtrasadosProgressBar.setValue(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosEmCurso()); //valor da barra de progreesso
        nãoAtrasadosValue.setText(String.valueOf(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosEmCurso()));//string com o valor da barra de progresso

        atrasadosProgressBar.setValue(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosAtrasados()); //valor da barra de progreesso
        atrasadosValue.setText(String.valueOf(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosAtrasados()));//string com o valor da barra de progresso

        concluídosProgressBar.setValue(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosConcluídos()); //valor da barra de progreesso
        concluídosValue.setText(String.valueOf(sistemaTodosProjetos.getCurrentSave().getListaProjetosSave().getListaProjetosUser(sistemaTodosProjetos.getCurrentUser()).getNumeroProjetosConcluídos()));//string com o valor da barra de progresso

        meusProjetosPanel.revalidate(); //revalida 
        nãoAtrasadosProgressBar.revalidate();
        atrasadosProgressBar.revalidate();
        concluídosProgressBar.revalidate();

        meusProjetosPanel.repaint(); //re-pinta
        nãoAtrasadosProgressBar.repaint();
        atrasadosProgressBar.repaint();
        concluídosProgressBar.repaint();
    }

    public void setSelectedDate() {//seleciona a datas iniciais de procura 3 meses antes e depois
        LocalDateTime instante = LocalDateTime.now();
        Calendar calendarDe = Calendar.getInstance();
        Calendar calendarAté = Calendar.getInstance();
        calendarDe.set(instante.minusMonths(3).getYear(), instante.minusMonths(3).getMonthValue() - 1, instante.minusMonths(3).getDayOfMonth());
        calendarAté.set(instante.plusMonths(3).getYear(), instante.plusMonths(3).getMonthValue() - 1, instante.plusMonths(3).getDayOfMonth());
    }

   public boolean procurarString(String stringProcura, String stringProcurada) {//Método de procura, que comprara strings
        int index = 0;
        boolean returnValue = true;
        if (stringProcura.length() > stringProcurada.length()) {
            return false;
        } else {
            index = stringProcura.length();
        }
        char[] arrayProcura = stringProcura.toLowerCase(Locale.ITALY).toCharArray();
        char[] arrayProcurado = stringProcurada.toLowerCase(Locale.ITALY).toCharArray();
        for (int i = 0; i < index; i++) {
            if (!(arrayProcura[i] == arrayProcurado[i])) {
                returnValue = false;
            }
        }
        return returnValue;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atrasadosLabel;
    private javax.swing.JProgressBar atrasadosProgressBar;
    private javax.swing.JLabel atrasadosValue;
    private javax.swing.JLabel concluídosLabel;
    private javax.swing.JProgressBar concluídosProgressBar;
    private javax.swing.JLabel concluídosValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel meusProjetosPanel;
    private javax.swing.JScrollPane meusProjetosScrollPanel;
    private javax.swing.JLabel nãoAtrasadosLabel;
    private javax.swing.JProgressBar nãoAtrasadosProgressBar;
    private javax.swing.JLabel nãoAtrasadosValue;
    private javax.swing.JTextField procurarProjetoTextField;
    private javax.swing.JLabel projetosLabel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
