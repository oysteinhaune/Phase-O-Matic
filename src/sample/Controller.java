package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.Random;

public class Controller {
    @FXML
    TextField phraseField = new TextField();
    String[] pets = {"Fido", "Zeus", "Bin"};

    @FXML
    public void newPhraseButton() {
        int petLength = pets.length;
        Random randomNumber = new Random();
        petLength = Float.floatToIntBits(randomNumber.setSeed(long seed) * petLength);
        String randomPet = pets[petLength];
        phraseField.setText(randomPet);
    }
}
