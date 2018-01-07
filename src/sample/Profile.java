package sample;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Profile {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button home;

    @FXML
    private Button contest;

    @FXML
    private Button problemset;

    @FXML
    private Button discussion;

    @FXML
    private Button profile;

    @FXML
    private Button signOut;

    @FXML
    private ImageView image;

    @FXML
    private Label Name;

    @FXML
    private Button NameB;

    @FXML
    private Button editprofile;

    @FXML
    private Button submission;

    @FXML
    private Button blog;

    @FXML
    private Button saved;

    @FXML
    private Label Handle;

    @FXML
    private Button uploadImage;


    @FXML
    void Blog(ActionEvent event) {

    }

    @FXML
    void EditProfile(ActionEvent event) {

    }

    @FXML
    void NameB(ActionEvent event) {

    }

    @FXML
    void Saved(ActionEvent event) {

    }

    @FXML
    void Submission(ActionEvent event) {

    }

    @FXML
    void UploadImage(ActionEvent event) throws MalformedURLException {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);

        if(file!=null){
            System.out.println(file.getPath());
            Image imagex = new Image(file.toURI().toURL().toString());
            image.setImage(imagex);
        }
        else {
            System.out.println("Nothing Found");
        }
    }

    @FXML
    void Contest(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Contest.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Discussion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Discussion.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Problemset(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Problemset.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ProfileItself(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SignOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUpIn.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'Profile.fxml'.";
        assert contest != null : "fx:id=\"contest\" was not injected: check your FXML file 'Profile.fxml'.";
        assert problemset != null : "fx:id=\"problemset\" was not injected: check your FXML file 'Profile.fxml'.";
        assert discussion != null : "fx:id=\"discussion\" was not injected: check your FXML file 'Profile.fxml'.";
        assert profile != null : "fx:id=\"profile\" was not injected: check your FXML file 'Profile.fxml'.";
        assert signOut != null : "fx:id=\"signOut\" was not injected: check your FXML file 'Profile.fxml'.";
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'Profile.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'Profile.fxml'.";
        assert NameB != null : "fx:id=\"NameB\" was not injected: check your FXML file 'Profile.fxml'.";
        assert editprofile != null : "fx:id=\"editprofile\" was not injected: check your FXML file 'Profile.fxml'.";
        assert submission != null : "fx:id=\"submission\" was not injected: check your FXML file 'Profile.fxml'.";
        assert blog != null : "fx:id=\"blog\" was not injected: check your FXML file 'Profile.fxml'.";
        assert saved != null : "fx:id=\"saved\" was not injected: check your FXML file 'Profile.fxml'.";
        assert Handle != null : "fx:id=\"Handle\" was not injected: check your FXML file 'Profile.fxml'.";
        assert uploadImage != null : "fx:id=\"uploadImage\" was not injected: check your FXML file 'Profile.fxml'.";

    }
}


