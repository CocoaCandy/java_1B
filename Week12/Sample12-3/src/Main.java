void main() {
    final int TITLE = 0;
    final int AUTHOR = 1;

    String[][] books = new String[][]{
            {"어서와 JAVA는 처음이지?","천인국"},
            {"쉽게 배우는 자료구조", "문병로"}};
    int[] pages = new int[] {230, 330};
    float[] prices = new float[] {23000, 32000};

    for (int i = 0; i < title.length; i++)
        System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
                books[i][TITLE], books[i][AUTHOR], pages[i], prices[i]);
}
