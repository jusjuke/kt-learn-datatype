package kr.co.webmill.javacode;

public class Vacation {
    public String isVacationTime(boolean isVacation){
        return isVacation ? "I m on kr.co.webmill.kr.co.webmill.javacode.Vacation" : "I m working";
    }

    public void printNumber(int[] numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
