package co.thebeat.ExerciseO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        String[] names = {"Nikos", "Galateia", "Lydia", "Marina", "Antonis", "Karaman", "Constantako", "Electra", "Stefanos"};

        // names[10] = "Haris";    DOESN'T WORK!

        for (int i = 0 ; i < names.length ; i++ ) {
            if (names[i].equals("Karaman")) {
                System.out.println(i+1);
            }
        }

        System.out.println();
        System.out.println();

        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0 ; i < names.length ; i++) {
            nameList.add(names[i]);
        }

        nameList.add("Haris");

        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }

        if (nameList.contains("Galateia")) {
            System.out.println("Galateia is always in the class! (lie)");
        }
        System.out.println();
        int karamanChair = nameList.indexOf("Karaman") + 1;
        System.out.println("Karaman is sitting at the chair number: " + karamanChair);

        nameList.remove("Nikos");
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }
        System.out.println();
        nameList.add(3, "Nikos");
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }
        System.out.println();
        int karamanSeat = nameList.indexOf("Karaman");
        nameList.remove("Karaman");
        nameList.add(karamanSeat, "Nikos");
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }
        System.out.println();
        int nikosChair = nameList.lastIndexOf("Nikos") + 1;
        System.out.println("Nikos is sitting at the chair number: " + nikosChair);

        nameList.add("Nikos");
        nameList.add("Maria");

        List<Integer> seatList = new ArrayList<>();

        for (int i = 0; i < nameList.size() ; i++) {
            if (nameList.get(i).equals("Nikos")) {
                seatList.add(i+1);
            }
        }

        System.out.println();
        int karamanWasSittingAt = seatList.get(1) - 1;

        System.out.println();
        nameList.set(karamanWasSittingAt, "Karaman");
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }

        System.out.println(nameList.indexOf("Garyfallia"));

        for (int i = 1 ; i <= 3 ; i++) {
            System.out.println(nameList.get(i));
        }

        nameList.add(5, null);
        System.out.println();
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }

        nameList.clear();
        System.out.println();
        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }

        nameList.remove("Antonis");
    }

}
