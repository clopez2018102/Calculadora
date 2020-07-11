
package org.cristopherpineda.sistema;

import javax.swing.JOptionPane;

public class Salida {
    
    public void attachShutDownHook(){
        Runtime.getRuntime() .addShutdownHook(new Thread(){
            @Override
            public void run(){
            }
        }
        );
    
    JOptionPane.showMessageDialog(null,"GRACIAS!!!");
}
}