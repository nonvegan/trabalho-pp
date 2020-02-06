package BackEnd;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Tarefa implements Serializable {

    private String títuloTarefa;
    private String descriçãoTarefa;
    private final User ownerTarefa;
    private User associatedUserTarefa;
    private String prioridadeTarefa;
    private final LocalDateTime dataÍnicioTarefa;
    private LocalDateTime dataLimiteTarefa;
    private LocalDateTime dataConclusãoTarefa;
    private boolean isConcluídaTarefa;

    public Tarefa(String nome, String Descrição, User OwnerTarefa, User AssociatedUser, String Prioridade, LocalDateTime dataLimiteTarefa) {
        this.títuloTarefa = nome;
        this.descriçãoTarefa = Descrição;
        this.ownerTarefa = OwnerTarefa;
        this.associatedUserTarefa = AssociatedUser;
        this.prioridadeTarefa = Prioridade;
        this.dataÍnicioTarefa = LocalDateTime.now();
        this.dataLimiteTarefa = dataLimiteTarefa;
        this.isConcluídaTarefa = false;
    }

    public String getTítuloTarefa() {
        return títuloTarefa;
    }

    public void setTítuloTarefa(String títuloTarefa) {
        this.títuloTarefa = títuloTarefa;
    }

    public String getDescriçãoTarefa() {
        return descriçãoTarefa;
    }

    public User getOwnerTarefa() {
        return ownerTarefa;
    }

    public LocalDateTime getDataÍnicioTarefa() {
        return dataÍnicioTarefa;
    }

    public void setDescriçãoTarefa(String descriçãoTarefa) {
        this.descriçãoTarefa = descriçãoTarefa;
    }

    public User getAssociatedUserTarefa() {
        return associatedUserTarefa;
    }

    public void setAssociatedUserTarefa(User associatedUserTarefa) {
        this.associatedUserTarefa = associatedUserTarefa;
    }

    public String getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(String prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public LocalDateTime getDataLimiteTarefa() {
        return dataLimiteTarefa;
    }

    public void setDataLimiteTarefa(LocalDateTime dataLimiteTarefa) {
        this.dataLimiteTarefa = dataLimiteTarefa;
    }

    public LocalDateTime getDataConclusãoTarefa() {
        return dataConclusãoTarefa;
    }

    public void setDataConclusãoTarefa(LocalDateTime dataConclusãoTarefa) {
        this.dataConclusãoTarefa = dataConclusãoTarefa;
    }

    public String getTempoStringTarefa() {                                                                   //Método que retorna uma string do tempo restante caso o tarefa não esteja atrasada ou do tempo atrasado caso este esteja atrasada
        Duration duração = Duration.between(LocalDateTime.now(), dataLimiteTarefa);
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        String diasString = " dia";
        String horasString = " hora";
        String minutosString = " minuto";
        String finalString = " restantes";
        if (isAtrasada()) {
            minutos = -(int) duração.toMinutes();
            finalString = " atrasados";
        } else {
            minutos = (int) duração.toMinutes();
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

    public boolean isAtrasada() {                                                                                  //Método que verifica se a tarefa está atrasada
        return (LocalDateTime.now().isAfter(dataLimiteTarefa) && !this.isConcluídaTarefa);
    }

    public void setIsConcluídaTarefa(boolean Conclusão) {
        this.isConcluídaTarefa = Conclusão;
    }

    public boolean isConcluídaTarefa() {
        return isConcluídaTarefa;
    }

    public void terminarTarefa() {                                            //Método que termina a tarefa alterando o seu estado e data de conclusão               
        setIsConcluídaTarefa(true);
        setDataConclusãoTarefa(LocalDateTime.now());
    }

    public void recomeçarTarefa() {                                            //Método que recomeça a tarefa alterando o seu estado e data de conclusão   
        setIsConcluídaTarefa(false);
        setDataConclusãoTarefa(null);
    }

    @Override
    public String toString() {
        return "Tarefa{" + "nomeTarefa=" + títuloTarefa + ", Descri\u00e7\u00e3oTarefa=" + descriçãoTarefa + ", OwnerTarefa=" + ownerTarefa + ", AssociatedUserTarefa=" + associatedUserTarefa + ", PrioridadeTarefa=" + prioridadeTarefa + ", DataIn\u00edcioTarefa=" + dataÍnicioTarefa + ", DataFimTarefa=" + dataLimiteTarefa + ", DataConclus\u00e3oTarefa=" + dataConclusãoTarefa + ", isConclu\u00eddaTarefa=" + isConcluídaTarefa + '}';
    }

}
