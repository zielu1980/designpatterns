package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {

    public abstract void testIteration();

    public abstract int getWarmupIterationNum();

    public abstract int getIterationsNum();

    public void run() {
        for (int index = 0; index < getWarmupIterationNum(); index++) {
            testIteration();
        }

        final long startTimeStamp = System.currentTimeMillis();
        for (int index = 0; index < getIterationsNum(); index++) {
            testIteration();
        }

        final long endTimeStamp = System.currentTimeMillis();
        System.out.println("Average time of an iteration: " + (endTimeStamp - startTimeStamp) / getIterationsNum() + " ms");
    }
}
