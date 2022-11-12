import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select a task (0-7)");
        int temp = getInt();

        switch (temp) {

            case 1:
                int[] randomNumbersArray = new int[10];
                getRandomNumber(randomNumbersArray);
                displaySumAndAvgFromRandomNumbersArray(randomNumbersArray);
                break;

            case 2:
                displayValueFromArrays();
                break;

            case 3:
                changeToUppercase();
                break;

            case 4:
                String[] userDataArrayString = new String[5];
                setValueInArray(userDataArrayString);
                displayArray(taskfo(task4(userDataArrayString)));
                break;

            case 5:
                int[] userDataArrayInt = new int[8];
                setValueInArray(userDataArrayInt);
                bubbleSort(userDataArrayInt);
                displayArray(userDataArrayInt);
                break;

            case 6:
                int[] userDataArray = new int[5];
                setValueInArray(userDataArray);
                displayFactorialFromUserDataArray(userDataArray);
                break;

            case 7:
                String[] carsArray = {"Volvo", "BMW", "Forda", "Mazda"};
                String[] duplicateCarsArray = {"Volvo", "BMW", "Forda", "Mazda"};

                    if(isEqual(carsArray, duplicateCarsArray)){
                        System.out.println("Tablice sa takie same");
                    }
                    else {
                        System.out.println("Tablice sa rozne");
                    }
                break;
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {return new Scanner(System.in).nextLine();}
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
    public static void displayValueFromArrays() {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondaryArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Nieparzysta tablica:");

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                System.out.println(firstArray[i]);
            }
        }

        System.out.println("Parzysta tablica:");

        for (int i = 0; i < secondaryArray.length; i++) {
            if (secondaryArray[i] % 2 == 0) {
                System.out.println(secondaryArray[i]);
            }
        }
    }
    public static void changeToUppercase() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String c : cars) {
            System.out.println(c.toUpperCase());
        }

    }
    public static int[] setValueInArray(int userDataArray[]) {

        for (int i = 0; i < userDataArray.length; i++) {
            System.out.println("Enter value:");
            userDataArray[i] = getInt();
        }

        return userDataArray;
    }
    public static int getFactorial(int valueFromUserDataArray) {
        return valueFromUserDataArray > 1 ? valueFromUserDataArray * getFactorial(valueFromUserDataArray - 1) : 1;
    }
    public static void displayFactorialFromUserDataArray(int userDataArray[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getFactorial(userDataArray[i]));
        }
    }
    public static boolean isEqual(String firstArray[], String secondArray[]) {

        boolean result = false;
        int counter = 0;

        for (int i = 0; i < firstArray.length; i++){

            if(firstArray[i] == secondArray[i] && firstArray.length == secondArray.length) {
                counter++;
            }
        }

        return counter == firstArray.length ? true : false;

    }
    public static void bubbleSort(int arrayDataFromUser[]) {
        int n = arrayDataFromUser.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arrayDataFromUser[j] > arrayDataFromUser[j + 1]) {
                    int temp = arrayDataFromUser[j];
                    arrayDataFromUser[j] = arrayDataFromUser[j + 1];
                    arrayDataFromUser[j + 1] = temp;
                }
    }
    public static void displayArray(int sortedArray[]){

        for (int i : sortedArray) {
            System.out.println(i);
        }
    }

    public static String[] setValueInArray(String userDataArray[])  {

        for (int i = 0; i < userDataArray.length; i++) {
            System.out.println("Enter value:");
            userDataArray[i] = getString();
        }

        return userDataArray;
    }

    public static String[] task4(String userDataArray[]){
        String[] userDataReverse = new String[5];
        for(int i = 0; i < userDataArray.length; i++){
            userDataReverse[i] = userDataArray[userDataArray.length - i - 1];
        }

        return  userDataReverse;
    }

    public static String[] taskfo(String userDataArray[]){
        String[] userDataReverse = new String[5];
        String newWord = "";
        char wordChar;
        for(int i = 0; i < userDataArray.length; i++){

            newWord = "";

            for(int k=0; k< userDataArray[i].length(); k++){
                wordChar = userDataArray[i].charAt(k);
                newWord = wordChar + newWord;
            }
            userDataReverse[i] = newWord;
        }

        return  userDataReverse;
    }

    public static void displayArray(String userDataArray[]){
        for (String a: userDataArray
             ) {
            System.out.println(a);
        }
    }
}