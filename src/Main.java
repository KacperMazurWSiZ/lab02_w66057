import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // ZADANIE 1
//        int[] randomNumbersArray = new int[10];
//        getRandomNumber(randomNumbersArray);
//        displaySumAndAvgFromRandomNumbersArray(randomNumbersArray);

        // ZADANIE 2

//        displayValueFromArrays();

        // ZADANIE 3
//        changeToUppercase();

        //ZADANIE 4
        //ZADANIE 5
        //ZADANIE 6
        //ZADANIE 7




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
}