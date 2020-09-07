import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw_day2_task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] c = reader.readLine().toCharArray();
        System.out.println((int)(Integer.valueOf(String.valueOf(c[0]))+Integer.valueOf(String.valueOf(c[1]))+Integer.valueOf(String.valueOf(c[2]))));
    }
}
