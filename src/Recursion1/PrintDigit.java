package Recursion1;

public class PrintDigit {
    static void printDigit(int num){
        if(num < 1){
            return;
        }
        printDigit(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        printDigit(5);
    }
}
