/**
 * 
 */
package view;

import java.awt.Font;



/**
 * @author zetrax
 *
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GUIstrart extends Application{
	
	
	
	private static TextField prihlasovacieHeslo = new PasswordField();
	private static TextField prihlasovacieMeno = new TextField();
	private static Button prihlasovacieTlacidlo = new Button("Prihlasit");
	private static Text nadpisMeno = new Text ("Prihlasovacie meno");
	private static Text nadpisHeslo = new Text ("Heslo");

	
	
	
	public static void main(String[] args) {		
		launch(args);	
	}

	

	@Override
	public void start(Stage prihlasovacieOkno){
		
		prihlasovacieOkno.setTitle("Prihlasenie");
				
		GridPane prihlasenie= new GridPane();
		
		 prihlasenie.setHgap(5);
		 prihlasenie.setVgap(5);
		 prihlasenie.setPadding(new Insets(10,20,10,20));
		 
		 
		 prihlasenie.add(prihlasovacieTlacidlo=new Button("Prihlasit"),3,5);
		 prihlasenie.add(nadpisMeno,2,3);
		 prihlasenie.add(nadpisHeslo,2,4);
		 prihlasenie.add(prihlasovacieMeno,3,3);
		 prihlasenie.add(prihlasovacieHeslo,3,4);
		 
		 Scene scene = new Scene(prihlasenie,400,200);
		 prihlasovacieOkno.setScene(scene);
		prihlasovacieOkno.show();

	
		

	}
	
	 
	 
}
