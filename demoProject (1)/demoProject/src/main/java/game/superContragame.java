package game;

public class superContragame implements gamingConsole{
    @Override
    public void up() {
       System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("sit down");

    }

    @Override
    public void left() {
        System.out.println("shoot missile");

    }

    @Override
    public void right() {
        System.out.println(" shoot bullet");
    }
}
