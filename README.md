void main() {
    int a = 5;
    int b = 2;
    double c = a / b; // 2.5 (2.0) cast 연산자
    double d = (double) a / b; // 2.5 (2.0) cast 연산자

    System.out.printf("a = %,d b = %,d c = %,d d = %,d \n", a, b, c, d);
}

void main() {
    int max = Integer.MAX_VALUE;

    long a = max + 1;   // Overflow
    long d = max + 1L;  // long형 연산

    System.out.printf("max = %,d,a = %,d, b = %,d\n", max, a);
}

void main() {
    double pi = Math.PI;
    double a = (int) pi;
    double b = (float) pi;

    System.out.printf("pi = %,.16f, a = %,.16f b = %,.16f\n", pi, a, b);
}

void main() {
    double x = 0.1;
    double y = x + x + x + x + x + x + x + x + x + x;

    System.out.println(y);
    System.out.printf("x = %.3f, y = %.3f\n", x, y);
}

void main() {
    char test = 'A';
    int result = test + 1;

    System.out.printf("test = %c(%d), result = %c(%d)\n", test, (int) test, (char) result, result);
}

void main() {
    long a = 3000000000L;
    long b = 4000000000L;

    long c = a * b;
     System.out.printf("a = %,d, d = %,d, c = %,d\n", a, b, c);

     BigInteger a1 = BigInteger.valueOf(a);
     BigInteger b1 = BigInteger.valueOf(b);
     BigInteger c1 = a1.multiply(b1);

    System.out.printf("a = %,d, d = %,d, c = %,d\n", a1, b1, c1);
}

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

void main() {
    Scanner keyboard = new Scanner(System.in);
    float exchange;
    int money;
    double dollar;

    System.out.print("달러에 대한 원화 환율을 입력 : ");
    exchange = keyboard.nextFloat();
    System.out.print("원화 금액을 입력 : ");
    money = keyboard.nextInt();

    dollar = money / exchange;

    System.out.printf("원화(\u20a9) %,d원은 %,.2f 달러(\u0024) 입니다.\n", money, dollar);
}

void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int height;
    double area;

    System.out.print("삼각형의 및변은 ? ");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = (base * height) / 2.0;

    System.out.printf("\n\t**** 삼각형 높이 구하기 ****\n");
    System.out.printf("\t\t밑변 : %d Cm\n", base);
    System.out.printf("\t\t높이 : %d Cm\n", height);
    System.out.printf("\n\t\t 넓이 : %.2f \u33a0\n", area);
}

void main() {
    Scanner keyboard = new Scanner(System.in);
    int second;
    int day;
    int hour;
    int minute;
    int result;

    System.out.print("원하는 시간을 초단위로 입력");
    second = keyboard.nextInt();

    minute = second / 60;
    result = second - (minute * 60);
    hour = minute / 60;
    minute = minute - (hour * 60);
    day = hour / 24;
    hour -= (day * 24);

    System.out.printf("\n%,d초는 %d일 %d시간 %d분 %d초\n", second, day, hour, minute, result);
}
