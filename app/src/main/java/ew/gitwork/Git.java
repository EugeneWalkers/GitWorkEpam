package ew.gitwork;

/**
 * Created by user on 16.03.2018.
 */

public class Git {
    String data = "Hello world";
    public void doSmth(){
        StringBuilder dataBuilder = new StringBuilder(data);
        dataBuilder.append("!");
    }
}
