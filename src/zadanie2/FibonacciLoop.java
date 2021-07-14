package zadanie2;

public class FibonacciLoop {
    private int [] fibonacciTab;

    public FibonacciLoop() {
        fibonacciTab = new int[20];
    }
    public void FibSequenceCalculation(){
        fibonacciTab[0] = 0;
        fibonacciTab[1] = 1;

        for (int n = 2; n < fibonacciTab.length; n++) {
            fibonacciTab[n] = fibonacciTab[n-1] + fibonacciTab[n-2];
        }
    }
    public void displayFibonacciSequence(){
        for (int i = 0; i < fibonacciTab.length; i++) {
            System.out.println("f"+i+" "+fibonacciTab[i]);
        }
    }
}
