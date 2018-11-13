package thebeat.co.ExerciseG;

public class DummyClass3 {

    public Double averageOfArrayElemets(Integer[] array) {
        int sum = 0;
        Double average = 0.0;

        for(int i=0; i<array.length; i++) {
            sum=sum+array[i];
        }

        average = (double) sum / array.length;

        return average;
    }

}
