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

//            case 4:
//
//                break;
//
//            case 5:
//
//                break;
//
            case 6:
                int[] userDataArray = new int[5];
                setValueInArray(userDataArray);
                displayFactiorialFromUserDataArray(userDataArray);
                break;
//
//            case 7:
//
//                break;

        }

    }
    public static int getInt(){return new Scanner(System.in).nextInt();}

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

    public static void displayValueFromArrays(){
        int [] firstArray = {1,2,3,4,5,6,7,8,9};
        int [] secondaryArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Nieparzysta tablica:");

        for(int i = 0; i < firstArray.length; i++){
            if(firstArray[i]%2==0){
                System.out.println(firstArray[i]);
            }
        }

        System.out.println("Parzysta tablica:");

        for(int i = 0; i < secondaryArray.length; i++){
            if(secondaryArray[i]%2==0){
                System.out.println(secondaryArray[i]);
            }
        }
    }

    public static void changeToUppercase(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String c: cars ) {
            System.out.println(c.toUpperCase());
        }

    }

    public static int [] setValueInArray(int userDataArray[]){

        for(int i = 0; i < 5; i++){
            System.out.println("Enter value:");
            userDataArray[i] = getInt();
        }

        return userDataArray;
    }

    public static int getFactorial(int valueFromUserDataArray){
         return valueFromUserDataArray > 1 ? valueFromUserDataArray * getFactorial(valueFromUserDataArray - 1) : 1;
    }

    public static void displayFactiorialFromUserDataArray(int userDataArray[]){
        for(int i = 0; i < 5; i++){
            System.out.println(getFactorial(userDataArray[i]));
        }
    }
}