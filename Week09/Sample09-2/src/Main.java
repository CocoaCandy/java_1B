void main() { final int LINE = 5; final int STAR = 23; System.out.println("++++++++++"); System.out.println("++++++++++"); System.out.println("++++++++++"); System.out.println("++++++++++"); System.out.println("++++++++++"); System.out.println();

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