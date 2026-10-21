//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final long LIGHT = 299_792_458; // m/s (미터/초)
    final float YEAR = 365.2422f; // 1년

    float hour = YEAR * 24;
    float minute = hour * 60;
    float second = minute * 60;
    float light = second * LIGHT;

    System.out.printf("빛은 초당 %,d km 를 이동합니다. \n", LIGHT / 1000);
    System.out.printf("빛이 1년간 간 거리는 %,.0f km 입니다.\n", light / 1000);

}
