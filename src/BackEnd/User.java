package BackEnd;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class User implements Serializable {

    private String usernameUser;
    private String passwordUser;
    private String nomeUser;
    private String emailUser;
    private String telemóvelUser;
    private char sexoUser;
    private LocalDate dataInscriçãoUser;
    private LocalDate dataNascimentoUser;

    public User(String usernameUser, String passwordUser, String nomeUser, char sexoUser) {
        this.usernameUser = usernameUser;
        this.passwordUser = passwordUser;
        this.nomeUser = nomeUser;
        this.sexoUser = sexoUser;
        this.dataInscriçãoUser = LocalDate.now();
    }

    public String getUsernameUser() {
        return usernameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getTelemóvelUser() {
        return telemóvelUser;
    }

    public char getSexoUser() {
        return sexoUser;
    }

    public LocalDate getDataInscriçãoUser() {
        return dataInscriçãoUser;
    }

    public LocalDate getDataNascimentoUser() {
        return dataNascimentoUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public void setNomeUser(String primeiroNomeUser) {
        this.nomeUser = primeiroNomeUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setTelemóvelUser(String telemóvelUser) {
        this.telemóvelUser = telemóvelUser;
    }

    public void setSexoUser(char sexoUser) {
        this.sexoUser = sexoUser;
    }

    public void setDataNascimentoUser(LocalDate dataNascimentoUser) {
        this.dataNascimentoUser = dataNascimentoUser;
    }

    public int getIdadeUser() {                                                             //Método que retorna a idade do utilizador apartir da data de nascimento.
        return Period.between(dataNascimentoUser, LocalDate.now()).getYears();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.usernameUser);
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
        final User other = (User) obj;
        if (!Objects.equals(this.usernameUser, other.usernameUser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getUsernameUser();
    }

}
