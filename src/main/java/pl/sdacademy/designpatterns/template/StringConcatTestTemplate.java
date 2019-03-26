package pl.sdacademy.designpatterns.template;

import java.util.Random;

public class StringConcatTestTemplate extends PerformanceTestTemplate {
    @Override
    public void testIteration() {
        String result = "";
        for (int index = 0; index < 10000; index++) {
            result += new Random().nextInt();
        }
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
