package earth;//地球

import java.util.Scanner;

public class Capsule {//平衡舱
    public static void main(String[] args) {
        System.out.println("Best Wars");
        String str="输入b为霸王龙；输入l为狼蛛；输入k为恐龙勇士"+",break结束";
        System.out.println("第一次输入："+str);
        System.out.println("第一次输入确认角色后,再次输入x为角色笑声,t为变身,而输入第一次输入内容为随机播放");
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        while (!line.equals("break")) {
            String url;
            if(line.equals("l")){
                url="狼蛛";
                check(line,url);
            }else if(line.equals("b")){
                url="霸王龙";
                check(line,url);
            }else if(line.equals("k")){
                url="恐龙勇士";
                check(line,url);
            }else{
                System.out.println("输入有误！！！"+str);
            }
            System.out.println("-------------------------");
            line=sc.nextLine();
        }
        System.out.println("successful");
    }
    public static void check(String line,String url){
        Scanner sc = new Scanner(System.in);
        String l=sc.nextLine();
        while (l.equals("t")||l.equals(line)||l.equals("x")){
            if(l.equals("t")){
                new CreateBeasts().trans(url);
            }else if(l.equals("x")){
                new CreateBeasts().laughter(url);
            }else{
                new CreateBeasts().random(url);
            }
            l=sc.nextLine();
        }
    }
}
