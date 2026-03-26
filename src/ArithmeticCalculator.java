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
        list.add(calculation);
        return calculation;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
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
}
