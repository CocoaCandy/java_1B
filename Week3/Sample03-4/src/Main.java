
void main(String[] args) {
    // 준비물
    Scanner keyboard = new Scanner(System.in);
    int base;
    int rectagular_area;
    double radious;
    double circle_area;
    final double PI = 3.141592;
    double area;
    // 입력
    System.out.print("정사각형의 한 변의 길이 입력(예 5) : ");
    base = keyboard.nextInt();
    // 계산
    rectagular_area = base * base;
    radious = base / 2.0;
    circle_area = PI * radious * radious;
    area = rectagular_area - circle_area;

    System.out.printf("한 변의 길이가 %, d cm의 정사각형의 면적 = %, d y33Al\n", base, rectagular_area);
    System.out.printf("미 정사각형 내부 원의 반지름 : %, 2f cm, 면적 : %, 2f 33Al\n", radious, circle_area);
    System.out.printf("구하려는 면적 : %, 2f 33Al\n", area);
    }