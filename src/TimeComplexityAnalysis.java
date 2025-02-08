public class TimeComplexityAnalysis {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            int result = i;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Execution time: " + totalTime + " milliseconds");
    }
}
