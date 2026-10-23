void main() { Scanner keyboard = new Scanner(System.in); int num; String result; String result1; char result2; String result2_1; String result3; String result4; char result5;

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