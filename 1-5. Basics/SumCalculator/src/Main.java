public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(25.5);
        simpleCalculator.setSecondNumber(31.2);

        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());
        System.out.println("multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide = " + simpleCalculator.getDivisionResult());
    }
}
