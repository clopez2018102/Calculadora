/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristopherpineda.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
    int op;
    @FXML Button btnMasMenos;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnUnoX;
    @FXML Button btnPorcentaje;
    @FXML Button btnCuadrado;
    @FXML Button btnRaiz;
    @FXML Button btnDividir;
    @FXML Button btnMultiplicar;
    @FXML Button btnRestar;
    @FXML Button btnSumar;
    @FXML Button btnPunto;
    @FXML Button btnCero;
    @FXML Button btnIgual;
    @FXML TextField txtValores;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()==btnUno)
            txtValores.setText(txtValores.getText()+"1");
        else if(event.getSource()== btnDos)
            txtValores.setText(txtValores.getText()+"2");
        else if(event.getSource()== btnTres)
            txtValores.setText(txtValores.getText()+"3");
        else if(event.getSource()== btnCuatro)
            txtValores.setText(txtValores.getText()+"4");
        else if(event.getSource()== btnCinco)
            txtValores.setText(txtValores.getText()+"5");
        else if(event.getSource()== btnSeis)
            txtValores.setText(txtValores.getText()+"6");
        else if(event.getSource()== btnSiete)
            txtValores.setText(txtValores.getText()+"7");
        else if(event.getSource()== btnOcho)
            txtValores.setText(txtValores.getText()+"8");
        else if(event.getSource()== btnNueve)
            txtValores.setText(txtValores.getText()+"9");
        else if(event.getSource()== btnCero)
            txtValores.setText(txtValores.getText()+"0");
        else if(event.getSource()== btnSumar){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;
        }else if(event.getSource()== btnRestar){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 2;  
        }else if(event.getSource()== btnDividir){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 3;
        }else if(event.getSource()== btnMultiplicar){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 2;
        }else if(event.getSource()== btnIgual){
            dato2 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            
            switch(op){
                case 1:
            resultado = dato1+dato2;
            txtValores.setText(String.valueOf(resultado));
            break;
                case 2:
                    resultado = dato1-dato2;
            txtValores.setText(String.valueOf(resultado));
               break;
                case 3:
                    resultado = dato1/dato2;
            txtValores.setText(String.valueOf(resultado));
               break;
                case 4:
                    resultado = dato1*dato2;
            txtValores.setText(String.valueOf(resultado));
            break;
            }
            
        }
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
