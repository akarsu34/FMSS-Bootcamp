package BackendHomeworks.WeekThreeHomework.Homework3;

import java.util.Scanner;

public class DayOfWeek {
    int baseDay = 1;
    int baseMonth = 1;
    int baseYear = 1900;


    int resultDay =0;
    int resultMonth =0;
    int resultYear =0;

    public void getDayOfWeek(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day : ");
        int day = Integer.parseInt(input.next());
        System.out.println("enter the month : ");
        int month = Integer.parseInt(input.next());
        System.out.println("enter the year : ");
        int year = Integer.parseInt(input.next());

        resultDay = day - baseDay;
        if(resultDay <0){
            resultDay = (day + 30) - baseDay;
            month -=1;
        }
        resultMonth = month - baseMonth;
        if(resultMonth <0){
            resultMonth = (month + 12) - baseMonth;
            year -= 1;
        }

        resultYear = year - baseYear;

       int  dayAmount = resultDay + (resultMonth*30) + ( resultYear * 365);
        if(leapYear(year)){
            dayAmount = resultDay + (resultMonth*30) + ( resultYear * 366);
        }
        int DayAmountMod = dayAmount% 7;



        printResult(DayAmountMod);
    }

    public static void printResult(int totalDayAmountMod){

        String dayName = "";
        switch (totalDayAmountMod){
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
                dayName ="Cuma";
            case 6:
                dayName = "Cumartesi";
                break;

        }

        System.out.println("Day : " + dayName);
    }
    public static boolean leapYear (int year){
        int lastNumber1 = year %10;
        int lastNumber2 = year % 100;
        if(lastNumber1 ==0 && lastNumber2 == 0){
            if(year % 4 ==0 && year % 400 == 0){
                return true;
            }
        }
        return false;
    }
}
