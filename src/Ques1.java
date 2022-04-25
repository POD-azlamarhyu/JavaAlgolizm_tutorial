import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ques1 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");



        int number1 = Integer.parseInt(param[0]);
        String type = param[1].toString();
        int number2 = Integer.parseInt(param[2]);

        int answer;

        if (type.equals("+") == true) {
            answer = number1 + number2;
        }else if(type.equals("-") == true){
            answer = number1 - number2;
        }else if(type.equals("*") == true){
            answer = number1*number2;
        }else{
            answer = number1/number2;
        }
        System.out.println(answer);
    }
}
