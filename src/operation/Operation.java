package operation;

public abstract class Operation<T> {

    T a;
    T b;

    public Operation(T a, T b) {
        this.a = a;
        this.b = b;
    }

    abstract T perform();

}