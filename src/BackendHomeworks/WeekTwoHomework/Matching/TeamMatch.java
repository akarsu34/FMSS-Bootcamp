package BackendHomeworks.WeekTwoHomework.Matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TeamMatch {
    List<Integer> teamList;
    List<Integer> matchedList1; // firstly have to empty list
    List<Integer> matchedList2;// firstly have to empty list
    List<Integer> randomNumberList;
    int n;
    int randomNum1;
    int randomNum2;

    public TeamMatch( int n) {
        this.teamList = new ArrayList<>(n);
        this.matchedList1 = new ArrayList<>();
        this.matchedList2 = new ArrayList<>();
        this.randomNumberList = new ArrayList<>();
        this.n = n;

        addList(this.teamList);
    }

    public void addList(List<Integer> list){
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

    }

    public void makeRandomNumber(){
        Random random = new Random();
        randomNum1 = random.nextInt(n);
        randomNum2 = random.nextInt(n);

    }

    public void teamMatch(){
        while(matchedList1.size() < teamList.size() /2){
            makeRandomNumber();
            //boolean randomNumberControl = randomNumberControl();

           if(!randomNumberControl()){
               randomNumberList.add(randomNum1);
               randomNumberList.add(randomNum2);
                matchedListControl();
            }
        }

        printInfo();


    }

    public void matchedListControl(){
        if(!matchedList1.contains(teamList.get(randomNum1)) && !matchedList2.contains(teamList.get(randomNum2))){
            matchedList1.add(teamList.get(randomNum1));
            matchedList2.add(teamList.get(randomNum2));

        }

    }

    public boolean randomNumberControl(){
        return randomNum1 == randomNum2
                || randomNumberList.contains(randomNum1)
                || randomNumberList.contains(randomNum2)? true : false;
    }

    public void printInfo(){
        for (int i = 0; i < matchedList1.size(); i++) {

            System.out.println( i+1 +"->TeamMatched "+ matchedList1.get(i) + " - " + matchedList2.get(i));
        }
    }

}
