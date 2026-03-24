import java.util.InputMismatchException;
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

                System.out.print("연산자를 입력하세요(+, -, *, /) : ");
                String input  = sc.next();

                if(input.equals("exit")) {
                    System.out.println("계산기를 종료합니다!");
                    break;
                }

                char operator = input.charAt(0);

                int calculate = calculator.calculate(first_number, second_number, operator);
                System.out.println(first_number + "" + operator + second_number + "= "+ calculate);

                System.out.println("더 계산하시겠습니까? 더 계산하시려면 아무 키나 눌러주세요(exit 입력 시 종료) : ");
                String exit = sc.next();
                if(exit.equals("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하세요.");
                sc.nextLine();
            }
        }
    }

    public static class Calculator {

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


            return result;
        }

    }
}
