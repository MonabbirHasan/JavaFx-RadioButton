package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {

	@FXML
	private Label myLabel;
	@FXML
	private RadioButton javascript, php, python, dart, ruby, cSharp, react, vue, angular, svelte, laravel, rails, flask, node, nest, dart2, django, dotnet;
	
	public void getSelect(ActionEvent event) {
		if(javascript.isSelected()) {
			myLabel.setText(javascript.getText());
		}else if(php.isSelected()) {
			myLabel.setText(php.getText());
		}else if(python.isSelected()) {
			myLabel.setText(python.getText());
		}else if(dart.isSelected()) {
			myLabel.setText(dart.getText());
		}else if(ruby.isSelected()) {
			myLabel.setText(ruby.getText());
		}else if(cSharp.isSelected()) {
			myLabel.setText(cSharp.getText());
		}else if(react.isSelected()) {
			myLabel.setText(react.getText());
		}else if(vue.isSelected()) {
			myLabel.setText(vue.getText());
		}else if(angular.isSelected()) {
			myLabel.setText(angular.getText());
		}else if(svelte.isSelected()) {
			myLabel.setText(svelte.getText());
		}else if(laravel.isSelected()) {
			myLabel.setText(laravel.getText());
		}else if(rails.isSelected()) {
			myLabel.setText(rails.getText());
		}else if(flask.isSelected()) {
			myLabel.setText(flask.getText());
		}else if(node.isSelected()) {
			myLabel.setText(node.getText());
		}else if(nest.isSelected()) {
			myLabel.setText(nest.getText());
		}else if(dart2.isSelected()) {
			myLabel.setText(dart2.getText());
		}else if(django.isSelected()) {
			myLabel.setText(django.getText());
		}else if(dotnet.isSelected()) {
			myLabel.setText(dotnet.getText());
		}else {
			myLabel.setText("SELECT YOUR LANGUAGE");
		}
	}
	
	
	
	
	
}
