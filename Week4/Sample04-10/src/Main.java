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