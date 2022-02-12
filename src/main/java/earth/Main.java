package earth;

import team.beastWars.Maximal;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Maximal t = new Maximal();
        new Dispatcher().dispatcher(t.map,t.roleStr);
    }
}
