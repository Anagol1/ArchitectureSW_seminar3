package ArchitectureSWHW3.Task5;

public interface IPrint {
    default void print(Text text) {
        System.out.println(text.getText());
    }

}

