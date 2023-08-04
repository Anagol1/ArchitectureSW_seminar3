package ArchitectureSWHW3.Task4;

public class Main {
    public static void main(String[] args) {
        IWork roboworker = new RobotWorker();
        roboworker.work();
        HumanWorker humanworker = new HumanWorker();
        humanworker.eat(); // Здесь было исключение UnsupportedOperationException
        humanworker.work();
    }
}
