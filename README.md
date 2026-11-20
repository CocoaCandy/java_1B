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









void main() {
    String[] title = new String[] {"어서와 JAVA는 처음이지?","쉽게 배우는 자료구조"};
    String[] author = new String[] {"천인국", "문병로"};
    int[] pages = new int[] {230, 330};
    float[] prices = new float[] {23000, 32000};

    for (int i = 0; i < title.length; i++)
        System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
                title[i], author[i], pages[i], prices[i]);
}









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












void main() {
    class Book {
        String title;
        String author;
        String[] book;
        int pages;
        float price;
    }
    Book book1 = new Book();
    book1.title = "어서와 JAVA는 처음이지?";
    book1.author = "천인국";
    book1.pages = 230;
    book1.prices = 23000.0f;

    Book book2 = new Book();
    book1.title = "쉽게 배우는 자료구조";
    book1.author = "윤병로";
    book1.pages = 330;
    book1.prices = 32000.0f;


    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            book1.title, book1.author, book1.book, book1.price);
    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            book2.title, book2.author, book2.book, book2.price);
}











void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;
    }

    Book[] books = new Book[]{new Book(), new Book()};
    books[0] = new Book();
    books[0].title = "어서와 JAVA는 처음이지?";
    books[0].author = "천인국";
    books[0].pages = 230;
    books[0].prices = 23000.0f;

    books[1] = new Book();
    books[1].title = "쉽게 배우는 자료구조";
    books[1].author = "윤병로";
    books[1].pages = 330;
    books[1].prices = 32000.0f;

    for (int i = 0; i < books.length; i++) {
        System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
                books[i].title, books[i].author, books[i].book, books[i].price);
    }
}












void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;



        public Book(String title, String author, int pages, float price) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.price = price;
        }
    }

    Book[] books = {
            new Book("어서와 JAVA는 처음이지?", "천인국", 230, 23000.0f),
            new Book("쉽게 배우는 자료구조", "윤병로", 330, 32000.0f)};

    for (int i = 0; i < books.length; i++) {
        System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
                books[i].title, books[i].author, books[i].book, books[i].price);
    }
}















void main() throws IOException {

    Scanner keyboard = new Scanner(System.in);
    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int useCharge;
        int tax;

        public Customer(String waterNo, String name, char type) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
        }

        public Customer(String waterNo, String name, char type, float usage) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
            this.typeName = typeName;
            this.usage = usage;
        }
    }

    Customer[] customers = new Customer[] {
            new Customer("1111", "홍길동", '1', 123.6f),
            new Customer("1211", "이대한", '3', 456.7f),
            new Customer("1311", "한민국", '5', 234.2f),
            new Customer("1411", "정동진", '4', 231.3f),
            new Customer("1511", "한겨울", '3', 454.3f),
            new Customer("1611", "경복대", '2', 676.7f),
            new Customer("1711", "박상열", '1', 324.4f),
            new Customer("1811", "이순신", '4', 324.2f),
            new Customer("1911", "이검색", '5', 213.3f),
            new Customer("2111", "고동진", '3', 123.4f)};

    int count = 0;
    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량 입력(예 12.5) : ", customers[count].name);
        customers[count].usage = keyboard.nextFloat();
        if (customers[count].usage >= 0.0f)
            count++;
        else {
            System.err.println("ERROR : 사용량은 0 ~ ");
            System.in.read();
        }
    }


    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1')
            customers[i].typeName = "가정용";
        else if (customers[i].type == '2')
            customers[i].typeName = "영업용";
        else if (customers[i].type == '3')
            customers[i].typeName = "공장용";
        else if (customers[i].type == '4')
            customers[i].typeName = "광공서";
        else if (customers[i].type == '5')
            customers[i].typeName = "군기관";
        else
            customers[i].typeName = "";
    }

    for (int i = 0; i < customers.length; i++) {
        customers[i].useCharge = 1200;
        int usage = (int)(customers[i].usage + 0.5f);

        switch (customers[i].type) {
            case '1' :
                customers[i].useCharge += usage * 40;
                break;
            case '2' :
                customers[i].useCharge += usage * 55;
                break;
            case '3' :
                customers[i].useCharge += usage * 78;
                break;
            case '4' :
                customers[i].useCharge += usage * 35;
                break;
            case '5' :
                customers[i].useCharge += usage * 20;
                break;
            default:
                customers[i].useCharge = 0;
        }
    }

    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1') {
            customers[i].tax = (int) (customers[i].useCharge * 5.0f / 100);
        } else if (customers[i].type == '2') {
            customers[i].tax = (int) (customers[i].useCharge * 3.5f / 100);
        } else if (customers[i].type == '3') {
            customers[i].tax = (int) (customers[i].useCharge * 2.5f / 100);
        } else if (customers[i].type == '4') {
            customers[i].tax = (int) (customers[i].useCharge * 1.5f / 100);
        } else if (customers[i].type == '5') {
            customers[i].tax = (int) (customers[i].useCharge * 0.0f);
        } else {
            customers[i].tax = -1;
        }
    }

    System.out.println("**************************************************");
    System.out.println("수도번호  고객명  구분  사용금액  세금  납부금액  비고");
    System.out.println("**************************************************");

    for (int i = 0; i < customers.length; i++) {
        System.out.printf(" %4s %3s %3s %,.1f %,.9d원 %.7d원 %,9d원\n",
                customers[i].waterNo, customers[i].name, customers[i].typeName, customers[i].usage,
                customers[i].useCharge, customers[i].tax,customers[i].useCharge, customers[i].tax,
                customers[i].type == '5' ? "일괄 정수" : "");
    }

    System.out.println("**************************************************");
}





























































































