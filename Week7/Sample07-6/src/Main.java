void main() { Scanner keyboard = new Scanner(System.in); int man1, man2; String man1result, man2result; String result;

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