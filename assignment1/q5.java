import java.io.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) {

        try (FileReader f = new FileReader("department.txt")) {
            BufferedReader bf = new BufferedReader(f);
            bf.readLine();
            while(bf.ready())
            {
                String s = bf.readLine();
                System.out.println(s.split(" ")[0]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}