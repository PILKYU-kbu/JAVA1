//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("시간 입력: ");
        float inputTime = keyboard.nextFloat();

        float time = inputTime;

        int day = (int)(time / 24);
        time = time % 24;

        int hour = (int)time;
        time = (time - hour) * 60;

        int minute = (int)time;
        time = (time - minute) * 60;

        int second = (int)time;

        System.out.println(inputTime + " 시간은 " + day + "일 "
                + hour + "시간 " + minute + "분 "
                + second + "초 입니다.");
}
