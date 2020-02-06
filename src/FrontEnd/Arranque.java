

package FrontEnd;

import BackEnd.Sistema;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Flávio Santos(a89960)
 * @author João Silva(a89956)
 * @author Pedro Magalhães(a89169)
 */
public class Arranque {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SplashScreen splashScreen = new SplashScreen();//cria uma instancia da janela splashscreen
        splashScreen.setVisible(true); //torna-la visível
        for (int i = 1; i < 101; i++) {//A cada 20ms, o valor da barra de progresso aumenta 1%
            splashScreen.getBarraProgresso().setValue(i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);    
            }
        }//Ao final de 2 segundos
        splashScreen.dispose(); //dispose da janela splashscreen
        new Login(new Sistema().readSistema(null)).setVisible(true); //Cria uma instância Login e torna-la visível
    }
}
