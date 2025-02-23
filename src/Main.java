import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;

		while(true) {


			System.out.printf("명령어) ");
			String cmd = sc.nextLine();

			if(cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if(cmd.equals("exit")) {
				break;
			}else if(cmd.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				System.out.printf("%d번 글이 생성되었습니다\n", id);

			}else if(cmd.equals("article list")) {
				System.out.println("게시글이 없습니다");
			}else {
				System.out.println("존재하지 않는 명령어 입니다");
			}

		}
		
		System.out.println("== 프로그램 끝 ==");
		
		sc.close();
		
	}
}
