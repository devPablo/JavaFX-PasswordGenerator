package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
	@FXML TextField passwordField, lengthField;
	@FXML CheckBox symbolsBox, numbersBox, lowercaseBox, ambiguousBox, uppercaseBox;

	public void passwordButtonEvent(ActionEvent e) {
		if(lengthField.getText().matches("[1-9]\\d*") && (symbolsBox.isSelected() || numbersBox.isSelected() || lowercaseBox.isSelected() || ambiguousBox.isSelected() || uppercaseBox.isSelected())) {
				passwordField.setText(String.valueOf(new Password(lengthField.getText(), symbolsBox.isSelected(), numbersBox.isSelected(), lowercaseBox.isSelected(), ambiguousBox.isSelected(), uppercaseBox.isSelected()).generatePass()));					
				passwordField.setId(secureLevel());
		}
	}
	
	public String secureLevel() {
		int val = Integer.valueOf(lengthField.getText());
		String level = "default";
		if(val <= 5) level = "red";
		if(val >= 6 && val <= 10) level = "yellow";
		if(val > 10) level = "green";
		return level;
	}
}
