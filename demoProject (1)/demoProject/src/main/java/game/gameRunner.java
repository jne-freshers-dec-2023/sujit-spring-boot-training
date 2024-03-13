package game;

public class gameRunner {
    gamingConsole game;
  public gameRunner(gamingConsole game){
        this.game = game;
    }
    public void run(){
      System.out.println("game is running :"+game);
      game.up();
      game.down();
    }
}
