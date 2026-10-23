void main() {
    Scanner keyboard = new Scanner(System.in);
    int num;
    String result;
    String result1;
    char result2;
    String result2_1;
    String result3;
    String result4;
    char result5;

    System.out.print("양의 정수를 입력");
    num = keyboard.nextInt();

    if (num % 2 == 0) {
        result = String.format("%d는 짝수입니다.\n", num);
        result1 = "짝";
        result2 = '짝';
    } else {
        result = String.format("%d는 홀수입니다.\n", num);
        result1 = "홀";
        result2 = '홀';
    }

    switch (num % 2) {
        case 1 :
            result2_1 = "짝";
            break;
        default:
            result2_1 = "";
            break;
        case 0 :
            result2_1 = "홀";
            break;

    }

    switch (num % 2) {
        case 1 :
            result2_1 = "짝";
            break;
        default:
            result2_1 = "";
            break;
        case 0 :
            result2_1 = "홀";
            break;

    }

    result3 = (num % 2 == 0) ? String.format("%d는 짝수입니다.", num) :
            String.format("%d는 홀수입니다.", num);
    result4 = (num % 2 == 0) ? "짝" : "홀";
    result5 = (num % 2 == 0) ? '짝' : '홀';

    System.out.println(result);
    System.out.printf("%d는 %s수 입니다.\n", num, result1);
    System.out.printf("%d는 %s수 입니다.\n", num, result2);
    System.out.println(result2_1);

    System.out.println(result3);

}








void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.printf("분자 입력");
    num1 = keyboard.nextInt();
    System.out.printf("분모 입력");
    num2 = keyboard.nextInt();

    result = (float) num1 / num2;

    if (num2 == 0) {
        message = ("계산 불가");
    } else {
        message = String.format("%d / %d = %.2f\n", num1, num2, result);
    }

    System.out.println(message);
}












void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String result;

    System.out.printf("정수 입력 : ");
    score = keyboard.nextInt();

    /*****      program 1          ****/


    if (score >= 90) {
        result = "A학점 취득 성공";
    } else {
        result = "A학점 취득 실패";
    }
    result += "\n감사합니다.";

    if (!(score >= 0 && score <= 100))
        result = "ERROR : 점수는 0 ~ 100 사이";

    System.out.println(result);

    /*****      program 2          ****/

    if (!(score >= 0 && score <= 100)) {
        if (score >= 90) {
            result = "A학점 취득 성공";
        } else {
            result = "A학점 취득 실패";
        }
        result += "\n감사합니다.";
    } else {
        result = "ERROR : 점수는 0 ~ 100 사이";
    }

    System.out.println(result);

    /*****      program 3          ****/

    if (!(score >= 0 && score <= 100)) {
        switch (score / 90) {
            case 0:
                result = "A학점 취득 실패";
                break;
            case 1:
                result = "A학점 취득 성공";
                break;
        }
        result += "\n감사합니다.";
    } else {
        result = "ERROR : 점수는 0 ~ 100 사이";
    }

    System.out.println(result);
}























void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2, num3;
    int result;

    System.out.print("정수 3개를 입력 : ");
    num1 = keyboard.nextInt();
    num2 = keyboard.nextInt();
    num3 = keyboard.nextInt();

    if (num1 > num2) {
        if (num1 > num3) {
            result = num1;
        } else {
            result = num3;
        }
    } else if (num2 > num3) {
        result = num2;
    } else {
        result = num3;
    }

    System.out.printf("%d, %d, %d 중에서 가장 큰 수는 %d 입니다.\n", num1, num2, num3, result);
}





















void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;
    String message;

    System.out.print("당신의 급여액 입력 : ");
    salary  = keyboard.nextInt();

    if (salary >= 0 && salary <= 30000000) {
        if (salary < 2000000) {
            tax = 0;
        } else if (salary <= 4000000){
            tax = (int) ((salary - 2000000) * (10.0f / 100));
        } else if (salary <= 6000000) {
            tax = (int) ((salary - 2000000) * (8.0f / 100));
        } else if (salary <= 20000000) {
            tax = (int) ((salary - 2000000) * (6.0f / 100));
        } else {
            tax = (int) ((salary - 2000000) * (5.0f / 100));
        }
        message = String.format("급여액 %,d원의 세금은 %,d 원 입니다.", salary, tax);
    } else {
        message = "ERROR : 급여액은 0 ~ 30,000,000 사이임";
    }
}

















void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1, man2;
    String man1result, man2result;
    String result;


    System.out.print("첫번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3): ");
    man1 = keyboard.nextInt();
    System.out.print("두번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3): ");
    man2 = keyboard.nextInt();

    if (man1 >= 1 && man1 <=3) {
        man1result = "가위";
    } else if (man1 == 2) {
        man1result = "바위";
    } else if (man1 == 3){
        man1result = "보";
    } else {
        man1result = "";
    }

    if (man2 >= 1 && man2 <=3) {
        man2result = "가위";
    } else if (man2 == 2) {
        man2result = "바위";
    } else if (man2 == 3){
        man2result = "보";
    } else {
        man2result = "";
    }

    if (!(man1result.equals("") || man2result.isEmpty())) {
        switch (man1 - man2) {
            case 0:
                result = String.format("man1(%s)과 man2(%s)는 비겼습니다.", man1result, man2result);
                break;
            case -1:
            case 2:
                result = String.format("man1(%s)과 man2(%s)는 man2이 승리.", man1result, man2result);
                break;
            case 1:
            case -1:
                result = String.format("man1(%s)과 man2(%s)는 man1이 승리.", man1result, man2result);
                break;
            default:
                result = "ERROR2";
        }
    } else {
        result = "ERROR1";
    }
    System.out.println(result);
}


