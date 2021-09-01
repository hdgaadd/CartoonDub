package team.beastWars;

import theme.BeastWars;

import java.util.HashMap;
//原始兽队伍
public class Predacon extends BeastWars {
    static HashMap<String,String> map=new HashMap<String,String>(){{
        put("l","l");
    }};
    public Predacon() { super("Predacon", map);}
}
