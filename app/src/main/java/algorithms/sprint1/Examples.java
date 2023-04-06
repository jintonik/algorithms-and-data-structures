package algorithms.sprint1;

public class Examples {
    private static void findBestVisitor() {
        int[] visitors = {0, 2, 3, 2, 0, 4, 1, 1, 2};
        var entriesByVisitor = new int[5];
        int bestVisitor = 0;
        for (int visitor : visitors) {
            entriesByVisitor[visitor] ++;
            if (entriesByVisitor[visitor] > entriesByVisitor[bestVisitor]) {
                bestVisitor = visitor;
            }
        }
        System.out.println(bestVisitor);
    }

    private static void timer() {
        int i = 0;
        while (i < 1000000000) {
            ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println("Start.");
        timer();
        System.out.println("Stop.");
    }
}
