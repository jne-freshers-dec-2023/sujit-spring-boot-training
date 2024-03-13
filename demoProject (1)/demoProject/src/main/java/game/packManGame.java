package game;

public class packManGame implements gamingConsole{

    @Override
    public void up() {
        System.out.println("fly up");
    }

    @Override
    public void down() {
        System.out.println("fly down");
    }

    @Override
    public void left() {
        System.out.println("fly left");
    }

    @Override
    public void right() {
        System.out.println("fly right");
    }
}
