package zadanie2;

public class App {
    public static void main(String[] args) {
        FibonacciLoop fibonacciLoop = new FibonacciLoop();
        fibonacciLoop.FibSequenceCalculation();
        fibonacciLoop.displayFibonacciSequence();

        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        System.out.println(fibonacciRecursion.fib(7));
    }
}
