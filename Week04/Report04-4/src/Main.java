//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double total;
    double price;
    double tax;

    System.out.print("판매금액을 입력하세요 : ");
    total = keyboard.nextDouble();

    price = total / 1.1;
    tax = total - price;

    System.out.printf("\n금액 : %.0f원", price);
    System.out.printf("\n세금 : %.0f원", tax);
}
