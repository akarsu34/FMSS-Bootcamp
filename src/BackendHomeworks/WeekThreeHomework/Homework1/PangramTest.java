package BackendHomeworks.WeekThreeHomework.Homework1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the text");
        String str = input.nextLine().toLowerCase();



        if(isPangramEn2(str) == false){
            System.out.println("not pangram");
        }else{
            System.out.println("pangram");
        }
    }

    public static boolean isPangramTR(String str){
        if(str.length() <29){
            return false;
        }
        Set<Character> charSet =new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;

            }
            charSet.add(ch);

        }
        if(charSet.size() < 29){
            return false;
        }
        return true;
    }
    public static boolean isPangramTR2(String str){ // without HashSet()
        char[] chArray = new char[str.length()];
        int index=0;
        if(str.length()<29){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!arrayControl(chArray,ch)){

                if(ch == ' '){

                    continue;
                }

                chArray[index] = ch;
                index++;
            }
        }
        if(index<29){
//            System.out.println("index false:" + index);
            return false;
        }
//        System.out.println("index true:" + index);
        return true;

    }// without HashSet()



    public static boolean isPangramEn2(String str){ // without HashSet()
        char[] chArray = new char[str.length()];

        int index =0;
        if(str.length()<26){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!arrayControl(chArray,ch)){

                if(ch == ' '){

                    continue;
                }

                chArray[index] = ch;
                index++;
            }
        }
        if(index<26){
//            System.out.println("index false:" + index);
            return false;
        }
//        System.out.println("index true:" + index);
        return true;

    }// without HashSet()

    public static boolean isPangramEn(String str){
        if(str.length() <26){
            return false;
        }
        Set<Character> charSet =new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;

            }
            charSet.add(ch);

        }
        if(charSet.size() < 26){
            return false;
        }
        return true;
    }

    public static boolean arrayControl(char[] chArray ,char ch){
        boolean isTrue= false;
        for (int i = 0; i < chArray.length; i++) {
            if(ch == chArray[i]){
                isTrue = true;
                return isTrue;
            }
        }
        return isTrue;
    }
}
