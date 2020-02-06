/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Save implements Serializable {

    private String nomeSave;
    private LocalDateTime dataCriação;
    private LocalDateTime dataÚltimoSave;
    private ListaUsers listaUsersSave;
    private ListaProjetos listaProjetosSave;

    public Save(String nome) {
        this.nomeSave = nome;
        dataCriação = dataÚltimoSave = LocalDateTime.now();
        listaUsersSave = new ListaUsers();
        listaProjetosSave = new ListaProjetos();
    }

    public String getNomeSave() {
        return nomeSave;
    }

    public LocalDateTime getDataCriação() {
        return dataCriação;
    }

    public LocalDateTime getDataÚltimoSave() {
        return dataÚltimoSave;
    }

    public ListaUsers getListaUsersSave() {
        return listaUsersSave;
    }

    public ListaProjetos getListaProjetosSave() {
        return listaProjetosSave;
    }

    public void setDataÚltimoSave(LocalDateTime dataÚltimoSave) {
        this.dataÚltimoSave = dataÚltimoSave;
    }

    public void setListaUsersSave(ListaUsers listaUsersSave) {
        this.listaUsersSave = listaUsersSave;
    }

    public void setListaProjetosSave(ListaProjetos listaProjetosSave) {
        this.listaProjetosSave = listaProjetosSave;
    }

    public void setNomeSave(String nomeSave) {
        this.nomeSave = nomeSave;
    }

    public void setDataCriação(LocalDateTime dataCriação) {
        this.dataCriação = dataCriação;
    }

    public Save newDefaultSave() {                          //Método que devolve uma gravação default com um utilizador admin inserido
        Save defaultSave = new Save("Default");
        User adminUser = new User("admin", "admin", "Administrador", 'm');
        adminUser.setDataNascimentoUser(LocalDate.of(0, 1, 1));
        defaultSave.getListaUsersSave().addUserListaUsers(adminUser);
        return defaultSave;
    }

    @Override
    public String toString() {
        return "Save{" + "nomeSave=" + nomeSave + ", dataCria\u00e7\u00e3o=" + dataCriação + ", data\u00daltimoSave=" + dataÚltimoSave + ", listaUsersSave=" + listaUsersSave + ", listaProjetosSave=" + listaProjetosSave + '}';
    }

}
