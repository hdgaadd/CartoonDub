package theme;

import java.util.HashMap;

//超能勇士主题
public abstract class BeastWars extends Theme {
    static String functionStr="第一次输入确认角色后,再次输入x为角色笑声,t为变身,而输入第一次输入内容为随机播放";
    public BeastWars(String teamName, HashMap<String, String> map) {
        super("BeastWars",teamName,functionStr,map);
    }
}
