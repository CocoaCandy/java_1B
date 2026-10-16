void main() { Scanner keyboard = new Scanner(System.in); int price; // 구입 가격 char grade; // 회원 등급

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