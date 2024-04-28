import java.io.*;
import java.util.*;

public class q6 {
    public static void main(String[] args) {

        try (FileReader f = new FileReader("department.txt")) {
            BufferedReader bf = new BufferedReader(f);
            bf.readLine();
            int max = 0;
            while(bf.ready())
            {
                String s = bf.readLine();
                if(Integer.valueOf(s.split(" ")[2])>max)
                {
                    max = Integer.valueOf(s.split(" ")[2]);
                }
            }

            try (FileReader f1 = new FileReader("department.txt")) {
            BufferedReader bf1 = new BufferedReader(f1);
            bf1.readLine();
            while(bf1.ready())
            {
                String s = bf1.readLine();
                if(Integer.valueOf(s.split(" ")[2])==max)
                {
                    System.out.println(s.split(" ")[0]);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}