import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        Double korean = sc.nextDouble();
        System.out.print("영어 : ");
        Double english = sc.nextDouble();
        System.out.print("수학 : ");
        Double math = sc.nextDouble();
        System.out.println("총점 : " + (int)(korean + english + math));
        System.out.println("평균 : " + (int)(korean + english + math)/3);

    }
}
