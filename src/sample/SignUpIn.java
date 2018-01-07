package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpIn {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginName;

    @FXML
    private PasswordField password;

    @FXML
    private Button signIn;

    @FXML
    private TextField inName;

    @FXML
    private TextField inHandle;

    @FXML
    private TextField inEmail;

    @FXML
    private PasswordField inPassword;

    @FXML
    private Button signUp;

    @FXML
    void SignIn(ActionEvent event) throws IOException {
        String loginNameText = loginName.getText();
        boolean b = false;

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));

            while (true){
                String data = bufferedReader.readLine();
                if (data == null)
                    break;

                String[] s = data.split("\t\t");
                if((loginNameText == s[1] || loginNameText == s[2]) && password.getText().equals(s[3])){
                    b = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(b){
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        else
            System.out.println("Wrong Input");

        loginName.setText(null);
        password.setText(null);
        inHandle.setText(null);
        inEmail.setText(null);
        inName.setText(null);
        inPassword.setText(null);
    }

    @FXML
    void SignUp(ActionEvent event) throws IOException {
        String email,name,handle,password;

        email = inEmail.getText();
        name = inName.getText();
        handle = inHandle.getText();
        password = inPassword.getText();

        if(password.length()<8){
            System.out.println("Please Enter a Secure Password.");
            return;
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("tmp.txt"));
            while (true){
                String data = bufferedReader.readLine();
                if (data == null || data.length()<4)
                    break;

                String s[] = data.split("\t\t");
                if(s[1].equals(handle) || s[2].equals(email)){
                    System.out.println("This Email or Handle is Already Used.");
                    bufferedReader.close();
                    bufferedWriter.close();
                    return;
                }
                bufferedWriter.write(data+"\n");
            }
            bufferedWriter.write(name+"\t\t"+handle+"\t\t"+email+"\t\t"+password+"\n");
            bufferedReader.close();
            bufferedWriter.close();

            BufferedReader bufferedReader1 = new BufferedReader(new FileReader("tmp.txt"));
            BufferedWriter bufferedWriter1= new BufferedWriter(new FileWriter("data.txt"));
            while (true){
                String data = bufferedReader1.readLine();
                if(data == null)
                    break;
                bufferedWriter1.write(data+"\n");
            }
            bufferedReader1.close();
            bufferedWriter1.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        loginName.setText(null);
        this.password.setText(null);
        inHandle.setText(null);
        inEmail.setText(null);
        inName.setText(null);
        inPassword.setText(null);


        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        assert loginName != null : "fx:id=\"loginName\" was not injected: check your FXML file 'sample.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'sample.fxml'.";
        assert signIn != null : "fx:id=\"signIn\" was not injected: check your FXML file 'sample.fxml'.";
        assert inName != null : "fx:id=\"inName\" was not injected: check your FXML file 'sample.fxml'.";
        assert inHandle != null : "fx:id=\"inHandle\" was not injected: check your FXML file 'sample.fxml'.";
        assert inEmail != null : "fx:id=\"inEmail\" was not injected: check your FXML file 'sample.fxml'.";
        assert inPassword != null : "fx:id=\"inPassword\" was not injected: check your FXML file 'sample.fxml'.";
        assert signUp != null : "fx:id=\"signUp\" was not injected: check your FXML file 'sample.fxml'.";

    }
}


