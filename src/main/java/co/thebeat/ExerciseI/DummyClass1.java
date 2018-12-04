package co.thebeat.ExerciseI;

public class DummyClass1 {

    public String[] splitString(String text, int numOfPartsToSplit) {

        int textSize = text.length();
        int partSize;

        String[] splittedParts = null;

<<<<<<< HEAD
=======
        if(numOfPartsToSplit <= 0) {
            splittedParts = new String[1];
            splittedParts[0] = text;
            return splittedParts;
        }

>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
        if (textSize % numOfPartsToSplit != 0) {
            splittedParts = new String[1];
            splittedParts[0] = text;
            return splittedParts;

        }

        splittedParts = new String[numOfPartsToSplit];

        partSize = textSize / numOfPartsToSplit;
        String partText = "";
        int partsIndex = 0;

        for (int i = 0; i < textSize; i++) {

            partText = partText + String.valueOf(text.charAt(i));

            if (partText.length() == partSize) {
                splittedParts[partsIndex] = partText;
                partsIndex++;
                partText = "";
            }

        }

        return splittedParts;
    }
<<<<<<< HEAD

=======
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
}
