package operation;

import operation.*;

import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Operation> operations = createOperations(6, 4);
        operations.stream().map(Operation::perform).forEach(System.out::println);
    }

    private static List<Operation> createOperations(int a, int b) {
        List<Operation> operationList = new LinkedList();
        operationList.add(new AddOperation(a, b));
        operationList.add(new SubtractOperation(a, b));
        operationList.add(new MultiplyOperation(a, b));
        operationList.add(new DivideOperation(a, b));
        operationList.add(new StringOperation(String.valueOf(a), String.valueOf(b)));
        return operationList;
    }

}