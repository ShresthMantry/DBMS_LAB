import java.io.*;
import java.util.*;

public class q1 {
    public static void main(String[] args) {

        try (FileReader f = new FileReader("instructor.txt")) {
            BufferedReader bf = new BufferedReader(f);
            System.out.println(bf.readLine());
            while(bf.ready())
            {
                String s = bf.readLine();
                System.out.println(s.split(" ")[1]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
