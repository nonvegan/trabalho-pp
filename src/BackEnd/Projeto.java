package BackEnd;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Projeto implements Serializable {

    private String títuloProjeto;
    private String descriçãoProjeto;
    private User ownerProjeto;
    private final int codProjeto;
    private static int lastCodProjeto = 0;
    private ListaUsers listaAssociatedUsersProjeto;
    private ArrayList<ListaTarefas> listasTarefasProjeto;
    private final LocalDateTime dataInícioProjeto;
    private LocalDateTime dataLimiteProjeto;
    private LocalDateTime dataConclusãoProjeto;
    private boolean isConcluídoProjeto;

    public Projeto(String títuloProjeto, String descriçãoProjeto, User ownerProjeto, LocalDateTime dataLimiteProjeto) {
        this.títuloProjeto = títuloProjeto;
        this.descriçãoProjeto = descriçãoProjeto;
        this.ownerProjeto = ownerProjeto;
        codProjeto = ++lastCodProjeto;
        dataInícioProjeto = LocalDateTime.now();
        this.dataLimiteProjeto = dataLimiteProjeto;
        listaAssociatedUsersProjeto = new ListaUsers();
        listasTarefasProjeto = new ArrayList<>();
        isConcluídoProjeto = false;
    }

    public String getTítuloProjeto() {
        return títuloProjeto;
    }

    public String getDescriçãoProjeto() {
        return descriçãoProjeto;
    }

    public User getOwnerProjeto() {
        return ownerProjeto;
    }

    public int getCodProjeto() {
        return codProjeto;
    }

    public ListaUsers getListaAssociatedUsersProjeto() {
        return listaAssociatedUsersProjeto;
    }

    public LocalDateTime getDataInícioProjeto() {
        return dataInícioProjeto;
    }

    public LocalDateTime getDataConclusãoProjeto() {
        return dataConclusãoProjeto;
    }
    
    

    public LocalDateTime getDataLimiteProjeto() {
        return dataLimiteProjeto;
    }

    public ArrayList<ListaTarefas> getListasTarefas() {
        return listasTarefasProjeto;
    }

    public void setTítuloProjeto(String títuloProjeto) {
        this.títuloProjeto = títuloProjeto;
    }

    public void setDescriçãoProjeto(String descriçãoProjeto) {
        this.descriçãoProjeto = descriçãoProjeto;
    }

    public void setOwnerProjeto(User ownerProjeto) {
        this.ownerProjeto = ownerProjeto;
    }

    public void setIsConcluídoProjeto(boolean isConcluídoProjeto) {
        this.isConcluídoProjeto = isConcluídoProjeto;
    }

    public boolean getIsConcluídoProjeto() {
        return isConcluídoProjeto;
    }

    public void refreshIsConcluído() {                   //Método que atualiza o estado do projeto verificando se todas as tarefas estão concluídas. Se não conter tarefas não irá atualizar o projeto como concluído   
        boolean todasTarefasConcluídas = true;
        for (ListaTarefas listaTarefa : listasTarefasProjeto) {
            for (Tarefa tarefa : listaTarefa.getListaTarefas()) {
                if (!tarefa.isConcluídaTarefa()) {
                    todasTarefasConcluídas = false;
                }
            }
        }
        if (getNumeroTarefas() == 0) {
            recomeçarProjeto();
        } else {
            if (todasTarefasConcluídas) {
                terminarProjeto();
            } else {
                recomeçarProjeto();
            }
        }
    }

    public void setDataLimiteProjeto(LocalDateTime dataLimiteProjeto) {
        this.dataLimiteProjeto = dataLimiteProjeto;
    }

    public boolean isListaListasTarefas(ListaTarefas listaTarefasProjeto) {
        return listasTarefasProjeto.contains(listaTarefasProjeto);
    }

    public void addListaListasTarefas(ListaTarefas listaTarefasProjeto) {
        listasTarefasProjeto.add(listaTarefasProjeto);
    }

    public void removeListaListasTarefas(ListaTarefas listaTarefasProjeto) {
        listasTarefasProjeto.remove(listasTarefasProjeto.indexOf(listaTarefasProjeto));
    }

    public int getNumeroTarefas() {                            //Método que retorna o número de tarefas do projeto
        int numerotarefas = 0;
        for (ListaTarefas listaTarefas : getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                numerotarefas++;
            }
        }
        return numerotarefas;
    }

    public int getNumeroTarefasConcluidas() {                      //Método que retorna o número de tarefas concluídas do projeto
        int numeroTarefasConcluidas = 0;
        for (ListaTarefas listaTarefas : getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                if (tarefa.isConcluídaTarefa()) {
                    numeroTarefasConcluidas++;
                }
            }
        }
        return numeroTarefasConcluidas;
    }

    public int getNumeroTarefasEmCurso() {                            //Método que retorna o número de tarefas não concluídas e não atrasadas do projeto
        int numeroTarefasEmCurso = 0;
        for (ListaTarefas listaTarefas : getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                if (!tarefa.isConcluídaTarefa() && !tarefa.isAtrasada()) {
                    numeroTarefasEmCurso++;
                }
            }
        }
        return numeroTarefasEmCurso;
    }

    public int getNumeroTarefasAtrasadas() {                                  //Método que retorna o número de tarefas não concluídas e atrasadas do projeto
        int numeroTarefasAtrasadas = 0;
        for (ListaTarefas listaTarefas : getListasTarefas()) {
            for (Tarefa tarefa : listaTarefas.getListaTarefas()) {
                if (!tarefa.isConcluídaTarefa() && tarefa.isAtrasada()) {
                    numeroTarefasAtrasadas++;
                }
            }
        }
        return numeroTarefasAtrasadas;
    }

    public int getNumeroUsers() {                                                 //Método que retorna o número de pessoas envolvidas no projeto
        return listaAssociatedUsersProjeto.userCounterListaUsers() + 1;
    }

    public ListaTarefas getListaTarefasTarefaProjeto(Tarefa tarefa) {
        ListaTarefas lista = null;
        for (ListaTarefas listaTarefas : listasTarefasProjeto) {
            if (listaTarefas.getListaTarefas().contains(tarefa)) {
                lista = listaTarefas;
            }
        }
        return lista;
    }

    public String getTempoStringProjeto() {                                           //Método que retorna uma string do tempo restante caso o projeto não esteja atrasado ou do tempo atrasado caso este esteja atrasado
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        String diasString = " dia";
        String horasString = " hora";
        String minutosString = " minuto";
        String finalString = " restantes";
        if (isAtrasadoProjeto()) {
            minutos = -(int) getTempoMinutosProjeto();
            finalString = " atrasados";
        } else {
            minutos = (int) getTempoMinutosProjeto();
        }
        dias = minutos / (24 * 60);
        horas = (minutos % (24 * 60)) / 60;
        minutos = (minutos % (24 * 60)) % 60;
        if (dias != 1) {
            diasString += "s";
        }
        if (horas != 1) {
            horasString += "s";
        }
        if (minutos != 1) {
            minutosString += "s";
        }
        return dias + diasString + ", " + horas + horasString + " e " + minutos + minutosString + finalString;
    }

    public int getTempoMinutosProjeto() {                                                                   //Método que retorna a difeença em minutos da data limite do projeto e data corrente 
        return (int) Duration.between(LocalDateTime.now(), dataLimiteProjeto).toMinutes();
    }

    public boolean isAtrasadoProjeto() {
        return (LocalDateTime.now().isAfter(dataLimiteProjeto) && !this.isConcluídoProjeto);
    }

    public final void terminarProjeto() {                                                      //Método que termina o projeto alterando o seu estado e data de conclusão
        isConcluídoProjeto = true;
        dataConclusãoProjeto = LocalDateTime.now();
    }

    public final void recomeçarProjeto() {                                                           //Método que recomeça o projeto alterando o seu estado e data de conclusão
        isConcluídoProjeto = false;
        dataConclusãoProjeto = null;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codProjeto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Projeto other = (Projeto) obj;
        if (this.codProjeto != other.codProjeto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projeto{" + "t\u00edtuloProjeto=" + títuloProjeto + ", descri\u00e7\u00e3oProjeto=" + descriçãoProjeto + ", ownerProjeto=" + ownerProjeto + ", codProjeto=" + codProjeto + ", listaAssociatedUsersProjeto=" + listaAssociatedUsersProjeto + ", listasTarefasProjeto=" + listasTarefasProjeto + ", dataIn\u00edcioProjeto=" + dataInícioProjeto + ", dataLimiteProjeto=" + dataLimiteProjeto + ", dataConclus\u00e3oProjeto=" + dataConclusãoProjeto + ", isConclu\u00eddoProjeto=" + isConcluídoProjeto + '}';
    }

}
