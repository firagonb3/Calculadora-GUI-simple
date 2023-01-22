package calculadora.marco;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import calculadora.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControladorDelBorder implements Initializable,DraggedScene {

    @FXML
    private MenuItem Jubilado;

    @FXML
    private MenuItem Moderno;

    @FXML
    private MenuItem Viejuno;

    @FXML
    private Button cerrar;

    @FXML
    private BorderPane cosa;

    @FXML
    private Pane coso;

    @FXML
    private ToolBar menu;

    @FXML
    private Button miminizar;

    @FXML
    void setJubilado(ActionEvent event) {
       Temas.setTemaJubilado(coso);
    }

    @FXML
    void setModerno(ActionEvent event) {
        Temas.setTemaModerno(coso);
    }

    @FXML
    void setViejuno(ActionEvent event) {
        Temas.setTemaViejuno(coso);
    }

    @FXML
    void CerrareVento(ActionEvent event) {
        Stage stage = (Stage) cerrar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void MininizarEvento(ActionEvent event) {
        Stage stage = (Stage) miminizar.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // coso.getStylesheets().clear();
        this.onDraggedScene(this.menu);

        try {
            Pane view = (Pane) App.loadFXML("gui/GuiCalculadora");
            cosa.setCenter(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
