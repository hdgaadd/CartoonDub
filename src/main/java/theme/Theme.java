package theme;

import java.util.HashMap;
import java.util.Map;

public abstract class Theme {
    final String themeName;//动画片名称
    final String teamName;//队伍名称
    final HashMap<String,String> map;//都有人物map
    public Theme(String themeName, String teamName, HashMap<String, String> map) {
        this.map = map;
        this.teamName = teamName;
        this.themeName = themeName;
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
        String str=sb.toString();
        System.out.println("第一次输入："+str);
        System.out.println("第一次输入确认角色后,再次输入x为角色笑声,t为变身,而输入第一次输入内容为随机播放");
    }
}
