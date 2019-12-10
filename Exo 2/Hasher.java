import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Hasher{
    HashMap <String,String> map = new HashMap<>();
    ArrayList<Integer> moyenne = new ArrayList<Integer>();
    public void setMap(String one,String two){
        map.put(one,two);
        setArray(two);
    }
    public String getMap(String one){
        return map.get(one);
    }

    public void setArray(String score){
        int sc = Integer.parseInt(score);
        moyenne.add(sc);
    }

    public int getMoyenne(){
        int res=0;
        for (int i=0; i<moyenne.size(); i++){
            res = res + moyenne.get(i);
        }
        return res/moyenne.size();
    }

}