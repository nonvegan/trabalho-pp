/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.Dashboard;
import FrontEnd.ProjetoFrontEnd;
import FrontEnd.TodosProjetos;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Sistema implements Serializable {

    private Save currentSave;
    private ArrayList<Save> listaSaves;
    private User currentUser;
    private boolean isSaved = true;
    public static final String NOMEPROGRAMA = "Gestor de Projetos";
    private final String NOMEICONFRAME = "/Imagens/Icon.png";
    private final String NOMEFICHEIRO = "Sistema.Dados";
    private Dashboard dashboardWindow;
    private ProjetoFrontEnd projetoWindow;
    private TodosProjetos todosProjetosWindow;

    public Sistema() throws IOException {
        currentSave = new Save("Default").newDefaultSave();
        listaSaves = new ArrayList<>();
        listaSaves.add(currentSave);
        dashboardWindow = null;
        projetoWindow = null;
        todosProjetosWindow = null;
        isSaved = true;
    }

    public Save getCurrentSave() {
        return currentSave;
    }

    public void setCurrentSave(Save currentSave) {
        this.currentSave = currentSave;
    }

    public ArrayList<Save> getListaSaves() {
        return listaSaves;
    }

    public void setListaSaves(ArrayList<Save> listaSaves) {
        this.listaSaves = listaSaves;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public Dashboard getDashboardWindow() {
        return dashboardWindow;
    }

    public void setDashboardWindow(Dashboard dashboardWindow) {
        this.dashboardWindow = dashboardWindow;
    }

    public ProjetoFrontEnd getProjetoWindow() {
        return projetoWindow;
    }

    public void setProjetoWindow(ProjetoFrontEnd projetoWindow) {
        this.projetoWindow = projetoWindow;
    }

    public TodosProjetos getTodosProjetosWindow() {
        return todosProjetosWindow;
    }

    public void setTodosProjetosWindow(TodosProjetos todosProjetosWindow) {
        this.todosProjetosWindow = todosProjetosWindow;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean isSaved) {
        this.isSaved = isSaved;
    }

    public String getNOMEFICHEIRO() {
        return NOMEFICHEIRO;
    }


    public String getNOMEICONFRAME() {
        return NOMEICONFRAME;
    }

    public boolean containsNomeSave(String nome) {                  //Método que verifica se já existe uma gravação com o nome dado
        for (Save save : listaSaves) {
            if (nome.equals(save.getNomeSave())) {
                return true;
            }
        }
        return false;
    }

    public Sistema readSistema(Component componente) throws ClassNotFoundException, IOException { //Método que lê um ficheiro stream objeto e retorna um objeto Sistema. Se ocorrer um erro, irá delvolver um novo Objeto criado e gravá-lo depois.
        ObjectInputStream inputSistema = null;
        ObjectOutputStream outputSistema = null;
        try {
            inputSistema = new ObjectInputStream(new FileInputStream(this.getNOMEFICHEIRO()));
            Sistema sistema = (Sistema) inputSistema.readObject();
            sistema.setSaved(true);
            return sistema;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(componente, "Os seus dados não foram carregados com sucesso. " + ex.getMessage(), "InputStream", JOptionPane.WARNING_MESSAGE);
            outputSistema = new ObjectOutputStream(new FileOutputStream(this.getNOMEFICHEIRO()));
            Sistema sistema = new Sistema();
            outputSistema.writeObject(sistema);
            return sistema;
        } finally {
            if (inputSistema != null) {
                inputSistema.close();
            }
            if (outputSistema != null) {
                outputSistema.close();
            }
        }
    }

    public void writeSistema(Component componente) throws IOException {                             //Método que grava o objeto da class sistema num ficheiro stream objeto. Se ocorrer um erro, fecha a stream.
        ObjectOutputStream outputSistema = null;
        try {
            outputSistema = new ObjectOutputStream(new FileOutputStream(this.getNOMEFICHEIRO()));
            this.setSaved(true);
            outputSistema.writeObject(this);
            JOptionPane.showMessageDialog(componente, "Os seus dados foram guardados com Sucesso.", "OutputStream", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(componente, "Os seus dados não foram guardados com sucesso. " + ex.getMessage(), "OutputStream", JOptionPane.WARNING_MESSAGE);
        } finally {
            if (outputSistema != null) {
                outputSistema.close();
            }
        }
    }

    public Image getIconFrame() {                                                                           //Método que retorna um objeto do tipo Image com o ícon da aplicação
        return Toolkit.getDefaultToolkit().getImage(Sistema.class.getResource(getNOMEICONFRAME()));
    }

    @Override
    public String toString() {
        return "Sistema{" + "currentSave=" + currentSave + ", listaSaves=" + listaSaves + ", currentUser=" + currentUser + ", nomeFicheiro=" + NOMEFICHEIRO + ", nomeIconFrame=" + NOMEICONFRAME + '}';
    }

}
