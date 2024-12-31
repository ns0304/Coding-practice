import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a * 60 + b + c; //오븐구이가 끝나고 나서의 총 시간을 분으로 환산
        int hour = (total/60) % 24; // 시 계산
        int minute = total % 60;
        System.out.println(hour + " " + minute);
        sc.close();
    }
}