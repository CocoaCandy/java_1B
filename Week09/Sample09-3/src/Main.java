void main() throws IOException { Scanner keyboard = new Scanner(System.in); final int START = 1; final int END = 100; int total = 0; int first, last; String result; while (true); char answer;

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