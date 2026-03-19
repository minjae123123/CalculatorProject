import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int first_number = 0;
            int second_number = 0;
            try {
                System.out.print("첫 번째 숫자: ");
                first_number = sc.nextInt();
                System.out.print("두 번째 숫자: ");
                second_number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요");
                continue;
            }

            System.out.print("연산자를 입력하세요(+, -, *, /) : ");
            String operator = sc.next();

            if(operator.equals("exit")) {
                System.out.println("계산기 종료를 종료합니다!");
                break;
            }

            switch (operator) {
                case "+":
                    System.out.println(first_number + "+" + second_number + "=" + (first_number + second_number));
                    break;
                case "-":
                    System.out.println(first_number + "-" + second_number + "=" + (first_number - second_number));
                    break;
                case "*":
                    System.out.println(first_number + "*" + second_number + "=" + (first_number * second_number));
                    break;
                case "/":
                    System.out.println(first_number + "/" + second_number + "=" + (first_number / second_number));
                    break;
            }
        }
    }
}
