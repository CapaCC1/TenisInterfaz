package Principal;

import Tenis.Partido;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
	
	public static String codigoResultado(int codigo) {
	    switch (codigo) {
	        case 0:
	            return "Jugador NO Encontrado";
	        case 1:
	            return "**Punto GANADOR Agregado!**";
	        case 2:
	        	return "**Error No Forzado Agregado!**";
	        case 3:
	        	return "**Saque Directo Agregado!**";
	        default:
	            return "Código desconocido";
	    }
	}
	
    @FXML
    private Label titleLabel;

    @FXML
    private TextField nameField;
    
    @FXML
    private Button botonSalir;
    
    @FXML
    private Button comprobarBoton;
    
    @FXML
    private Button botonVolver;
    
    @FXML
    private TextField equipo1 = new TextField();
    
    @FXML
    private TextField equipo2 = new TextField();
    
    @FXML
    private TextField jugador1 = new TextField();
    
    @FXML
    private TextField jugador2 = new TextField();
    
    @FXML
    private TextField jugador3 = new TextField();
    
    @FXML
    private TextField jugador4 = new TextField();
    
    @FXML
    private Label resultado1;
    
    @FXML
    private Button botonAgregar1;
    
    @FXML
    private TextField nombreJugador = new TextField();
    
    public void botonAgregarAction(ActionEvent event) throws Exception {
    	
    	String equipo11 = equipo1.getText();
    	String equipo22 = equipo2.getText();
    	String jugador11 = jugador1.getText();
    	String jugador22 = jugador2.getText();
    	String jugador33 = jugador3.getText();
    	String jugador44 = jugador4.getText();
    	String nombreJugadorT = nombreJugador.getText();
    	Partido partido1 = new Partido();
		partido1.agregarEquipo(equipo11, jugador11, jugador22);
		partido1.agregarEquipo(equipo22, jugador33, jugador44);
		
		int resultado = partido1.agregaPuntoGanador(nombreJugadorT);
		resultado1.setText(codigoResultado(resultado));
		
    }
    
    public void botonVolverAction(ActionEvent event) throws Exception {
    	
    	Node source = (Node) event.getSource();
	    Stage currentStage = (Stage) source.getScene().getWindow();
	    currentStage.close();
	    
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("app2.fxml"));
	    Parent root = loader.load();
	    
	    Stage nuevaStage = new Stage();
	    nuevaStage.setTitle("Estadisticas");
	    nuevaStage.setScene(new Scene(root));
	    nuevaStage.show();
    }
    
    public void comprobarBotonAction(ActionEvent event) throws Exception {	
    	String equipo11 = equipo1.getText();
    	String equipo22 = equipo2.getText();
    	String jugador11 = jugador1.getText();
    	String jugador22 = jugador2.getText();
    	String jugador33 = jugador3.getText();
    	String jugador44 = jugador4.getText();
    	
    	Partido partido1 = new Partido();
		partido1.agregarEquipo(equipo11, jugador11, jugador22);
		partido1.agregarEquipo(equipo22, jugador33, jugador44);
		
		// Obtén la referencia a la ventana actual y ciérrala
	    Node source = (Node) event.getSource();
	    Stage currentStage = (Stage) source.getScene().getWindow();
	    currentStage.close();
		
	    // Carga la nueva ventana
		FXMLLoader loader = new FXMLLoader(getClass().getResource("app2.fxml"));
	    Parent root = loader.load();

	    // Crea una nueva Stage y muestra la nueva ventana
	    Stage nuevaStage = new Stage();
	    nuevaStage.setTitle("Estadisticas");
	    nuevaStage.setScene(new Scene(root));
	    nuevaStage.show();

    }
    
    
    public void handleButtonAction(ActionEvent event) throws Exception {
        String name = nameField.getText();
        switch(name) {
        	case "1":
        		 openNewWindow("option1.fxml", "Agregar Punto Ganador");
                 break;
            case "2":
            	openNewWindow("option2.fxml", "Agregar Error No Forzado");
                break;
            case "3":
                openNewWindow("option3.fxml", "Agregar Saque Directo");
                break;
            case "4":
            	openNewWindow("option4.fxml", "Agregar Saque Directo");
                break;
            case "5":
            	openNewWindow("option5.fxml", "Agregar Saque Directo");
                break;
            default:
                titleLabel.setText("Opcion No Disponible!");
        }
    }

    private void openNewWindow(String path, String title) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
        // Hide this current window (if this is what you want)
        ((Node)(titleLabel)).getScene().getWindow().hide();
    }
    
    public void botonSalirOnAction(ActionEvent e) {
		Stage stage = (Stage) botonSalir.getScene().getWindow();
		stage.close();
	}
}