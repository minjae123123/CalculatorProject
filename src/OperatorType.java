import java.util.function.IntBinaryOperator;

public enum OperatorType {
    PLUS('+', (a,b) -> a+b)
    , MINUS('-', (a,b) -> a-b)
    , MULTIPLY('*', (a,b) ->a * b)
    , DIVIDE('/', (a,b) -> a/b);


    private final char symbol;
    private final IntBinaryOperator operation;

    OperatorType(char symbol, IntBinaryOperator operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public int apply(int a, int b) {
        return operation.applyAsInt(a, b);
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromChar(char symbol) {
        for (OperatorType operator : values()) {
            if (operator.symbol == symbol) {
                return operator;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + symbol);
    }
}