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