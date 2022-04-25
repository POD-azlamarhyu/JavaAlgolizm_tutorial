import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ques2 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");

        int number1 = Integer.parseInt(param[0]);
        int number2 = Integer.parseInt(param[1]);

        int answer = number1 + number2;

        System.out.println(answer);
    }
}
