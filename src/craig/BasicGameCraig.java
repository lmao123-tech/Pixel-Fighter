package craig;

import nl.saxion.app.SaxionApp;

import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

import static craig.FighterCraig.actionState.firstAttack;

public class BasicGameCraig implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGameCraig(), 1000, 1000, 40);
    }
    FighterCraig fighter = new FighterCraig();

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        SaxionApp.clear();

    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKeyCode() == KeyboardEvent.VK_1){
            fighter.currentState = firstAttack;
        }
    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {

    }
}






