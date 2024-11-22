import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = sc.nextLine();
        //Tinh tan suat xuat hien cua cac ky tu trong chuoi
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            //Tim vi tri tuong ung cua ky tu trong bang ASCII
            int ascii = (int) inputString.charAt(i);
            //Tang gia tri tan suat
            frequentChar[ascii] += 1;
        }
        //Tim ky tu co tan suat xuat hien nhieu nhat
        int max = 0;
        char character = (char) 255; //empty character
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing character is " + character + "with a frequency of " + max);
    }
}
