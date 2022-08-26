package BackendHomeworks.WeekThreeHomework.Homework2;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the text");
        String str = input.nextLine().toLowerCase();
        String strReverse="";
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            if(ch>=97 || ch <=122 || ch == 32){
                strReverse = strReverse + ch;
            }
        }
        System.out.println(strReverse);
        if(str.equalsIgnoreCase(strReverse)){
            System.out.println("text is palindrom");
        }else{
            System.out.println("text is not palindrom");
        }
    }
}
