import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int first_number;
            int second_number;

            try {
                System.out.print("첫 번째 숫자 입력 (종료하려면 exit): ");
                String first_Input = sc.nextLine();

                if (first_Input.equalsIgnoreCase("exit")) {
                    System.out.println("계산기를 종료합니다!");
                    break;
                }

                first_number = Integer.parseInt(first_Input);

                System.out.print("두 번째 숫자 입력: ");
                String secondInput = sc.nextLine();
                second_number = Integer.parseInt(secondInput);

            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하세요.");
                continue;
            }


            System.out.print("연산자를 입력하세요(+, -, *, /) : ");
            String operator = sc.next();


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
