package operation;

public class MultiplyOperation extends Operation<Integer> {

    public MultiplyOperation(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    protected Integer perform() {
        return a * b;
    }
}