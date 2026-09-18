void main() {
/*
    long test1 = 3000000000L;
    long test2 = 4000000000L;
    long result = test1 * test2;
    // 결과값이 짤려버림
    System.out.printf("%,d * %,d = %,d\n", test1, test2, result);
*/
    byte test1 = 127;
    byte test2 = 1;
    int result = test1 + test2;

    System.out.printf("%,d + %,d = %,d\n", test1, test2, result);
/*
    short test1 = 32767;
    short test2 = 1;
    short result = (short) (test1 + test2); // 캐스트 연산자 / 강제로 결과값 도출
    // 오버플로우
    System.out.printf("%,d + %,d = %, d\n", test1, test2, result);

 */
}