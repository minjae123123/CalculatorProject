
public enum OperatorType {
    ADD('+') {
        @Override
        public int calculation(int a, int b) {
            return a+b;
        }
    },
    SUB('-') {
        @Override
        public int calculation(int a, int b) {
            return a-b;
        }
    },
    MUL('*') {
        @Override
        public int calculation(int a, int b) {
            return a*b;
        }
    },
    DIV('/') {
        @Override
        public int calculation(int a, int b) {
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

    public abstract int calculation(int a, int b);

    public static OperatorType fromChar(char symbol) {
        for (OperatorType operatorType :OperatorType.values()) {
            if(operatorType.getSymbol() == symbol) {
                return operatorType;
            }
        }
        throw new IllegalStateException("지원하지 않는 연산자입니다");
    }

}