package calculadora.marco;

import calculadora.App;
import javafx.scene.layout.Pane;

public class Temas {
    private static void setTema(Pane pane, String tema) {
        pane.getStylesheets().add(App.class.getResource("gui/" + tema + ".css").toExternalForm());
    }

    private static void clear(Pane pane) {
        pane.getStylesheets().clear();
    }

    static void setTemaModerno(Pane pane) {
        clear(pane);
        setTema(pane, "Style");
    }

    static void setTemaJubilado(Pane pane) {
        clear(pane);
    }

    static void setTemaViejuno(Pane pane) {
        clear(pane);
        setTema(pane, "Style");
        setTema(pane, "Style2");
    }
}
