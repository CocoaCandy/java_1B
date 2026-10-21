void main() {
    Scanner keyboard = new Scanner(System.in);
    final float DON = 3.75f;
    final int GOLD = 91000;
    float weight;
    float don;

    System.out.print("당신의 체중은?");
    weight = keyboard.nextFloat();

    /*
    int intweight = (int) weight;
    float remainder = weight - intweight;
    int gram1 = (int) (intweight * 1000 + remainder * 1000);
    */

    int gram = (int) (weight * 1000);
    don = gram / DON;
    long price = (long) (don * GOLD);
    price /= 1000;
    price *= 1000;

    System.out.printf("%.2f kg -> %,d g\n", weight, gram);
    System.out.printf("%.2f kg -> %,2f 돈\n", weight, don);
    System.out.printf("%.2f kg -> %,.0fd 원\n", weight, price);
}
