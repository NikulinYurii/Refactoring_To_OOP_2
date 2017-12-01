package operation;

public class DivideOperation extends Operation<Integer> {

    public DivideOperation(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    protected Integer perform() {
        return a / b;
    }
}