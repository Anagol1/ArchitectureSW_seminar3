package ArchitectureSWHW3.Task4;

public class HumanWorker implements IWork, IEat {
    public void work() {
        System.out.println("Человек работает");
    }

    public void eat() {
        System.out.println("Человек ест");
    }
}
