class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void checkNumber(int number) throws MyCustomException {
        if (number < 0) {
            throw new MyCustomException("Negative number not allowed: " + number);
        }
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(10);
            checkNumber(-5);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
