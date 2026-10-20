//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("구매 금액을 입력하세요: ");
    int price = keyboard.nextInt();

    System.out.print("멤버십 회원 여부(true/false): ");
    boolean membership = keyboard.nextBoolean();

    String result = (price < 0) ? "오류: 구매 금액이 음수입니다."
            : ((membership && price >= 30000) || (!membership && price >= 50000))
            ? "무료 배송 가능"
            : "무료 배송 불가능";

    System.out.println(result);
}
