import java.io.*;
import java.util.*;


public class q2 {
    public static void main(String[] args) {

        try (FileReader f = new FileReader("instructor.txt")) {
            BufferedReader bf = new BufferedReader(f);
            Set<String> set = new HashSet<String> ();
            bf.readLine();
            while(bf.ready())
            {
                String s = bf.readLine();
                set.add(s.split(" ")[2]);

            }
            System.out.println(set);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
