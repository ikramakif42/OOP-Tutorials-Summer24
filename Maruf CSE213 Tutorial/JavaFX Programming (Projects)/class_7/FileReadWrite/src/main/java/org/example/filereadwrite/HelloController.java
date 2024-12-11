package org.example.filereadwrite;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController implements Initializable {

    @FXML
    private TextArea console;
    private ObservableList<User> userobjectlist;
    @FXML
    private TextField lastnameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField genderField;
    @FXML
    private TextField firstnameField;
    @FXML
    private TextField phoneField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userobjectlist = FXCollections.observableArrayList();
        console.setEditable(false);
    }

    @FXML
    private void readTextFileOnMouseClick(ActionEvent event) {
        String fileLocation = "src/main/resources/org/example/filereadwrite/userdata.txt";
        File file = new File(fileLocation);
        if (file.exists()) {
            try (Scanner scn = new Scanner(file)) {
                while (scn.hasNextLine()) {
                    console.appendText(scn.nextLine() + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            console.appendText("File doesn't exist...!\n");
        }
    }

    @FXML
    private void writeTextFileOnMouseClick(ActionEvent event) {
        String fileLocation = "src/main/resources/org/example/filereadwrite/userdata.txt";
        try (FileWriter fileWriter = new FileWriter(fileLocation, true)) {
            fileWriter.write(console.getText().trim() + "\n");
            console.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void clearTextAreaOnMouseClick(ActionEvent event) {
        console.clear();
        console.setEditable(false);
    }

    @FXML
    private void editableOnMouseClick(ActionEvent event) {
        console.setEditable(true);
    }

    @FXML
    private void readBinaryFileOnMouseClick(ActionEvent event) throws IOException {
        String fileLocation = "src/main/resources/org/example/filereadwrite/rawdata.bin";
        File file = new File(fileLocation);
        if (file.exists()) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
                while (dis.available() > 0) {
                    console.appendText(dis.readUTF() + "\n");
                }
            }
        } else {
            console.appendText("File doesn't exist...!\n");
        }
    }

    @FXML
    private void writeBinaryFileOnMouseClick(ActionEvent event) throws IOException {
        String fileLocation = "src/main/resources/org/example/filereadwrite/rawdata.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileLocation, true))) {
            dos.writeUTF(console.getText().trim() + "\n");
            console.clear();
        }
    }

    @FXML
    private void readObjectBinaryFileOnMouseClick(ActionEvent event) {
        String fileLocation = "src/main/resources/org/example/filereadwrite/userdata.bin";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLocation))) {
            while (true) {
                try {
                    User user = (User) ois.readObject();
                    console.appendText(user.toString() + "\n");
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void writeObjectUsersOnMouseClick(ActionEvent actionEvent) {
        String fileLocation = "src/main/resources/org/example/filereadwrite/userdata.bin";
        String firstname = firstnameField.getText();
        String lastname = lastnameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        String gender = genderField.getText();


        User user = new User(firstname, lastname, gender, email, phone, null, address); // Replace `null` with LocalDate if date of birth is needed.
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            User e = new User();
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        }

    @FXML
    public void clearFieldsOnMouseClick(ActionEvent actionEvent) {
        firstnameField.clear();
        lastnameField.clear();
        emailField.clear();
        phoneField.clear();
        addressField.clear();
        genderField.clear();
    }




}
