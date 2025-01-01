import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //변수 n은 배열에 들어가는 숫자의 갯수
        
        int arr[] = new int[n];//배열 arr생성, n의 값만큼 배열의 크기 결정 
        for(int i = 0; i < n; i++){//for문을 통해 arr
            arr[i] = sc.nextInt();            
        }
        int v = sc.nextInt(); //배열 안의 숫자중에서 얼마나 들어있는지 갯수를 구하고 싶은 변수
        int count = 0;
        for(int i = 0; i < n; i++){
            if(v == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}