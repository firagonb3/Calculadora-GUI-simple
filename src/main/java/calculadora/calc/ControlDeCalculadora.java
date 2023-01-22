package calculadora.calc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ControlDeCalculadora implements Initializable {

    private String sNumero;

    public boolean booSuma;
    public boolean booResto;
    public boolean booMenos;
    public boolean booDividir;
    public boolean booMultiplicar;

    private void setBooleans() {
        booSuma = false;
        booMenos = false;
        booResto = false;
        booDividir = false;
        booMultiplicar = false;
    }

    @FXML
    private BorderPane coso;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button bCalcular;

    @FXML
    private Button bDividir;

    @FXML
    private Button bMultiplicar;

    @FXML
    private Button bResto;

    @FXML
    private Button bSuma;

    @FXML
    private Button menos;

    @FXML
    private TextField tPantalla;

    private String getNumero(String numero){
        if (reset) {
            sNumero = null;
            reset=false;
        }

        if (sNumero == null) {
            sNumero = numero;
        } else {
            sNumero = sNumero + numero;
        }
        return sNumero;
    }

    private boolean reset = true;

    @FXML
    private void o0(ActionEvent event) {
        tPantalla.setText(getNumero(b0.getText()));
    }

    @FXML
    private void o1(ActionEvent event) {
        tPantalla.setText(getNumero(b1.getText()));
    }

    @FXML
    private void o2(ActionEvent event) {
        tPantalla.setText(getNumero(b2.getText()));
    }

    @FXML
    private void o3(ActionEvent event) {
        tPantalla.setText(getNumero(b3.getText()));
    }

    @FXML
    private void o4(ActionEvent event) {
        tPantalla.setText(getNumero(b4.getText()));
    }

    @FXML
    private void o5(ActionEvent event) {
        tPantalla.setText(getNumero(b5.getText()));
    }

    @FXML
    private void o6(ActionEvent event) {
        tPantalla.setText(getNumero(b6.getText()));
    }

    @FXML
    private void o7(ActionEvent event) {
        tPantalla.setText(getNumero(b7.getText()));
    }

    @FXML
    private void o8(ActionEvent event) {
        tPantalla.setText(getNumero(b8.getText()));
    }

    @FXML
    private void o9(ActionEvent event) {
        tPantalla.setText(getNumero(b9.getText()));
    }

    @FXML
    private void oDividir(ActionEvent event) {
        setBooleans();
        booDividir = true;
        try {
            Calculos.setNumero(Double.parseDouble(sNumero));
        } catch (Exception e) {
            //TODO: handle exception
        }
        sNumero=null;
    }

    @FXML
    private void oMenos(ActionEvent event) {
        setBooleans();
        booMenos = true;
        try {
            Calculos.setNumero(Double.parseDouble(sNumero));
        } catch (Exception e) {
            //TODO: handle exception
        }
        sNumero=null;
    }

    @FXML
    private void oMultiplicar(ActionEvent event) {
        setBooleans();
        booMultiplicar = true;
        try {
            Calculos.setNumero(Double.parseDouble(sNumero));
        } catch (Exception e) {
            //TODO: handle exception
        }
        sNumero=null;
    }

    @FXML
    private void oResto(ActionEvent event) {
        setBooleans();
        Calculos.getNull();
        sNumero=null;

        oCalcular(event);
    }

    @FXML
    private void oSuma(ActionEvent event) {
        setBooleans();
        booSuma = true;
        try {
            Calculos.setNumero(Double.parseDouble(sNumero));
        } catch (Exception e) {
            //TODO: handle exception
        }
        sNumero=null;
    }

    @FXML
    private void oCalcular(ActionEvent event) {
        if (booSuma) {
            sNumero = Calculos.getSuma(Double.parseDouble(sNumero));
        } else if (booMenos) {
            sNumero = Calculos.getMenos(Double.parseDouble(sNumero));
        } else if (booDividir) {
            sNumero = Calculos.getDividir(Double.parseDouble(sNumero));
        } else if (booMultiplicar) {
            sNumero = Calculos.getMultiplicar(Double.parseDouble(sNumero));
        }

        reset=true;
        tPantalla.setText(sNumero);
        Calculos.setNumero(0);
        System.out.println(Calculos.iNumero + " : " + sNumero);
        setBooleans();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        coso.getStylesheets().clear();
        setBooleans();
    }
}
