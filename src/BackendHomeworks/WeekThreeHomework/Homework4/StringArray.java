package BackendHomeworks.WeekThreeHomework.Homework4;

import java.util.Random;
import java.util.Scanner;

public class StringArray {
    Scanner input ;
    Random random ;

    public StringArray() {
        this.input = new Scanner(System.in);
        this.random = new Random();
    }

    public void createString(){
        String[] strings = createStringArray();
        String resultString = "";
        for (int i = 0; i < strings.length; i++) {

            resultString +=strings[i];
            resultString +=" ";

        }
        System.out.println("result string  : " +resultString);
    }
    public String[] createStringArray(){
        System.out.println("please enter the n number");
        int n = Integer.parseInt(input.next());
        String[] strArray= new String[n];
        for (int i = 0; i < strArray.length; i++) {
            int randomLength = random.nextInt(15);
            strArray[i]= createStringElement(randomLength);

        }

        return strArray;
    }
    public String createStringElement(int randomLength){
        String str ="";
        for (int i = 0; i < randomLength; i++) {
            int randomNumber = random.nextInt(122-97)+97;
            char ch = (char) randomNumber;
            str +=ch;
        }
        return str;
    }
}
