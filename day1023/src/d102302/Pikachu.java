package d102302;

class Pikachu extends Character {

    public Pikachu() {
        super("피카츄", 30, 50);
    }

    @Override
    public void eat() {
        energy += 10;
        System.out.println(name + "이(가) 밥을 먹었습니다! 에너지 +10");
    }

    @Override
    public void sleep() {
        energy += 5;
        System.out.println(name + "이(가) 잠을 잤습니다! 에너지 +5");
    }

    @Override
    public void play() {
        energy -= 20;
        exp += 5;
        System.out.println(name + "이(가) 놀았습니다! 에너지 -20, 경험치 +5");
        energyCheck();
        levelUpCheck();
    }

    @Override
    public void train() {
        energy -= 15;
        exp += 20;
        System.out.println(name + "이(가) 연습했습니다! 에너지 -15, 경험치 +20");
        energyCheck();
        levelUpCheck();
    }

    @Override
    public void levelUpCheck() {
        if (exp >= 40) {
            level++;
            exp = 0;
            System.out.println(name + " 레벨업! 현재 레벨: " + level);
        }
    }
}
