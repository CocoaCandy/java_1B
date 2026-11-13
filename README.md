void main() {
    //int[] score;    // 선언
    //score = new int[5]; //정의

    int a;  // 선언 + 정의

    /*
    int[] score = new int[5]; // 선언 & 정의
    score[0] = 95;  // 배열의 원소를 구분하는 index = 0
    score[1] = 70;
    score[2] = 80;
    score[3] = 75;
    score[4] = 100;
    score[5] = 100;

    int[] score = new int[] {95, 70, 80, 75, 100};
    */

    int[] score = {95, 70, 80, 75, 100};
    int total = 0;
    float avg;

    for (int i = 0; i < score.length; i++)
        total += score[i];
    avg = (float) total / score.length;

    for (int i = 0; i < score.length; i++)
        System.out.printf("%d\n", score[i]);
    System.out.printf("총점 : %d\n", total);
    System.out.printf("평균 : %.2f\n", avg);
}















void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한민국", "이미숙", "정자바"};
    char[] attend = new char[name.length];
    int count = 0;
    float rate;
    
    int i = 0;
    while (i < name.length) {
        System.out.printf("%s님 출석했나요 ? (1/0)", name[i]);
        attend[i] = keyboard.nextLine().charAt(0);
        if (attend[i] != '0' && attend[i] != '1') {
            System.err.print("ERROR : 출석 입력 0, 1");
            System.in.read();
        } else {
            i++;
        }
        
    }
    for (i = 0; i < attend.length; i++) {
        if (attend[i] == '0')
            count++;
    }

    rate = ((float) count / attend.length) * 100.0f;

    System.out.println();
    for (i = 0; i <  name.length; i++) {
        System.out.printf("%s님 %s\n", name[i], attend[i] == '1'?"출석" : "결석");
    }
    System.out.printf("결석생 수 : %d 명\n", count);
    System.out.printf("결석율 : %.1f %%", rate);
}




















void main() {
    Scanner keyboard = new Scanner(System.in);
    String source;
    char[] reverse; // 선언



    System.out.print("영어 문장 입력 : ");
    source = keyboard.nextLine();

    reverse = new char[source.length()];
    for (int i = 0; i < source.length(); i++) {
        if (source.charAt(i) >= 'A' && source.charAt(i) <= 'Z')
            reverse[i] = (char) (source.charAt(i) + 32);
        else if (source.charAt(i) >= 'a' && source.charAt(i) <= 'z')
            reverse[i] = (char) (source.charAt(i) - 32);
        else
            reverse[i] = source.charAt(i);
    }

    System.out.printf("원본 : %s\n", source);
    System.out.printf("변경 : %s\n", new String(reverse));
}























void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    String[] name = {"홍길동", "이해인", "김명성", "경복대", "이대학", "홍길동", "이해인", "김명성", "경복대", "이대학"};
    int[] kor = {90, 87, 75, 100, 100, 90, 87, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99, 95, 90, 95, 99, 99};
    int[] eng = {90,88, 100, 100, 75, 90,88, 100, 100, 75};

    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];

    int i = 0;
    // Data

    while (i < name.length) {
        System.out.printf("%s 학생의 국어, 수학, 영어 성적 입력 : ", name[i]);
        kor[i] = keyboard.nextInt();
        math[i] = keyboard.nextInt();
        eng[i] = keyboard.nextInt();

        if ((kor[i] >= 0 && kor[i] <= 100) &&
                (math[i] >= 0 && math[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100)) {
            i++;
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100");
            System.in.read();
        }
    }




    for (i = 0; i < name.length; i++)
        sum[i] = kor[i] + math[i] + eng[i];

    // Sort

    for (i = 0; i < name.length - 1; i++) {
        for (int j = i + 1; j < name.length; j++)
            if (sum[1] < sum[j]) {
                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;

                int test = kor[i];
                kor[i] = kor[j];
                kor[j] = test;

                test = eng[i];
                eng[i] = eng[j];
                eng[j] = test;

                test = math[i];
                math[i] = math[j];
                math[j] = test;

                test = sum[i];
                sum[i] = sum[j];
                sum[j] = test;
            }

    }

    // 등수 부여
    for (i = 0; i < name.length; i++)
        avg[i] = sum[i] / 3.0f;

    //동점자 처리
    for (i = 0; i < name.length- 1; i++)
        for (int j = i + 1; j < name.length; j++)
            if (sum[i] == sum[j]) {
                rank[j] = rank[i];
            }

    System.out.println("*******************************************");
    System.out.println(" 이름  국어  수학  영어  총점    평균   등수");
    System.out.println("*******************************************");

    for (i = 0; i < name.length; i++) {
        System.out.printf("%3s %3d %4d %4d %4d %8.2f %4d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }
}

































void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    String[] name = {"홍길동", "이해인", "김명성", "경복대", "이대학", "홍길동", "이해인", "김명성", "경복대", "이대학"};
    int[] kor = {90, 87, 75, 100, 100, 90, 87, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99, 95, 90, 95, 99, 99};
    int[] eng = {90,88, 100, 100, 75, 90,88, 100, 100, 75};

    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];

    int i = 0;
    // Data 입력
    /*
    while (i < name.length) {
        System.out.printf("%s 학생의 국어, 수학, 영어 성적 입력 : ", name[i]);
        kor[i] = keyboard.nextInt();
        math[i] = keyboard.nextInt();
        eng[i] = keyboard.nextInt();

        if ((kor[i] >= 0 && kor[i] <= 100) &&
                (math[i] >= 0 && math[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100)) {
            i++;
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100");
            System.in.read();
        }
    }


    */

    for (i = 0; i < name.length; i++)
        sum[i] = kor[i] + math[i] + eng[i];

    /*
    for (i = 0; i < name.length - 1; i++) {
        for (int j = i + 1; j < name.length; j++)
            if (sum[1] < sum[j]) {
                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;

                int test = kor[i];
                kor[i] = kor[j];
                kor[j] = test;

                test = eng[i];
                eng[i] = eng[j];
                eng[j] = test;

                test = math[i];
                math[i] = math[j];
                math[j] = test;

                test = sum[i];
                sum[i] = sum[j];
                sum[j] = test;
            }

    }

    */

    for (i = 0; i < name.length; i++)
        avg[i] = sum[i] / 3.0f;

    System.out.println("*******************************************");
    System.out.println(" 이름  국어  수학  영어  총점    평균   등수");
    System.out.println("*******************************************");

    for (i = 0; i < name.length; i++) {
        System.out.printf("%3s %3d %4d %4d %4d %8.2f %4d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }
}





