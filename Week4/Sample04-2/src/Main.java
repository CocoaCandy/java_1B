void main() {
    int max = Integer.MAX_VALUE;

    long a = max + 1;   // Overflow
    long d = max + 1L;  // long형 연산

    System.out.printf("max = %,d,a = %,d, b = %,d\n", max, a);
}