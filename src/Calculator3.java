import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("첫 번째 숫자 입력: ");
                int first_input = sc.nextInt();

                System.out.println("두 번째 숫자 입력: ");
                int second_input = sc.nextInt();

                System.out.println("연산자를 입력하세요(+, -, *, /) : ");
                String input = sc.next();

                if(input.equals("exit")) {
                    System.out.println("계산기를 종료합니다!");
                    break;
                }

                char operator = input.charAt(0);
            } catch (InputMismatchException e) {

            }
        }
    }
}
