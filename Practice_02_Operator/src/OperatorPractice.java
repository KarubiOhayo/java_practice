import java.util.Scanner;

public class OperatorPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        OperatorPractice op = new OperatorPractice();

        op.practice4();
    }

    public void practice1() {
        System.out.print("인원 수 : ");
        int people = sc.nextInt();
        System.out.print("사탕 개수 : ");
        int candies = sc.nextInt();

        System.out.println("1인당 사탕 개수 : " + candies / people);
        System.out.println("남는 사탕 개수 : " + candies % people);

    }

    public void practice2() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        System.out.println(integer > 0 ? "양수다" : "양수가 아니다");
    }

    public void practice3() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        System.out.println(integer > 0 ? "양수다" : integer == 0 ? "0이다" : "음수다");
    }

    public void practice4() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        System.out.println(integer % 2 == 0 ? "짝수다" : "홀수다");
    }
}
