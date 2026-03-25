import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    List<Integer> list;
    OperatorType operatorType;

    public ArithmeticCalculator() {
        this.list = new ArrayList<>();
    }

    public int calculate(int first_number,int second_number, char operatorType) {
        OperatorType operatorType1 = OperatorType.fromChar(operatorType);
        int calculation = operatorType1.calculation(first_number, second_number);
        return calculation;
    }
}
