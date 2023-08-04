package ArchitectureSWHW3.Task4;

public class RobotWorker implements IWork {
    public void work() {
        System.out.println("Робот работает");
    }

    public void eat() {
        throw new UnsupportedOperationException("Роботы не едят!");
    }
}
