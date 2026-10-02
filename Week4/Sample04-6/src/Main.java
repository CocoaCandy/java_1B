void main() {
    long a = 3000000000L;
    long b = 4000000000L;

    long c = a * b;
    System.out.printf("a = %,d, d = %,d, c = %,d\n", a, b, c);

    BigInteger a1 = BigInteger.valueOf(a);
    BigInteger b1 = BigInteger.valueOf(b);
    BigInteger c1 = a1.multiply(b1);

    System.out.printf("a = %,d, d = %,d, c = %,d\n", a1, b1, c1);
}