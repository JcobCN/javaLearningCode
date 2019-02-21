package game;

import heros.*;

public class LolEmulator {
    public static void main(String[] args){
        Ez ez1 = new Ez("lab11", 200f, 20f, 400);
        Ez ez2 = new Ez("dze", 300f, 30f, 350);
        ez1.Q(ez2);
    }
}
