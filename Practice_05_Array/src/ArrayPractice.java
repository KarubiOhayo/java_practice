import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        ArrayPractice ap = new ArrayPractice();

        ap.practice10();
    }

    private void practice1() {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }
        //System.out.println(Arrays.toString(nums));
    }

    private void practice2() {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums.length - i;
            System.out.print(nums[i] + " ");
        }
    }

    private void practice3() {
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    private void practice4() {
        String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println(arr[1]);
    }

    private void practice5() {
        System.out.print("문자열 : ");
        String str = sc.next();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        int count = 0;

        char[] strChars = new char[str.length()];
        //char[] chars = str.toCharArray();

        System.out.print(str + "에 " + ch + "가 존제하는 위치(인덱스) : ");
        for (int i = 0; i < str.length(); i++) {
            strChars[i] = str.charAt(i);
            if (str.charAt(i) == ch) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + ch + " 개수 : " + count);
    }

    private void practice6() {
        System.out.print("정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("총 합 : " + sum);
    }

    private void practice7() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
    }

    private void practice8() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
        System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
    }

    private void practice9() {
        int[] arr = new int[10];
        String str = "";
        int i = 0;

        while (i < arr.length) {
            int temp = rand.nextInt(10) + 1;
            if (!str.contains(temp + "")) {
                str += temp;
                arr[i] = temp;
                System.out.print(arr[i] + " ");
                i++;
            }
        }
    }

    private void practice10() {
        int[] arr = new int[6];
        String str = "";
        int i = 0;

        while (i < arr.length) {
            int temp = rand.nextInt(45) + 1;
            if (!str.contains(temp + "")) {
                str += temp;
                arr[i] = temp;
                i++;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
