void main() { final int START = 1; final int TARGET = 100000000; int total = 0; int today = 1;

    for (int i = START; true; i *= 2) {
        total += i;

        System.out.printf("오늘의 저축 금액 = %,9d 원, %3d 일 = %,11d 원\n", i, today,total);
        today++;
        if (total >= TARGET)
            break;
    }
}