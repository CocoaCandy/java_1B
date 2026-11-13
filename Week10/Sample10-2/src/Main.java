void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한민국", "이미숙", "정자바"};
    char[] attend = new char[name.length];
    int count = 0;
    float rate;

    int i = 0;
    while (i < name.length) {
        System.out.printf("%s님 출석했나요 ? (1/0)", name[i]);
        attend[i] = keyboard.nextLine().charAt(0);
        if (attend[i] != '0' && attend[i] != '1') {
            System.err.print("ERROR : 출석 입력 0, 1");
            System.in.read();
        } else {
            i++;
        }

    }
    for (i = 0; i < attend.length; i++) {
        if (attend[i] == '0')
            count++;
    }

    rate = ((float) count / attend.length) * 100.0f;

    System.out.println();
    for (i = 0; i <  name.length; i++) {
        System.out.printf("%s님 %s\n", name[i], attend[i] == '1'?"출석" : "결석");
    }
    System.out.printf("결석생 수 : %d 명\n", count);
    System.out.printf("결석율 : %.1f %%", rate);
}
