import java.util.*;


public class Q_01 {
    public static void main(String[] args) {


        int num1, num2, num3;
        int smallNum =  0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("input first number :");
        num1 = scanner.nextInt();
        System.out.print("input second number :");
        num2 = scanner.nextInt();
        System.out.print("input therd number :");
        num3 = scanner.nextInt();

        if(num1 < num2){
            if(num1 < num3){
                smallNum = num1;            }
        }else {
            if(num2 < num3){
                smallNum = num2;
            }else {
                smallNum = num3;
            }
        }

        System.out.println("Smallest number is : "+ smallNum);

    }
}