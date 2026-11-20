//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int ID = 0;
    final int name = 1;
    final int base = 0;
    final int SUDANG = 1;
    final int  SALARY = 2;
    final int TAX = 3;
    finla int NET = 5;

    String[][] employees = {
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}
    };
    char[] grade = {'1', '3', '2', '4', '5', '1', '3', '2', '4', '5'};
    int[][] salary = {
            {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0},
            {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0},
            {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0}, {0, 7800, 0, 0, 0},
            {0, 7800, 0, 0, 0}
    };
    int[] MONEY = {165000, 168000, 170000, 172000, 175000};

    for (int i = 0; i < employees.length; i++) {
        if (grade[i] == '1') {
            salary[i][BASE] = MONEY[0];
        } else if  (grade[i] == '2') {
            salary[i][BASE] = MONEY[1];
        } else if  (grade[i] == '3') {
            salary[i][BASE] = MONEY[2];
        } else if  (grade[i] == '4') {
            salary[i][BASE] = MONEY[3];
        } else if  (grade[i] == '5') {
            salary[i][BASE] = MONEY[4];
        } else {
            salary[i][BASE] = 0;
        }

        for (int i = 0;  1< employees.length; i++)
            salary[i][SALARY] = salary[i][BASE] + salary[i][SUDANG];

        for(int i = 0; i < employees.length; i++) {
            int temp = salary[i][SALARY] - (int) (salary[i][SALARY] * 15.0f /100);
            if (temp < 1600000) {
                salary[i][TAX] = (int) (temp * 3.3f / 100);
            } else if (temp < 2000000) {
                salary[i][TAX] = (int) (temp * 7.5f / 100);
            } else {
                salary[i][TAX] = (int) (temp * 3.3f / 100);
            }

            fot (int i = 0; i < emplyees.length; i++)
            salary[i][NET] = salary[i][SALARY] - salary[i][TAX];

            for {int i = 0; i < employees.length; i++} {
                System.out.printf("%3s %4s %c %,10d %10d\n",  employs)
            }

}
