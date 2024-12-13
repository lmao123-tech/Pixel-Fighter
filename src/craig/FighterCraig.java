package craig;

import java.util.ArrayList;

public class FighterCraig {
    public int hp;
    public int sp;
    public int atk;
    public int satk;
    public int def;
    public int sdef;
    public int spd;

    public String pic;
    public String background;
    public String imagePath;
    public String name;

    public int x,y;
    public ArrayList<String> attack;

    ArrayList<ActionCraig> actions = new ArrayList<>();
    enum actionState{
        idle, firstAttack, secondAttack, thirdAttack
    }
    actionState currentState = actionState.idle;
    int action;

    public void draw(){
        if(currentState == actionState.idle) {
            //draw idle image
        }else{
            switch(currentState) {
                case firstAttack:
                    //first attack image
                    break;
                case secondAttack:
                    //second attack image
                    break;
                case thirdAttack:
                    //third attack image
                    break;
            }
        }
    }
}
