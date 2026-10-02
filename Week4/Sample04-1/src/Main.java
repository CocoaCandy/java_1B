void main() {
    int a = 5;
    int b = 2;
    double c = a / b; // 2.5 (2.0) cast 연산자
    double d = (double) a / b; // 2.5 (2.0) cast 연산자

    System.out.printf("a = %,d b = %,d c = %,d d = %,d \n", a, b, c, d);
}
