package team.beastWars;

import theme.BeastWars;

import java.util.HashMap;
//巨无霸队伍
public class Maximal extends BeastWars {
    public static HashMap<String,String> map=new HashMap<String,String>(){{//必须在构造方法前初始化
        put("k","恐龙勇士");//public让其他包可以访问
        put("b","霸王龙");
        put("l","狼蛛");
    }};
    public Maximal() {
        super("Maxima", map);
    }
}