import java.util.InputMismatchException;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while (true) {
            Double first_number;
            Double second_number;

            try {
                System.out.print("첫 번째 숫자 입력 : ");
                first_number = sc.nextDouble();

                System.out.print("두 번째 숫자 입력: ");
                second_number = sc.nextDouble();

                System.out.print("연산자를 입력하세요(+, -, *, /) : ");
                String input = sc.next();
                char operator = input.charAt(0);

                double calculate = calculator.calculate(first_number, second_number, operator);
                System.out.println(first_number  +""+ operator + second_number + "=" + calculate);
                System.out.println("저장된 결과 목록: " +calculator.getList());

                System.out.print("리스트 중 하나를 삭제하시겠습니까? (삭제하려면 y 입력) : ");
                String delete_select = sc.next();
                if(delete_select.equals("y")) {
                    System.out.print("리스트에서 삭제하실 인덱스를 입력해주세요: ");
                    int select_number = sc.nextInt();
                    calculator.removeResult(select_number);
                    System.out.println("현재 리스트: " + calculator.getList());
                }

                System.out.print("더 계산하시겠습니까? 더 계산하시려면 아무 키나 눌러주세요(exit 입력 시 종료) : ");
                String exit = sc.next();

                if(exit.equals("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자를 올바르게 입력하세요.");
            } catch (InputMismatchException e) {
                System.out.println("입력 형식이 올바르지 않습니다.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
