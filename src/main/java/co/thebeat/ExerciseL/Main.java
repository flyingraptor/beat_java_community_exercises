package co.thebeat.ExerciseL;

public class Main {

    public static void main(String[] args) {

        DummyClass1 dc1 = new DummyClass1();
        try {
            int result = dc1.divide(4, 1);
            System.out.println(result);
        } catch (ZeroDividerArgumentException ex) {
            System.out.println(ex.getErrorMessage());
            return;
        } catch (BothArgumentsZeroException e) {
            e.printStackTrace();
        } finally {
            System.out.println("I m always executed!");
        }

        dc1.divide2(0,3);
    }
}
