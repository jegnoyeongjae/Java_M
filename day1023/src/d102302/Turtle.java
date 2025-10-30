package d102302;

public class Turtle extends Character {

	    public Turtle() {
	        super("꼬북이", 40, 50);
	    }

	    @Override
	    public void eat() {
	        energy += 15;
	        System.out.println(name + "이(가) 밥을 먹었습니다! 에너지 +15");
	    }

	    @Override
	    public void sleep() {
	        energy += 10;
	        System.out.println(name + "이(가) 잠을 잤습니다! 에너지 +10");
	    }

	    @Override
	    public void play() {
	        energy -= 30;
	        exp += 15;
	        System.out.println(name + "이(가) 놀았습니다! 에너지 -30, 경험치 +15");
	        energyCheck();
	        levelUpCheck();
	    }

	    @Override
	    public void train() {
	        energy -= 20;
	        exp += 30;
	        System.out.println(name + "이(가) 연습했습니다! 에너지 -20, 경험치 +30");
	        energyCheck();
	        levelUpCheck();
	    }

	    @Override
	    public void levelUpCheck() {
	        if (exp >= 50) {
	            level++;
	            exp = 0;
	            System.out.println(name + " 레벨업! 현재 레벨: " + level);
	        }
	    }
	}
