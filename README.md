void main() {
    Scanner keyboard = new Scanner(System.in);
    int width; // 가로 길이
    int height; // 세로길이
    char type; // 사각형의 type(정, 직 사각형)
    int area; // 면적

    System.out.print("사각형의 가로 길이 입력(예 5) : ");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력(예 5) : ");
    height = keyboard.nextInt();

    type = (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("**** %c사각형 넓이 ******\n", type);
    System.out.printf("\t가로 길이 : %,d Cm\n", width);
    System.out.printf("\t세로 길이 : %,d Cm\n", height);
    System.out.printf("\t넓    이 : %,d Cm\n", area);

}








void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;    // 구입 가격
    char grade; // 회원 등급

    double discount;

    String gradeTemp;
    int discountRate;

    System.out.print("구입 가격 입력 : ");
    price = keyboard.nextInt();
    System.out.print("회원 등급 입력 (VIP, GOLD, SILVER, NONE) 예) V or v");
    grade = keyboard.next().charAt(0);

    gradeTemp = grade == 'V' ? "VIP" : (grade == 'G' ? "GOLD" : (grade == 'S' ? "SILVER" : "NONE"));
    discountRate = grade == 'V' ? 20 : (grade == 'G' ? 15 : (grade == 'S' ? 10 : 0));

    discount = price - price * ((double) discountRate/ 100);

    System.out.printf("회원 등급 : %s (%d %% 할인)\n", gradeTemp, discountRate);
    System.out.printf("구입 가격 : %,d 원\n", price);
    System.out.printf("구입 가격 : %,d 원\n", (int) discount);
    String result = price >= 100000 ? String.format("추가 할인 : %,d 원", (int) (discount -  (price * (price * (10.0 / 100))))) : "추가 할인 없음";
    System.out.print(result);
}








void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;

    System.out.print("사과 구입 갯수 : ");
    apple = keyboard.nextInt();
    System.out.print("배 구입 갯수 : ");
    pear = keyboard.nextInt();
    System.out.print("지불금액 입력");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;

    String result = payment >= price ? String.format("거스름돈 : %,d 원", payment - price) : "금액이 부족합니다";

    System.out.printf("구입 금액 : %,d 원\n", price);
    System.out.printf("지불 금액 : %,d 원\n", payment);
    System.out.println(result);
}










void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print("당신의 나이 ? ");
    age = keyboard.nextInt();

    boolean flag = (age >= 0 && age < 120) ? true : false;
    int charge = (age <= 7 || age >= 65) ? 0 : 5000;

    String result = flag == true ? String.format("나이 : %,d 살, 요금 : %,d 원", age, charge) : "Date(나이) 입력 오류";

    System.out.println(result);
}











