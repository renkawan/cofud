/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cofud;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Rendra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            CoFuD cfd = new CoFuD();
            cfd.setLocationRelativeTo(null);
            cfd.setVisible(true);
            cfd.runHome();
        } catch (Exception e) {
            Logger.getLogger(CoFuD.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
