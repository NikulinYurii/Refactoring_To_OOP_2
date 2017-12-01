package operation;

public class AddOperation extends Operation<Integer> {

    public AddOperation(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    protected Integer perform() {
        return a + b;
    }
}