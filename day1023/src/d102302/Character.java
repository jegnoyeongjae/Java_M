package d102302;

//Character.java (추상 클래스)
abstract class Character {
 protected String name;
 protected int exp;
 protected int level;
 protected int energy;
 protected boolean isAlive;

 public Character(String name, int exp, int energy) {
     this.name = name;
     this.exp = exp;
     this.energy = energy;
     this.level = 1;
     this.isAlive = true;
 }

 // 공통 메서드
 public abstract void eat();
 public abstract void sleep();
 public abstract void play();
 public abstract void train();
 public abstract void levelUpCheck();

 public void energyCheck() {
     if (energy <= 0) {
         isAlive = false;
         System.out.println(name + "은(는) 에너지가 0이 되어 죽었습니다...");
     }
 }

 public void printInfo() {
     System.out.println("===== 캐릭터 정보 =====");
     System.out.println("이름: " + name);
     System.out.println("레벨: " + level);
     System.out.println("경험치: " + exp);
     System.out.println("에너지: " + energy);
     System.out.println("상태: " + (isAlive ? "생존" : "사망"));
     System.out.println("=====================");
 }
}
