void main() {
	Scanner keyboard = new Scanner(System.in)
	int[] grade1 = new int[] {41, 42, 45, 42, 46, 39};
	int[] grade2 = new int[] {41, 42, 45, 42, 46, 39};
	int[] grade3 = new int[] {41, 42, 45, 42, 46, 39};
	int[] school = new int[][] {grade1, grade2, grade3};

	int[][] students = {                  // {1반, 2반, 3반, 4반, 5반, 6반, 학년학과} 
		{41, 42, 45, 42, 46, 39, 0},
		{41, 42, 45, 42, 46, 39, 0},
		{41, 42, 45, 42, 46, 39, 0}};
	int[] total = new int(students.length];
	int sum = 0;

	int grade = 0;
	for (int grade = 0; grade < students.length; grade++) {
		int ban = 0;
		while (ban < students[grade].length) {
			System.out.printf("\t %d 학년 %d반 재학생 수 입력 : ", grade + 1, ban + 1);
			students[grade][ban] > 10 && students[grade][ban] <=50)
				ban++;
			else {
				System.err.println("ERROR ");
			}
		} 
	}

	for {int i = 0; 1< students.length: i++) {
		for (int j = 0; j < students[i].length - 1; j++) {
		students[i][6] += students[i][j];
		total[i] += students[i][j];
		}
	}
	for (int i = 0; i < students.length; i++) {
		System.out.printf("%d 학년 %3d %3d %3d %3d $3d $3d %4d\n", i+1, 
			students[i][0], students[i][2], students[i][3], students[i][4], students[i][5], students[i][6],);
	}
	System.out.printf("\t\t\t\t 전교생 수 : %d\n", sum);
}











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




