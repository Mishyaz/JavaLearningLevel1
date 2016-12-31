package ex8XOGameGraphic;

import ex8XOGameGraphic.Model.MainGame;
import ex8XOGameGraphic.View.GameWindow;

public class Main {
    public static void main(String[] args) {
//        GameWindowTest gameWindowTest = new GameWindowTest();
//        gameWindowTest.init();
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        MainGame.start();
    }
}
