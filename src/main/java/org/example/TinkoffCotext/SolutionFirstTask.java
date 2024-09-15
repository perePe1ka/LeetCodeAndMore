package org.example.TinkoffCotext;

public class SolutionFirstTask {
    public int trafficCost(int a, int b, int c, int d) {
        if (d < b) {
            return a;
        } else {
            return a + c * (d-b);
        }
    }
}