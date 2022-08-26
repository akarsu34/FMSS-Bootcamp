package BackendHomeworks.WeekTwoHomework;


import java.util.Scanner;

public class NumberUtil {
    public static void main(String[] args) {
        stringConcat();
    }

    public static String stringConcat(){
        Scanner input = new Scanner(System.in);
        String str =  " ";
        String stringValue=" ";
        while(!str.equalsIgnoreCase("quit")){
            stringValue += str ;
            if(!stringValue.equalsIgnoreCase("  ")){
                stringValue+= "-";
            }

            System.out.println("please enter the string");
            str = input.next();

        }
        return stringValue;

    }
    public static double getDice(){
        int[] dice1 = new int[100];
        int[] dice2 = new int[100];
        int count =0;

        for (int i = 0; i < dice1.length; i++) {
            dice1[i] = (int)(Math.random()*6)+1;
            dice2[i] = (int)(Math.random()*6)+1;

            if(dice1[i] == dice2[i]){
                count++;
            }
        }
        return (double)count / dice1.length;
    }
    public static void loginControl(){
        Scanner input = new Scanner(System.in);
        String acceptUserName ="kullaniciAdi";
        int acceptUserPassword =123456;
        int count =3;
        while(count >0){
            System.out.println("please enter your user name");
            String inUserName = input.next();
            System.out.println("please enter your password");
            int inUserPassword = Integer.parseInt(input.next());
            if(inUserName.equalsIgnoreCase(acceptUserName) && inUserPassword == acceptUserPassword){
                System.out.println("giriş başarılı");
                count--;
                break;
            }else{
                count--;
                if(count == 0){
                    System.out.println("giriş başarısız. deneme hakkınız bitti.");
                }
            }
        }


    }

    public static String getDayOfWeek(int day, int month, int year) {
        int baseDay=0;
        int baseMonth=0;
        int baseYear=0;
        int resultDay = day - baseDay;
        if (resultDay < 0) {
            resultDay = (day + 30) - baseDay;
            month -= 1;
        }
        int resultMonth = month - baseMonth;
        if (resultMonth < 0) {
            resultMonth = (month + 12) - baseMonth;
            year -= 1;
        }

       int resultYear = year - baseYear;

        int dayAmount = resultDay + (resultMonth * 30) + (resultYear * 365);

        if (year % 100 !=0 && year % 4==0 || year % 400 ==0) {
            dayAmount = resultDay + (resultMonth * 30) + (resultYear * 366);
        }

        String dayName = "";
        switch (dayAmount) {
            case 0:
                dayName = "Pazar";
                break;
            case 1:
                dayName = "Pazartesi";
                break;
            case 2:
                dayName = "Sali";
                break;
            case 3:
                dayName = "Çarşamba";
                break;
            case 4:
                dayName = "Perşembe";
                break;
            case 5:
                dayName = "Cuma";
            case 6:
                dayName = "Cumartesi";
                break;

        }
        return dayName;
    }

    public static int getDayOfYear(int day, int month, int year) {
        int leap = isLeapYear(year) ? 1 : 0;
        if (!isValidDate(day, month, year)) {
            return -1;
        }
        int total = 0;
        for (int i = 1; i < month; i++) {
            if (i <= 7) {
                if (i == 2) {
                    total += 28 + leap;
                } else if (i % 2 == 0) {
                    total += 30;
                } else {
                    total += 31;
                }
            } else {
                if (i % 2 == 0) {
                    total += 31;
                } else {
                    total += 30;
                }
            }
        }
        return total += day;
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (year < 1) {
            return false;
        }
        return true;
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 != 0 && year / 4 == 0) {
            return true;
        }
        if (year % 100 == 0 && year / 400 == 0) {
            return true;
        }
        return false;
    }

    public static int factorial(int number) {
        if (number < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) { // 5
            result *= i;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }
        int temp = number;
        int total = 0;
        while (number > 0) {
            int mod = number % 10;
            total += mod * mod * mod;
            number /= 10;
        }
        if (temp == total) {
            return true;
        }
        return false;
    }

    public static int getDigitsCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int getReverse(int number) {
        int sayi = 0;
        while (number > 0) {
            int mod = number % 10;
            sayi = sayi * 10 + mod;
            number /= 10;
        }
        return sayi;
    }

    public static int pow(int a, int b) {
        int result = 1;
        if (b < 0) {
            return 1;
        }
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
