package valida1;

import javax.swing.JOptionPane;

public class Valida {

    public static long pedirDato() {
        long res;
        do {
            res = Long.parseLong(JOptionPane.showInputDialog("Teclea o dato"));
        } while (res <= 0);
        return res;
    }
}
