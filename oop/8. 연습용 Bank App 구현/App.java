package example_09_27_homework_review;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 계좌관련 조회/비밀번호 변경/입출금/이체/해지환급금조회 등의 기능을 제공하는 객체 생성하기
        Bank bank = new Bank();

        while (true) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1.전계좌조회 2.계좌상세조회 3.비밀번호변경 4.입금하기 5.출금하기 6.이체하기 7.해지환급금조회 0.종료");
            System.out.println("--------------------------------------------------------------------------------");

            System.out.print("메뉴를 선택하세요: ");
            int menuNo = scan.nextInt();

            if (menuNo == 1) {
            	System.out.println("[나의 전계좌 조회하기]");
            	
            	System.out.print("조회할 소유자명 입력: ");
            	String name = scan.next();
            	bank.displayMyAccounts(name);

            } else if (menuNo == 2) {
            	System.out.println("[계좌 상세정보 조회하기]");
            	
            	System.out.print("조회할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("계좌 비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	bank.displayAccountInfo(accId, pwd);

            } else if (menuNo == 3) {
            	System.out.println("[비밀번호 변경하기]");
            	
            	System.out.print("조회할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("이전 비밀번호 입력: ");
            	int oldPwd = scan.nextInt();
            	
            	System.out.print("새로운 비밀번호 : ");
            	int newPwd = scan.nextInt();
            	
            	bank.changePassword(accId, oldPwd, newPwd);

            } else if (menuNo == 4) {
            	System.out.println("[입금하기]");
            	
            	System.out.print("입금할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("입금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.deposit(accId, amount);

            } else if (menuNo == 5) {
            	System.out.println("[출금하기]");
            	
            	System.out.print("출금할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("계좌 비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	System.out.print("출금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.withdraw(accId, pwd, amount);
         

            } else if (menuNo == 6) {
            	System.out.println("[이체하기]");
            	
            	System.out.print("출금할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("이체할 상대방 계좌아이디 입력: ");
            	String otherAccId = scan.next();
            	
            	System.out.print("계좌 비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	System.out.print("이체금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.transfer(accId, otherAccId, pwd, amount);

            } else if (menuNo == 7) {
            	System.out.println("[해지환급금 조회하기]");

            	System.out.print("조회할 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("계좌 비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	bank.calculateCancellationRefund(accId, pwd);
            	
            } else if (menuNo == 0) {
                System.out.println("[프로그램 종료]");
                break;
            }

            System.out.println();
            System.out.println();
            System.out.println();
        }

        scan.close();
    }
}
