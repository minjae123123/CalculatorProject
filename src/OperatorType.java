
public enum OperatorType {
    ADD('+') {
        @Override
        public double calculation(double a, double b) {
            return a+b;
        }
    },
    SUB('-') {
        @Override
        public double calculation(double a, double b) {
            return a-b;
        }
    },
    MUL('*') {
        @Override
        public double calculation(double a, double b) {
            return a*b;
        }
    },
    DIV('/') {
        @Override
        public double calculation(double a, double b) {
            return a/b;
        }
    };

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract double calculation(double a, double b);

    public static OperatorType fromChar(char symbol) {
        for (OperatorType operatorType :OperatorType.values()) {
            if(operatorType.getSymbol() == symbol) {
                return operatorType;
            }
        }
        throw new IllegalStateException("지원하지 않는 연산자입니다");
    }

}