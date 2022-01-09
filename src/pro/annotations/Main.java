package pro.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TestAnnotation obj = new TestAnnotation();

        final Class<?> cls = TestAnnotation.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTestAnnotation.class)) {
                try {
                    MyTestAnnotation annotation = method.getAnnotation(MyTestAnnotation.class);
                    method.invoke(obj, annotation.param1(), annotation.param2());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
