package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortingPerformanceTest extends PerformanceTestTemplate {

    private static final int LIST_LENGTH = 10000;

    public static List<Integer> createList() {
        final List<Integer> values = new ArrayList<>();
        final Random random = new Random();
        for (int index = 0; index < LIST_LENGTH; index++) {
            values.add(random.nextInt());
        }
        return values;
    }


    @Override
    public void testIteration() {
        final List<Integer> toSort = createList();
        toSort.sort(Comparator.naturalOrder());
    }

    @Override
    public int getWarmupIterationNum() {
        return 3;
    }

    @Override
    public int getIterationsNum() {
        return 100;
    }
}
