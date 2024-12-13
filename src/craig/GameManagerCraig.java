package craig;

import java.util.ArrayList;

public class GameManagerCraig {
    ArrayList<FighterCraig> fighterChoices = new ArrayList();
    FighterCraig[] fighters = new FighterCraig[2];
    String background;

    public GameManagerCraig() {
        //load fighter choices;

    }
    public void chooseFighter(int player, FighterCraig fighter){

    }
    public FighterCraig getFighter(String name){
        for (int i = 0; i < fighterChoices.size(); i++) {
            if(fighterChoices.get(i).name.equalsIgnoreCase(name)){
                return fighterChoices.get(i);
            }
        }
        return null;
    }

    public void startFight(){

    }
    public void setPlayer1Fighter(){

    }

    public void draw(){
        for (int i = 0; i < fighters.length; i++) {
            fighters[i].draw();
        }
    }
}
