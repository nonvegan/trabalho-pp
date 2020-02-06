/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Sistema;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class EditarPerfil extends javax.swing.JFrame {

    private Sistema sistemaEditarPerfil;

    public EditarPerfil(Sistema sistema) {
        sistemaEditarPerfil = sistema;
        initComponents();
        setLabelsVisible(false); //
        setCurrentValues(); //Carrega os dados do perfil
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Fechar a janela faz dispose da janela
        setTitle(Sistema.NOMEPROGRAMA + " - Editar Perfil");//Título da janela
        setIconImage(sistemaEditarPerfil.getIconFrame());//Ícon da janel
        setLocationRelativeTo(null); //Janela no meio do ecrã
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoButtonGroup = new javax.swing.ButtonGroup();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailErrorLabel = new javax.swing.JLabel();
        telemóvelLabel = new javax.swing.JLabel();
        telemóvelTextField = new javax.swing.JTextField();
        telemóvelErrorLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        password1Label = new javax.swing.JLabel();
        password1TextField = new javax.swing.JPasswordField();
        perfilLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        password2Label = new javax.swing.JLabel();
        nomeEmptyLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        password2TextField = new javax.swing.JPasswordField();
        sexoLabel = new javax.swing.JLabel();
        passwordCheckbox = new javax.swing.JCheckBox();
        sexoEmptyLabel = new javax.swing.JLabel();
        passwordErrorLabel = new javax.swing.JLabel();
        masculinoRadioButton = new javax.swing.JRadioButton();
        editarButton = new javax.swing.JButton();
        FemininoRadioButton = new javax.swing.JRadioButton();
        voltarButton = new javax.swing.JButton();
        dataNascimentoLabel = new javax.swing.JLabel();
        dataNascimentoCombo = new datechooser.beans.DateChooserCombo();
        currentUserLabel = new javax.swing.JLabel();
        dataRegistoLabel = new javax.swing.JLabel();
        currentDataRegistoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 610));
        setResizable(false);

        emailLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        emailLabel.setText("Email");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        emailErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        emailErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
        emailErrorLabel.setText("Email inválido");

        telemóvelLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        telemóvelLabel.setText("Telémovel");

        telemóvelTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telemóvelTextFieldKeyReleased(evt);
            }
        });

        telemóvelErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        telemóvelErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
        telemóvelErrorLabel.setText("Número inválido");

        usernameLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        usernameLabel.setText("Username");

        password1Label.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        password1Label.setText("Password");

        password1TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password1TextFieldKeyReleased(evt);
            }
        });

        perfilLabel.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        perfilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilLabel.setText("Editar Perfil");

        nomeLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeLabel.setText("Nome");

        password2Label.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        password2Label.setText("Password*");

        nomeEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nomeEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        nomeEmptyLabel.setText("*");

        nomeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeTextFieldFocusLost(evt);
            }
        });
        nomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeTextFieldKeyReleased(evt);
            }
        });

        password2TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password2TextFieldKeyReleased(evt);
            }
        });

        sexoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sexoLabel.setText("Sexo");

        passwordCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordCheckbox.setText("Mostrar");
        passwordCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckboxActionPerformed(evt);
            }
        });

        sexoEmptyLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sexoEmptyLabel.setForeground(new java.awt.Color(250, 0, 0));
        sexoEmptyLabel.setText("*");

        passwordErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        passwordErrorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/08-512.png"))); // NOI18N
        passwordErrorLabel.setText("Passwords não coincidem");

        sexoButtonGroup.add(masculinoRadioButton);
        masculinoRadioButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        masculinoRadioButton.setText("M");
        masculinoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoRadioButtonActionPerformed(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        sexoButtonGroup.add(FemininoRadioButton);
        FemininoRadioButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        FemininoRadioButton.setText("F");
        FemininoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemininoRadioButtonActionPerformed(evt);
            }
        });

        voltarButton.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        dataNascimentoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dataNascimentoLabel.setText("D. Nascimento");

        dataNascimentoCombo.setFormat(1);
        dataNascimentoCombo.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        try {
            dataNascimentoCombo.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2000, 0, 1),
                new java.util.GregorianCalendar(2000, 0, 1))));
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dataNascimentoCombo.setFieldFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 14));
    dataNascimentoCombo.setLocale(new java.util.Locale("pt", "PT", ""));
    dataNascimentoCombo.setNavigateFont(new java.awt.Font("Lucida Console", java.awt.Font.PLAIN, 11));

    currentUserLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    dataRegistoLabel.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
    dataRegistoLabel.setText("D. Registo");

    currentDataRegistoLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(perfilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataNascimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telemóvelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataRegistoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(currentUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(password1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telemóvelErrorLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(currentDataRegistoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addComponent(telemóvelTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(password2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(masculinoRadioButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FemininoRadioButton)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sexoEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(voltarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(password1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataNascimentoCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(passwordCheckbox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordErrorLabel)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(perfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addComponent(currentUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataRegistoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currentDataRegistoLabel))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeEmptyLabel))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(sexoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(masculinoRadioButton)
                .addComponent(FemininoRadioButton)
                .addComponent(sexoEmptyLabel))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(dataNascimentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataNascimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailErrorLabel)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(telemóvelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(telemóvelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telemóvelErrorLabel)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(password1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(password2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(password2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(passwordErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passwordCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(53, 53, 53))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        emailTextField.setText(emailTextField.getText().trim());//faz trim do email
        emailErrorLabel.setVisible(true); //Torna emailErrorLabel visivel, apenas se não for vazio ou válido
        if (emailTextField.getText().isEmpty()) {
            emailErrorLabel.setVisible(false);
        }
        if (isValidEmailAddress(emailTextField.getText())) {
            emailErrorLabel.setVisible(false);
        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void telemóvelTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telemóvelTextFieldKeyReleased
        telemóvelTextField.setText(telemóvelTextField.getText().trim()); //faz trim do telemóvel
        if (telemóvelTextField.getText().isEmpty()) {  //Torna telemóvelTextField visivel, apenas se não for vazio ou válido
            telemóvelErrorLabel.setVisible(false);
        } else if (!isValidPhoneNumber(telemóvelTextField.getText())) {
            telemóvelErrorLabel.setVisible(true);
        } else {
            telemóvelErrorLabel.setVisible(false);
        }
    }//GEN-LAST:event_telemóvelTextFieldKeyReleased

    private void password1TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1TextFieldKeyReleased
        passwordErrorLabel.setVisible(false); //Torna passwordErrorLabel não visível
        if (!String.valueOf(password1TextField.getPassword()).equals(String.valueOf(password2TextField.getPassword()))) {//se as passwords não coincidirem Torna passwordErrorLabel visível
            passwordErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_password1TextFieldKeyReleased

    private void nomeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTextFieldFocusLost
        nomeTextField.setText(nomeTextField.getText().trim()); //faz trim do nome
    }//GEN-LAST:event_nomeTextFieldFocusLost

    private void nomeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextFieldKeyReleased
        nomeEmptyLabel.setVisible(false); //Torna nomeEmptyLabel não visível
        nomeTextField.setText(nomeTextField.getText().replaceAll(" +", " "));//Retira os espaços entre os nomes
        if (nomeTextField.getText().length() > 50) { //Se o nome for maior que 50 letras corta o excesso
            nomeTextField.setText(nomeTextField.getText().substring(0, 49));
        }
        if (nomeTextField.getText().isEmpty()) { //Se for vazio torna nomeEmptyLabel  visível
            nomeEmptyLabel.setVisible(true);
        }
    }//GEN-LAST:event_nomeTextFieldKeyReleased

    private void password2TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password2TextFieldKeyReleased
        passwordErrorLabel.setVisible(false); //Torna passwordErrorLabel não visível
        if (!String.valueOf(password2TextField.getPassword()).equals(String.valueOf(password1TextField.getPassword()))) { //Se as passwords não coincidirem torna passwordErrorLabel visível
            passwordErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_password2TextFieldKeyReleased

    private void passwordCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckboxActionPerformed
        if (passwordCheckbox.isSelected()) {//Mostra os caracteres se estiver selecionada
            password1TextField.setEchoChar((char) 0);
            password2TextField.setEchoChar((char) 0);
        } else {  //Esconde os caracteres se estiver selecionada
            password1TextField.setEchoChar('•');
            password2TextField.setEchoChar('•');
        }
    }//GEN-LAST:event_passwordCheckboxActionPerformed

    private void masculinoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoRadioButtonActionPerformed
        sexoEmptyLabel.setVisible(false); //torna  sexoEmptyLabel não visível
    }//GEN-LAST:event_masculinoRadioButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        String erro = "";

        if (nomeTextField.getText().length() > 50) { //Se o tamanho do nome for maior que 50, acrescentar ao erro
            erro += ("Nome inválido(Demasiado grande[max 50]).\n");
        }

        if (!isValidName(nomeTextField.getText())) {  //Se o nome não for válido, acrescentar ao erro
            erro += ("Nome inválido(Caracteres inválidos).\n");
        }

        if (nomeTextField.getText().isEmpty() || !masculinoRadioButton.isSelected() && !FemininoRadioButton.isSelected()) { //Se não estiverem preenchido adicionar ao erro
            erro += ("Faltam Prencher campos.\n");

            if (nomeTextField.getText().isEmpty()) { //Se não estiver preenchido torna nomeEmptyLabel visível
                nomeEmptyLabel.setVisible(true);
            }
            if (!masculinoRadioButton.isSelected() && !FemininoRadioButton.isSelected()) { //Se não estiver preenchido torna sexoEmptyLabel visível
                sexoEmptyLabel.setVisible(true);
            }
        }

        if (dataNascimentoCombo.getSelectedDate() != null) {
            if (LocalDate.of(dataNascimentoCombo.getSelectedDate().get(Calendar.YEAR), dataNascimentoCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataNascimentoCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH)).isAfter(LocalDate.now())) {//Se data de nascimento não for válida
                erro += "Data de Nascimento inválida (Data após hoje)\n";
            }
        } else {
            erro += "Data de Nascimento inválida.\n";
        }

        if (!emailTextField.getText().isEmpty() && !isValidEmailAddress(emailTextField.getText())) { //Se email não for válido acrescentar ao erro
            erro += "Email inválido.\n";
            emailErrorLabel.setVisible(true);
        }

        if (!telemóvelTextField.getText().isEmpty() && !isValidPhoneNumber(telemóvelTextField.getText())) { //número de telemóvel não for válido acrescentar ao erro
            erro += "Telemóvel inválido.\n";
            telemóvelErrorLabel.setVisible(true);
        }

        if (!String.valueOf(password1TextField.getPassword()).equals(String.valueOf(password2TextField.getPassword()))) { //Se palavras-passes não coincidirem, acrescentar ao erro
            erro += "Palavras-passe não coincidem.\n";
        }

        if (erro.isEmpty()) { //Se não houver erros
            int editarConfirm = JOptionPane.showConfirmDialog(this, "Tem a certeza que pretende editar o seu perfil?", "Confirmação de edição", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);//Mensagem de confirmação
            if (editarConfirm == 0) {//Se responder SIM

                sistemaEditarPerfil.getCurrentUser().setNomeUser(nomeTextField.getText());//Edita o nome
                sistemaEditarPerfil.getCurrentUser().setDataNascimentoUser(LocalDate.of(dataNascimentoCombo.getSelectedDate().get(Calendar.YEAR), dataNascimentoCombo.getSelectedDate().get(Calendar.MONTH) + 1, dataNascimentoCombo.getSelectedDate().get(Calendar.DAY_OF_MONTH)));//edita data de nascimento
                if (masculinoRadioButton.isSelected()) { //muda o sexo
                    sistemaEditarPerfil.getCurrentUser().setSexoUser('m');
                }
                if (FemininoRadioButton.isSelected()) {//muda o sexo
                    sistemaEditarPerfil.getCurrentUser().setSexoUser('f');
                }
                if (!String.valueOf(password1TextField.getPassword()).isBlank()) {//Muda a password
                    sistemaEditarPerfil.getCurrentUser().setPasswordUser(String.valueOf(password1TextField.getPassword()));
                }

                sistemaEditarPerfil.getCurrentUser().setEmailUser(emailTextField.getText());//Muda o email
                sistemaEditarPerfil.getCurrentUser().setTelemóvelUser(telemóvelTextField.getText());//Muda o número de telemóvel
                JOptionPane.showMessageDialog(this, "Perfil editado com com sucesso.", "Perfil editado", JOptionPane.INFORMATION_MESSAGE); //Mensagem de aviso 
                sistemaEditarPerfil.setSaved(false);//Torna o estado do Sistema como não gravado

                if (sistemaEditarPerfil.getDashboardWindow() != null) {//atualiza todas as janelas 
                    sistemaEditarPerfil.getDashboardWindow().refreshUI();
                }
                dispose();//faz dispose da janela
            }

        } else {
            JOptionPane.showMessageDialog(this, erro, "Erro ao editar perfil", JOptionPane.ERROR_MESSAGE);//Mensagem de erro
        }
    }//GEN-LAST:event_editarButtonActionPerformed

    public boolean isValidName(String name) {//Método que verifica um string como sendo um Nome
        return name.matches("[a-zA-ZãÃõÕêÊáÁíÍóÓ ]+");
    }

    public boolean isValidEmailAddress(String email) { //Método que verifica um string sendo um email
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    private boolean isValidPhoneNumber(String pPhoneNumber) { //Método que verifica um string sendo um número de telemóvel

        Pattern pattern = Pattern
                .compile("((\\+[1-9]{3,4}|0[1-9]{4}|00[1-9]{3})\\-?)?\\d{8,20}");
        Matcher matcher = pattern.matcher(pPhoneNumber);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    private void FemininoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemininoRadioButtonActionPerformed
        sexoEmptyLabel.setVisible(false); //torna  sexoEmptyLabel não visível
    }//GEN-LAST:event_FemininoRadioButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose(); //faz dispose da janela
    }//GEN-LAST:event_voltarButtonActionPerformed
    public void setCurrentValues() {//Carrega os dados do utilizador
        if (!(sistemaEditarPerfil.getCurrentUser().getDataNascimentoUser() == null)) {//carrega a data de nascimento 
            setSelectedDate();
        }
        currentUserLabel.setText(sistemaEditarPerfil.getCurrentUser().getUsernameUser()); //carrega o username
        currentDataRegistoLabel.setText(sistemaEditarPerfil.getCurrentUser().getDataInscriçãoUser().toString()); //carrega a data de registo
        nomeTextField.setText(sistemaEditarPerfil.getCurrentUser().getNomeUser()); //carrega o Nome
        if (sistemaEditarPerfil.getCurrentUser().getSexoUser() == 'm') {//carrega o sexo
            masculinoRadioButton.setSelected(true);
        }
        if (sistemaEditarPerfil.getCurrentUser().getSexoUser() == 'f') {//carrega o sexo
            FemininoRadioButton.setSelected(true);
        }

        if (!(sistemaEditarPerfil.getCurrentUser().getEmailUser() == null)) {//carrega o email
            emailTextField.setText(sistemaEditarPerfil.getCurrentUser().getEmailUser());
        }
        if (!(sistemaEditarPerfil.getCurrentUser().getTelemóvelUser() == null)) { //carrega o telemóvel
            telemóvelTextField.setText(sistemaEditarPerfil.getCurrentUser().getTelemóvelUser());
        }
    }

    public void setLabelsVisible(boolean booleano) {
        nomeEmptyLabel.setVisible(booleano);
        sexoEmptyLabel.setVisible(booleano);
        emailErrorLabel.setVisible(booleano);
        telemóvelErrorLabel.setVisible(booleano);
        passwordErrorLabel.setVisible(booleano);
    }

    public void setSelectedDate() {//Método que carrega a data nascimento do user
        Calendar calendarStart = Calendar.getInstance();
        calendarStart.set(sistemaEditarPerfil.getCurrentUser().getDataNascimentoUser().getYear(), sistemaEditarPerfil.getCurrentUser().getDataNascimentoUser().getMonthValue() - 1, sistemaEditarPerfil.getCurrentUser().getDataNascimentoUser().getDayOfMonth());
        dataNascimentoCombo.setSelectedDate(calendarStart);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemininoRadioButton;
    private javax.swing.JLabel currentDataRegistoLabel;
    private javax.swing.JLabel currentUserLabel;
    private datechooser.beans.DateChooserCombo dataNascimentoCombo;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JLabel dataRegistoLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton masculinoRadioButton;
    private javax.swing.JLabel nomeEmptyLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel password1Label;
    private javax.swing.JPasswordField password1TextField;
    private javax.swing.JLabel password2Label;
    private javax.swing.JPasswordField password2TextField;
    private javax.swing.JCheckBox passwordCheckbox;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel perfilLabel;
    private javax.swing.ButtonGroup sexoButtonGroup;
    private javax.swing.JLabel sexoEmptyLabel;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel telemóvelErrorLabel;
    private javax.swing.JLabel telemóvelLabel;
    private javax.swing.JTextField telemóvelTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
