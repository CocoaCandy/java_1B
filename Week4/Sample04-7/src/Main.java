void main() {
    int a; // 분자
    int b; // 분모
    Scanner keyboard = new Scanner(System.in);

    System.out.print("분자 입력 : ");
    a = keyboard.nextInt();
    System.out.print("분모 입력 : ");
    b = keyboard.nextInt();


    System.out.printf("%d를 %d로 나누면 몫 = %d, 나머지 = %d 이다.\n", a, b, a / b, a % b);
    System.out.printf("%d를 %d로 나누면 = %.2f 이다.\n", a, b, (float)a / b);
}