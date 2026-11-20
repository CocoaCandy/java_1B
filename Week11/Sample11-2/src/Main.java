//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int[] step11 = new int[]{3, 3, 3, 0};
    int[] step12 = new int[]{3, 3, 3};
    int[] step13 = new int[]{3, 3, 3};
    int[] step14 = new int[]{3, 3, 3};
    int[] step15 = new int[]{3, 3, 3};

    int[] step21 = new int[]{3, 3, 3, 0};
    int[] step22 = new int[]{3, 3, 3, 0};
    int[] step23 = new int[]{3, 3, 3, 0};
    int[] step24 = new int[]{3, 3, 3, 0};
    int[] step25 = new int[]{3, 3, 3, 0};

    int[] step31 = new int[]{3, 3, 3, 0};
    int[] step32 = new int[]{3, 3, 3, 0};
    int[] step33 = new int[]{3, 3, 3, 0};
    int[] step34 = new int[]{3, 3, 3, 0};
    int[] step35 = new int[]{3, 3, 3, 0};

    int[][] villaA = {step11, step12, step13, step13, step14, step15};
    int[][] villaB = {step21, step22, step23, step23, step24, step25};
    int[][] villaC = {step31, step32, step33, step33, step34, step35};

    int[][][] somangVilla = new int[][][] {
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {3, 3, 3, 0},
            {step11, step12, step13, step13, step14, step15},
            {step21, step22, step23, step23, step24, step25},
            {step31, step32, step33, step33, step34, step35}
    };
    int[][] stepTotal = new int[somangVilla.length][];
    stepTotal[0] = new int[villaA.length];
    stepTotal[1] = new int[villaB.length];
    stepTotal[2] = new int[villaC.length];
    int[] dongTotal = new int[somangVilla.length];
    int total = 0;

    for (int i = 0; i < somangVilla.length; i++) {
        for (int j = 0; j < somangVilla[i].length; j++) {
            for (int k =0; k < somangVilla[i][j].length - 1; k++) {
                somangVilla[i][j][3] += somangVilla[i][j][k];
                stepTotal[i][j] += somangVilla[i][j][k];
            }
        }
    }

    forg (int i = 0; i < stepTotal.length; i++)
    for (int j = 0; j < stepTotal[i].length; j++)
        dongTotal{i} += stepTotal[i][j];

    for (int i = 0; i < dongTotal.length; i++)
        total += dongTotal[i];

    for (int i = 0; i < somanVilla.length; i++) {
        System.out.printf("%d동 주민수\n", i + 1);

        for (int j = 0; j < somangVilla[i].length; j++) {
            System.out.printf("%d층 \n", j + 1);

            for (int k = 0; k < somangVilla[i][j].length)
                System.out.printf("%d호 ", k+1);
        }
        System.out.println("층별 합계 : "+ stepTotal[i][j]);
    }
    System.out.printf("%d동 주민 합계 : \n", i + 1, dongTotal);
}
System.out.println("Villa 주민 수");
}
