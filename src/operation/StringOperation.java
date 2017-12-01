package operation;

public class StringOperation extends Operation<String> {

    public StringOperation(String a, String b) {
        super(a, b);
    }

    @Override
    protected String perform() {
        return a + b;
    }
}