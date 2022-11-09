import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] randomNumbersArray = new int[10];
        getRandomNumber(randomNumbersArray);
        displaySumAndAvgFromRandomNumbersArray(randomNumbersArray);




    }

    public static int[] getRandomNumber(int randomNumbersArray[]) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbersArray[i] = random.nextInt(100) + 1;
        }
        return randomNumbersArray;
    }

    public static void displaySumAndAvgFromRandomNumbersArray(int randomNumbersArray[]) {
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < randomNumbersArray.length; i++) {
            sum += randomNumbersArray[i];
        }

        avg = sum / randomNumbersArray.length;

        System.out.println("Suma wynosi: " + sum);
        System.out.println("Srednia wynosi: " + avg);
    }
}