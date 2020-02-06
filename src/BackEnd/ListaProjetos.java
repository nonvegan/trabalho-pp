package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class ListaProjetos implements Serializable {

    private ArrayList<Projeto> listaProjetos;

    public ListaProjetos() {
        listaProjetos = new ArrayList<Projeto>();
    }

    public ArrayList<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public boolean isProjetoListaProjetos(Projeto projeto) {//verifica se existe
        return listaProjetos.contains(projeto);
    }

    public void addProjetoListaProjetos(Projeto projeto) {//adiciona 
        listaProjetos.add(projeto);
    }

    public void removeProjetoListaProjetos(Projeto projeto) { //remove se existir
        if (listaProjetos.contains(projeto)) {
            listaProjetos.remove(projeto);
        }
    }

    public int projetoCounterListaProjetos() {
        return listaProjetos.size();
    }

    public Projeto getProjetoTarefa(Tarefa tarefa) {                            //Método que devolve a Projeto da lista de Projetos em que um tarefa está contida
        Projeto projetoTarefa = null;
        for (Projeto projeto : listaProjetos) {
            for (ListaTarefas listaTarefas : projeto.getListasTarefas()) {
                for (Tarefa tarefA : listaTarefas.getListaTarefas()) {
                    if (tarefa.equals(tarefA)) {
                        projetoTarefa = projeto;
                    }
                }
            }
        }
        return projetoTarefa;
    }

    public ListaProjetos getListaProjetosUser(User user) {                     //Método que devolve a uma Lista de Projetos com todos os projetos a qual um utilizador é associado ou dono
        ListaProjetos listaProjetosUser = new ListaProjetos();
        for (Projeto projeto : this.getListaProjetos()) {
            if (user.equals(projeto.getOwnerProjeto()) || projeto.getListaAssociatedUsersProjeto().getListaUsers().contains(user)) {
                listaProjetosUser.addProjetoListaProjetos(projeto);
            }
        }
        return listaProjetosUser;
    }

    public ListaProjetos getListaProjetosNãoConcluídos() {                     //Método que devolve a uma Lista de Projetos com todos os projetos a qual um utilizador é associado ou dono
        ListaProjetos listaProjetosNãoConcluídos = new ListaProjetos();
        for (Projeto projeto : this.getListaProjetos()) {
            if (!projeto.getIsConcluídoProjeto()) {
                listaProjetosNãoConcluídos.addProjetoListaProjetos(projeto);
            }
        }
        return listaProjetosNãoConcluídos;
    }

    public ListaProjetos getListaProjetosOrdenados() {           //Método que devolve a lista de prjetos odernada da mais atrasada á mais adiantada (lista nao pode ser vazia)
        ListaProjetos listaProjetosTemporária = this;
        ListaProjetos listaProjetosOrdenada = new ListaProjetos();

        while (!listaProjetosTemporária.getListaProjetos().isEmpty()) {
            Projeto projetoMaisAtrasado = listaProjetosTemporária.getListaProjetos().get(0);
            for (Projeto projeto : listaProjetosTemporária.getListaProjetos()) {
                if (projeto.getTempoMinutosProjeto() < projetoMaisAtrasado.getTempoMinutosProjeto()) {
                    projetoMaisAtrasado = projeto;
                }
            }
            listaProjetosTemporária.removeProjetoListaProjetos(projetoMaisAtrasado);
            listaProjetosOrdenada.addProjetoListaProjetos(projetoMaisAtrasado);
        }
        return listaProjetosOrdenada;
    }

    public Projeto getProjetoMaisUsersEnvolvidos() {            //Método que devolve o projeto com mais utilizadores envolvidos na lista
        Projeto projetoMaisUsersEnvolvidos = this.getListaProjetos().get(0);
        for (Projeto projeto : this.getListaProjetos()) {
            if (projeto.getNumeroUsers() > projetoMaisUsersEnvolvidos.getNumeroUsers()) {
                projetoMaisUsersEnvolvidos = projeto;
            }
        }
        return projetoMaisUsersEnvolvidos;
    }

    public Projeto getProjetoMaisTarefaConcluídas() {            //Método que devolve o projeto com mais tarefas concluídas na lista
        Projeto projetoMaIsTarefasConcluídas = this.getListaProjetos().get(0);
        for (Projeto projeto : this.getListaProjetos()) {
            if (projeto.getNumeroTarefasConcluidas() > projetoMaIsTarefasConcluídas.getNumeroTarefasConcluidas()) {
                projetoMaIsTarefasConcluídas = projeto;
            }
        }
        return projetoMaIsTarefasConcluídas;
    }

    public void refreshEstadoProjetos() {                 //Método que atualizado o estado de todos os projetos na lista
        for (Projeto projeto : this.getListaProjetos()) {
            projeto.refreshIsConcluído();
        }
    }

    public int getNumeroProjetos() {        //Método que devolve o número de Projetos na lista
        return this.getListaProjetos().size();
    }

    public int getNumeroProjetosEmCurso() {                            //Método que devolve o número de Projetos não concluídos e não atrasados na lista
        int numeroProjetoEmCursos = 0;
        for (Projeto projeto : this.getListaProjetos()) {
            if (!projeto.getIsConcluídoProjeto() && !projeto.isAtrasadoProjeto()) {
                numeroProjetoEmCursos++;
            }
        }
        return numeroProjetoEmCursos;
    }

    public int getNumeroProjetosAtrasados() {              //Método que devolve o número de Projetos não concluídos e atrasados na lista
        int numeroProjetosAtrasados = 0;
        for (Projeto projeto : this.getListaProjetos()) {
            if (projeto.isAtrasadoProjeto() && !projeto.getIsConcluídoProjeto()) {
                numeroProjetosAtrasados++;
            }
        }
        return numeroProjetosAtrasados;
    }

    public int getNumeroProjetosConcluídos() {             //Método que devolve o número de Projeto concluídos na lista
        int numeroProjetosConcluídos = 0;
        for (Projeto projeto : this.getListaProjetos()) {
            if (projeto.getIsConcluídoProjeto()) {
                numeroProjetosConcluídos++;
            }
        }
        return numeroProjetosConcluídos;
    }

    @Override
    public String toString() {
        return "ListaProjetos{" + "listaProjetos=" + listaProjetos + '}';
    }

}
