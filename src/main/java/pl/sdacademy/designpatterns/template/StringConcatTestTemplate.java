package pl.sdacademy.designpatterns.template;

public class StringConcatTestTemplate extends PerformanceTestTemplate {
    @Override
    public void testIteration() {
        final String result = "abc" + "def";
        // PROBLEM : result not used -> Blackhole from JMH, java12 solves the issue
    }

    @Override
    public int getWarmupIterationNum() {
        return 3;
    }

    @Override
    public int getIterationsNum() {
        return 3;
    }
}
