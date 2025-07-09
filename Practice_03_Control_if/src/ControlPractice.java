import java.util.Scanner;

public class ControlPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ControlPractice cp = new ControlPractice();

        cp.practice8();
    }

    private void practice1() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        if (integer > 0) {
            System.out.println("양수다");
        } else {
            System.out.println("양수가 아니다");
        }
    }

    private void practice2() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        if (integer > 0) {
            System.out.println("양수다");
        } else if (integer == 0) {
            System.out.println("0이다");
        } else {
            System.out.println("음수다");
        }
    }

    private void practice3() {
        System.out.print("정수 : ");
        int integer = sc.nextInt();

        if (integer % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
    }

    private void practice4() {
        System.out.print("숫자를 한 개 입력하세요 : ");
        int integer = sc.nextInt();

        if (integer <= 0) {
            System.out.println("양수만 입력해주세요.");
            return;
        }

        if (integer % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
    }

    private void practice5() {
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String str = sc.next();

        if (str.charAt(7) == '1' || str.charAt(7) == '3') {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }
    }

    private void practice6() {
        System.out.print("나이 : ");
        int age = sc.nextInt();

        if (age <= 13) {
            System.out.println("어린이");
            return;
        }
        if (age <= 19) {
            System.out.println("청소년");
            return;
        }
        System.out.println("성인");
    }

    private void practice7() {

        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pw = sc.next();

        if (!id.equals("test")) {
            System.out.println("아이디가 틀렸습니다.");
            return;
        }
        if (!pw.equals("1212")) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        System.out.println("로그인 성공");
    }

    private void practice8() {
        System.out.print("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 입력 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }

    }
}
