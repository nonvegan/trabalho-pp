package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class ListaUsers implements Serializable {

    private ArrayList<User> listaUsers;

    public ListaUsers() {
        listaUsers = new ArrayList<>();
    }

    public ArrayList<User> getListaUsers() {
        return listaUsers;
    }

    public void addUserListaUsers(User user) {
        if (!listaUsers.contains(user)) {
            listaUsers.add(user);
        }
    }

    public void removeUserListaUsers(User user) {
        listaUsers.remove(listaUsers.indexOf(user));
    }

    public boolean isUserListaUsers(User user) {
        return listaUsers.contains(user);
    }

    public boolean isUserNameListaUsers(String userName) {                    //Método que verifica a presença de um utilizador com o username dado
        for (User user : listaUsers) {
            if (user.getUsernameUser().equals(userName)) {
                return true;
            }

        }
        return false;
    }

    public User getUserListaUsers(String userName) {            //   Método que retorna um utilizador com o username dado, que pertença à lista
        User userEncontrado = null;
        for (User user : listaUsers) {
            if (user.getUsernameUser().equals(userName)) {
                userEncontrado = user;
                break;
            }
        }
        return userEncontrado;
    }

    public int userCounterListaUsers() {
        return listaUsers.size();
    }

    @Override
    public String toString() {
        return "ListaUsers{" + "listaUsers=" + listaUsers + '}';
    }

}
