package co.thebeat.ExerciseP;

import java.lang.annotation.Annotation;

public class Main {

    @SuppressWarnings("true")
    public static void main(String... args) {
        Class aClass = A.class;
        Annotation[] annotations = aClass.getAnnotations();

        for(Annotation an : annotations) {
            MyTestAnnotation mta = (MyTestAnnotation) an;
            System.out.println(mta.toString());

        }
    }
}
