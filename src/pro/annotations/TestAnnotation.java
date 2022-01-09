package pro.annotations;

public class TestAnnotation {
    @MyTestAnnotation(param1 = 2, param2 = 5)
    public void test(int a, int b){
        System.out.println("TestResult of (a * b): " + a * b);
    }
}
