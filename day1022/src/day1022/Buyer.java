package day1022;

public class Buyer {
		int money = 10000;
		int bonusPoint = 0;
		
		void buyTv(int money, int bonusPoint) {
			if (this.money < money) {
				System.out.println("잔액이 부족합니다.");
				return;
			}
			
			this.money -= money;
			this.bonusPoint += bonusPoint;
			
			System.out.println("TV를 구매하였습니다.");
		}
}
