package d102302;

public class CharacterMain {
	
	    public static void main(String[] args) {
	        Pikachu p = new Pikachu();
	        ToothBrokenSeed b = new ToothBrokenSeed();
	        Turtle s = new Turtle();

	        p.printInfo();
	        p.play();
	        p.train();
	        p.sleep();
	        p.printInfo();

	        System.out.println("#########################################");

	        b.play();
	        b.train();
	        b.printInfo();

	        System.out.println("#########################################");

	        s.train();
	        s.play();
	        s.eat();
	        s.printInfo();
	    }
	}
