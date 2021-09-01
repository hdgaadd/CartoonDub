package team.beastWars;

import theme.BeastWars;

import java.util.HashMap;
//巨无霸队伍
public class Maximal extends BeastWars {
    static HashMap<String,String> map=new HashMap<String,String>(){{
        put("k","恐龙勇士");
    }};
    public Maximal() {
        super("Maxima", map);
    }
}