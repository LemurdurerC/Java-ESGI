import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

public class Test{
    public static void main(String[] args) throws IOException {
        Instant start = Instant.now() ;
        BufferedReader br = new BufferedReader(new FileReader("truc.txt"));
        String line;
        HashMap<String,String> map = new HashMap<>();
        Hasher t = new Hasher();
        while ((line = br.readLine()) != null) {
            String [] parts = line.split(":");
            t.setMap(parts[0],parts[1]);
    }
        System.out.println(t.getMoyenne());
        Duration duration = Duration.between(start, Instant.now());
        System.out.println(duration);
        br.close();
    }


}

