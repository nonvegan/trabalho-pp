package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class ListaTarefas implements Serializable {

    private String nomeListaTarefas;
    private String descriçãoListaTarefas;
    private ArrayList<Tarefa> listaTarefas;
    private User ownerListaTarefas;

    public ListaTarefas(String nomeListaTarefas, String descriçãoListaTarefas, User owner) {
        this.nomeListaTarefas = nomeListaTarefas;
        this.descriçãoListaTarefas = descriçãoListaTarefas;
        listaTarefas = new ArrayList<>();
        ownerListaTarefas = owner;
    }

    public String getNomeListaTarefas() {
        return nomeListaTarefas;
    }

    public String getDescriçãoListaTarefas() {
        return descriçãoListaTarefas;
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public User getOwnerListaTarefas() {
        return ownerListaTarefas;
    }

    public void setOwnerListaTarefas(User ownerListaTarefas) {
        this.ownerListaTarefas = ownerListaTarefas;
    }

    public void setNomeListaTarefas(String nomeListaTarefas) {
        this.nomeListaTarefas = nomeListaTarefas;
    }

    public void setDescriçãoListaTarefas(String descriçãoListaTarefas) {
        this.descriçãoListaTarefas = descriçãoListaTarefas;
    }

    public boolean isTarefaListaTarefas(Tarefa tarefa) {
        return listaTarefas.contains(tarefa);
    }

    public void addTarefaListaTarefas(Tarefa tarefa) {//adiciona uma tarefa
        if (listaTarefas.isEmpty()) {
            listaTarefas.add(tarefa);
        } else {
            SetOrder(tarefa);
        }
    }

    public void removeTarefaListaTarefas(Tarefa tarefa) {//remove uma tarefa se existir
        if (listaTarefas.contains(tarefa)) {
            listaTarefas.remove(tarefa);
        }
    }

    public int TarefaCounterListaTarefas() {//numer de tarefas
        return listaTarefas.size();
    }

    @Override
    public String toString() {
        return this.getNomeListaTarefas();
    }

    private void SetOrder(Tarefa tarefa) {
        boolean entra = true;
        if (tarefa.getTítuloTarefa().compareTo(listaTarefas.get(listaTarefas.size() - 1).getTítuloTarefa()) > 0) {
            listaTarefas.add(tarefa);
        } else {
            ArrayList<Tarefa> novaListaTarefas = new ArrayList<>();
            for (int i = 0; i < listaTarefas.size(); i++) {
                if (tarefa.getTítuloTarefa().compareTo(listaTarefas.get(i).getTítuloTarefa()) < 0 && entra) {
                    novaListaTarefas.add(tarefa);
                    entra = false;
                } else {
                    if (tarefa.getDataLimiteTarefa().isBefore(listaTarefas.get(i).getDataLimiteTarefa()) && entra) {
                        novaListaTarefas.add(tarefa);
                        entra = false;
                    }
                }
                novaListaTarefas.add(listaTarefas.get(i));
            }
            listaTarefas = novaListaTarefas;
        }
    }

}
