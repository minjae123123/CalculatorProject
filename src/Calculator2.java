import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            int first_number;
            int second_number;

            try {
                System.out.print("첫 번째 숫자 입력 : ");
                first_number = sc.nextInt();

                System.out.print("두 번째 숫자 입력: ");
                second_number = sc.nextInt();


            } catch (NumberFormatException e) {
                System.out.println("정수만 입력하세요.");
                continue;
            }

            System.out.print("연산자를 입력하세요(+, -, *, /) : ");
            String input  = sc.next();

            if(input.equals("exit")) {
                System.out.println("계산기를 종료합니다!");
                break;
            }

            char operator = input.charAt(0);

            int calculate = calculator.calculate(first_number, second_number, operator);
            System.out.println(first_number + "+" + second_number + "=" + calculate);

        }
    }

    public static class Calculator {

        private List<Integer> results;

        public Calculator() {
            this.results = new ArrayList<>();
        }

        private int calculate(int first_number, int second_number,char operator) {
            int result = 0;
        switch (operator) {
            case '+':
                result = first_number + second_number;
                break;
            case '-':
                result = first_number - second_number;
                break;
            case '*':
                result = first_number * second_number;
                break;
            case '/':
                result = first_number / second_number;
                break;
            }

            results.add(result);
            return result;
        }

        public List<Integer> getResults() {
            return results;
        }

        public void setResults(List<Integer> results) {
            this.results = results;
        }
    }
}
