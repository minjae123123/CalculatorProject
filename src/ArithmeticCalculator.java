import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

    List<Double> list;

    public ArithmeticCalculator() {
        this.list = new ArrayList<>();
    }

    public double calculate(T first_number,T second_number, char operatorType) {
        double num1 = first_number.doubleValue();   //first_number,second_number를 double 타입으로 변환
        double num2 = second_number.doubleValue();
        OperatorType operatorType1 = OperatorType.fromChar(operatorType);
        double calculation = operatorType1.calculation(num1, num2);
        list.add(calculation);
        return calculation;
    }

    public List<Double> getList() {
        return list;
    }

    public void setList(List<Double> list) {
        this.list = list;
    }

    public void removeResult(int order) {
        if(list.isEmpty()) {
            System.out.println("삭제할 결과가 없습니다!");
        } else {
            list.remove(order);
            System.out.println("선택하신 결과를 삭제하였습니다!");
        }
    }

    public List<Double> getListGreaterThan(double value) {
        return list.stream()
                .filter(list -> list > value)
                .collect(Collectors.toList());
    }
}
