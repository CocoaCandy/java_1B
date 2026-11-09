void main() { Scanner keyboard = new Scanner(System.in); final int START = 1; final int END = 100; int total = 0;

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