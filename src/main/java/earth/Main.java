package earth;

import team.beastWars.Maximal;

public class Main {
    public static void main(String[] args) {
        Maximal t = new Maximal();
        new Dispatcher().dispatcher(t.map,t.roleStr);
    }
}
