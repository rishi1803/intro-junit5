package guru.springframework;

/**
 * Created by Rishabh on 05/01/20.
 */
public class Greating {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }
}
