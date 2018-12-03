package co.thebeat.ExerciseL;

public class DummyClass1 {

    public int divide(int a, int b) throws ZeroDividerArgumentException, BothArgumentsZeroException {

        if(a==0 && b==0) {
            throw new BothArgumentsZeroException();
        }

        if(b==0) {
            throw new ZeroDividerArgumentException("Divider is Zero");
        }


        return a/b;
    }

    public int divide2(int a, int b) {

        if(a==0) {
            throw new MyRuntimeException();
        }

        return a/b;
    }
}
