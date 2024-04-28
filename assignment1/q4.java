import java.io.*;
import java.util.*;


public class q4 {
    public static void main(String[] args) {

        try (FileReader f = new FileReader("instructor.txt")) {
            BufferedReader bf = new BufferedReader(f);
            bf.readLine();
            while(bf.ready())
            {
                String s = bf.readLine();
                if(s.split(" ")[2].equals("Comp.Sci.,") && Integer.valueOf(s.split(" ")[3])>70000)
                {
                    System.out.println(s.split(" ")[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
