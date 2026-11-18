//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int[] weight = {1, 3};

    System.out.print("ISBN 처음 12자리 입력: ");
    String isbn = keyboard.nextLine().replace("-", "");

    if (!isbn.matches("[0-9]{12}")) {
        System.out.println("ISBN은 숫자 12자리로 입력해야 합니다.");
    } else {
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            int number = isbn.charAt(i) - '0';
            sum += number * weight[i % 2];
        }

        int remainder = sum % 10;
        int check = (remainder == 0) ? 0 : 10 - remainder;

        String fullISBN = isbn + check;

        System.out.println("가중치 합계: " + sum);
        System.out.println("10으로 나눈 나머지: " + remainder);
        System.out.println("체크 기호: " + check);
        System.out.println("완성된 ISBN: " + fullISBN);

        // 완성된 ISBN의 전체 가중치 합이 10으로 나누어지는지 확인
        int verify = 0;
        for (int i = 0; i < 13; i++) {
            int number = fullISBN.charAt(i) - '0';
            verify += number * (i % 2 == 0 ? 1 : 3);
        }

        if (verify % 10 == 0) {
            System.out.println("유효한 ISBN입니다.");
        } else {
            System.out.println("유효하지 않은 ISBN입니다.");
        }
    }
}
