//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int purchasePrice = 1015000;

    double sellingPrice = purchasePrice * 1.3;

    double salesTax = sellingPrice * 0.1;
    double purchaseTax = purchasePrice * 0.1;

    double tax = salesTax - purchaseTax;

    System.out.printf("정가 : %,.0f원%n", sellingPrice);
    System.out.printf("매출 세액 : %,.0f원%n", salesTax);
    System.out.printf("매입 세액 : %,.0f원%n", purchaseTax);
    System.out.printf("납부 세액 : %,.0f원%n", tax);
}
