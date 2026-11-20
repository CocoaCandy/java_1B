void main() {
    String title1 = "어서와 JAVA는 처음이지?";
    String author1 = "천인국";
    int pages1 = 230;
    float prices1 = 23000;

    String title2 = "쉽게 배우는 자료구조";
    String author2 = "문병로";
    int pages2 = 330;
    float prices2 = 32000;
    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            title1, author1, pages1, prices1);
    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            title2, author2, pages2, prices2);


}
