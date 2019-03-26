package pl.sdacademy.designpatterns.template;

public class TemplateDemo {

    public static void main(final String[] args) {
        PerformanceTestTemplate testTemplate = new StringConcatTestTemplate();

        testTemplate.run();

        testTemplate = new ListSortingPerformanceTest();
        testTemplate.run();
    }
}
