import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Ques3 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");
        double finalAnswer = 0;

        List<Double> numberList = new ArrayList<Double>();
        List<String> operandList = new ArrayList<String>();
        for(int i = 0;i < param.length;i++){
            if (param[i].equals("+") || param[i].equals("-") || param[i].equals("*") || param[i].equals("/")){
                operandList.add(param[i]);
            }else {
                numberList.add(Double.parseDouble(param[i]));
            }
        }
        int i = 0;
        while (i < operandList.size()){
            double answer = 0;
            if (operandList.get(i).equals("*") || operandList.get(i).equals("/")){
                if (operandList.get(i).equals("*")) {
                    answer = numberList.get(i) * numberList.get(i + 1);
                } else {
                    answer = numberList.get(i) / numberList.get(i + 1);
                }
                numberList.set(i, answer);
                numberList.remove(i + 1);
                operandList.remove(i);
                i--;
            }
            i++;
        }

        finalAnswer = numberList.get(0);
        for(int j = 0;j < numberList.size();j++){
            if (j != 0){
                if(operandList.get(j-1).equals("+")){
                    finalAnswer = finalAnswer + numberList.get(j);
                }else{
                    finalAnswer = finalAnswer - numberList.get(j);
                }
            }
        }
        System.out.println(finalAnswer);

    }
}
