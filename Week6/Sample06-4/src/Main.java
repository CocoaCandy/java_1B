//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int LIFE = 7; // 단위 분
    final int PRICE = 5000;
    int year;
    int ciga;

    System.out.print("당신은 몇년간 담배를 피웠나요?");
    year = keyboard.nextInt();
    System.out.print("하루에 몇 개피를 피우나요?");
    ciga = keyboard.nextInt();

    int day = year * 365; // 생존기간
    int count = day * ciga;
    int minute = count * LIFE;
    int hour = minute / 60;
    minute -= hour * 60 ; // minute = minute - (hour * 60);
    int day1 = hour / 24;
    hour -= (day1 * 24);
    int year1 = day1 / 365;
    day1 -= (year1 * 365);

    int gap = count / 20 + (count % 20 == 0 ? 1 : 0);
    int money = gap * PRICE;

    System.out.printf("담개 한 개피를 피우면 수명이 %d분 단축 된다고 합니다.\n",LIFE);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, %d년 %d일 %d시간 %d분 수명이 단축됩니다.\n"
            , year, ciga, year1, day1, hour, minute);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, 담배의 금액은 %,d 원 입니다.\n"
            , year, ciga, money);
}
