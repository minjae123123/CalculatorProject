import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T> {

    private List<T> results;

    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public T calculate(T first_number, T second_number, String operator) {
        int result;
        if(operator.equals(OperatorType.PLUS)) {
            System.out.println(first_number +"+" + second_number + "=" );
        }

        return first_number;
    }
}
