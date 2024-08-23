package java_test;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                break; // n이 양수일 경우 반복 종료
            } else {
                System.out.println("X"); // 양의 정수가 아닐 경우 "X" 출력
            }
        }
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
        scanner.close();
    }

}
