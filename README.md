void main() {
    final int SIZE = 5;
    Scanner keyboard = new Scanner(System.in);
    char answer;
    String result;

    // for 문 사용
    for (int i = 1; i <= 30; i++) { // 제어변수

        System.out.printf("%d번 학생 출석 했나요? (yes/no)", i);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s/n", i, result);
    }

    // while
    int j = 1;
    while (j <= SIZE) {
        System.out.printf("%d번 학생 출석 했나요? (yes/no)", j);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        result = (answer == 'Y' || answer == 'y') ? "출석" : "결석";

        System.out.printf("%d번 학생 -> %s/n", j++, result);
    }


    // do~while()

    int k = 1;
    do {
        System.out.printf("%d번 학생 출석 했나요? (yes/no)", k);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s/n", k++, result);
    } while (k <= SIZE);

}
















void main() {
    final int LINE = 5;
    final int STAR = 23;
    System.out.println("*+*+*+*+*+*+*+*+*+*+");
    System.out.println("*+*+*+*+*+*+*+*+*+*+");
    System.out.println("*+*+*+*+*+*+*+*+*+*+");
    System.out.println("*+*+*+*+*+*+*+*+*+*+");
    System.out.println("*+*+*+*+*+*+*+*+*+*+");
    System.out.println();

    for (int i = 0; i < LINE; i++) {
        System.out.println("*+*+*+*+*+*+*+*+*+*+");
    }

    System.out.println();

    for (int i = 0; i < LINE; i++) {
        int j = 0;
        while (j < STAR) {
            System.out.print("*");
            j++;
        }
        System.out.println();
    }
}











void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;
    int first, last;
    String result;
    while (true);
    char answer;


    // **************************************

    for (int i = START; i <= END; i++) {
        total += i;
    }

    System.out.printf("%d + %d + .......+ %d + %d = %,d\n",
            START, START +1, END -1, END, total);

    // **************************************
    total = 0;
    while (true) {
        total = 0;
        System.out.println();

        System.out.print("어디서부터 시작할까요?");
        first = keyboard.nextInt();
        System.out.print("어디까지 더할까요?");
        last = keyboard.nextInt();
        if (first <= last) {
            break;
        } else {
            System.err.printf("ERROR : 시작 값 (%d)는 종료 값 (%d) 보다 작거나 같아야함", first, last);
            System.in.read();
        }
    }  // break 위치가 여기로

    for (int j = first; j <= last; j++) {
        total += j;
    }
    if (first == last) {
        result = String.format("%d = %d\n", first, total);
    } else if (last - first <= 1) {
        if (last - first == 1)
            result = String.format("%d + %d = %d\n", first, last, total);
     else if (last - first ==2)
        result = String.format("%d + %d + %d = %d\n", first, first +1, last, total);
     else
        result = String.format("%d + %d + %d + %d = %d\n", first, first +1, last -1, last, total);
    } else {
        result = String.format("%d + %d + .......+ %d + %d = %,d\n",
                first, first +1, last -1, last, total);
    }

    System.out.println(result);
    System.out.print("계속할까요? (Yes/No)");
    keyboard.nextLine();
    answer = keyboard.nextLine().charAt(0);
    if (answer == 'N' || answer == 'n');
    }
}






















void main() {
    Scanner keyboard = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;

    // **************************************
    total = 0;
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0 && i % 5 != 0) {  // 3의 배수를 제외하면서 5의 배수인 경우는 더하는경우
            continue;
        }
        total += i;
    /* continue */}

    System.out.printf("%d + %d + .......+ %d + %d = %,d\n",
            START, START +1, END -1, END, total);

    // **************************************

}













void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int start;
    int last;
    int odd = 0;
    int even = 0;
    char answer;

    do {
        odd = 0;
        even = 0;

        while (true) {
            System.out.print("어디부터 더할까요?");
            start = keyboard.nextInt();
            System.out.printf("어디까지 더할까요? (최솟값 : %d)", start + 5);
            last = keyboard.nextInt();

            if (last >= start + 5)
                break;
            else {
                System.err.print("ERROR : 입력오류");
                System.in.read();
            }
        }
        for (int i = start; i <= last; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.printf("%d ~ %d까지의 합 = %.d\n", start, last, even + odd);
        System.out.printf("\t 짝수의 합 = %,d\n", even);
        System.out.printf("\t 홀수의 합 = %,d\n", odd);

        System.out.print("계속할까요? (Yes/No)");
        keyboard.nextLine();
        answer = keyboard.nextLine().charAt(0);
        if (answer == 'N' || answer == 'n');
            break;
    } while (true);
}












void main() {
    final int START = 1;
    final int TARGET = 100000000;
    int total = 0;
    int today = 1;

    for (int i = START; true; i *= 2) {
        total += i;

        System.out.printf("오늘의 저축 금액 = %,9d 원, %3d 일 = %,11d 원\n", i, today,total);
        today++;
        if (total >= TARGET)
            break;
    }
}







