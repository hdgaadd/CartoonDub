package earth;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Dispatcher {
    public void dispatcher(HashMap<String, String> map,String str) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        while (!line.equals("break")) {
            String url;
            if(map.containsKey(line)){
                check(line,map.get(line));
            }else{
                System.out.println("输入有误！！！"+str);
            }
            System.out.println("-------------------------");
            line=sc.nextLine();
        }
        System.out.println("successful");
    }
    public void check(String line,String url) throws IOException {
        Scanner sc = new Scanner(System.in);
        String l=sc.nextLine();
        while (l.equals("t")||l.equals(line)||l.equals("x")){
            if(l.equals("t")){
                new PlayMusic().trans(url);
            }else if(l.equals("x")){
                new PlayMusic().laughter(url);
            }else{
                new PlayMusic().random(url);
            }
            l=sc.nextLine();
        }
    }
}
