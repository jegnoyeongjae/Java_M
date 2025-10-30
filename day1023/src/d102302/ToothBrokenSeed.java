package d102302;

public class ToothBrokenSeed extends Character {

	    public ToothBrokenSeed() {
	        super("이상해씨", 20, 30);
	    }

	    @Override
	    public void eat() {
	        energy += 5;
	        System.out.println(name + "이(가) 밥을 먹었습니다! 에너지 +5");
	    }

	    @Override
	    public void sleep() {
	        energy += 20;
	        System.out.println(name + "이(가) 잠을 잤습니다! 에너지 +20");
	    }

	    @Override
	    public void play() {
	        energy -= 10;
	        exp += 15;
	        System.out.println(name + "이(가) 놀았습니다! 에너지 -10, 경험치 +15");
	        energyCheck();
	        levelUpCheck();
	    }

	    @Override
	    public void train() {
	        energy -= 10;
	        exp += 20;
	        System.out.println(name + "이(가) 연습했습니다! 에너지 -10, 경험치 +20");
	        energyCheck();
	        levelUpCheck();
	    }

	    @Override
	    public void levelUpCheck() {
	        if (exp >= 35) {
	            level++;
	            exp = 0;
	            System.out.println(name + " 레벨업! 현재 레벨: " + level);
	        }
	    }
	}
