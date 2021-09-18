package theme;

import java.util.HashMap;
//哆啦A梦主题
public abstract class Doraemon extends Theme{
    static String functionStr="";
    public Doraemon(String teamName, HashMap<String, String> map) {
        super("Doraemon", teamName,functionStr, map);
    }
}
