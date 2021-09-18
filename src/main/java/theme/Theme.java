package theme;

import java.util.HashMap;
import java.util.Map;

public abstract class Theme {
    public final String themeName;//动画片名称
    public final String teamName;//队伍名称
    public final HashMap<String,String> map;//都有人物map
    public String roleStr;//角色输入提醒
    public final String functionStr;//功能输入提醒
    public Theme(String themeName, String teamName,String functionStr,HashMap<String, String> map) {
        this.teamName = teamName;
        this.themeName = themeName;
        this.functionStr=functionStr;
        this.map = map;
        start();//开始方法
    }
    public String getThemeName(){return themeName;};//都拥有该get
    public String getTeamName(){return teamName;};//都拥有该get
    public void start(){//都拥有开始方法
        System.out.println("主题："+getThemeName()+"       "+"队伍："+getTeamName());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<String, String> m:map.entrySet()){
            sb.append("输入"+m.getKey()+"为"+m.getValue()+"；");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(",break结束");
        roleStr=sb.toString();
        System.out.println("第一次输入："+roleStr);
        System.out.println(functionStr);
    }
}
