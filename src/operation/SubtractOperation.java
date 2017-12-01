package operation;

public class SubtractOperation extends Operation<Integer> {

    public SubtractOperation(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    protected Integer perform() {
        return a - b;
    }
}