import java.util.Scanner;

public class LoopPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoopPractice lp = new LoopPractice();

        lp.practice9();
    }

    private void practice1() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }

    private void practice2() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void practice3() {
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            if (i == num) {
                System.out.print(i);
                break;
            }
            System.out.print(i + " + ");
        }
        System.out.println(" = " + sum);
    }

    private void practice4() {
        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        if (num1 < 1 || num2 < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }

        for (int i = num1 < num2 ? num1 : num2; i <= (num1 < num2 ? num2 : num1); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void practice5() {
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        System.out.println("===== " + num + "단 =====");
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    private void practice6() {
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        if (num > 9) {
            System.out.println("9 이하의 숫자만 입력해주세요.");
            return;
        }
        for (int i = num; i < 10; i++) {
            System.out.println("===== " + i + "단 =====");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    private void practice7() {
        System.out.print("시작 숫자 : ");
        int startNum = sc.nextInt();
        System.out.print("공차 : ");
        int diffNum = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(startNum + i * diffNum + " ");
        }
    }

    private void practice8() {
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void practice9() {
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
