package staticExercise;

public class staticExercise {

	public static void main(String[] args) {
		
		Player p1 = new Player("A", 44);
		Player p2 = new Player("B", 54);
		System.out.println("p1 : " + p1.name);
		System.out.println("p2 : " + p2.name);
		System.out.println("Number of players after p1 and p2 counter : " 
		+ Player.count + "  "+ Player.number);
		
	}

	public static Player createPlayer() {
		
		return new Player("Ali", 1100);
	}

static class Player{
	static int count = 0;
	static int number = 0;
	int marks = 0;
	String name;

	Player(String name, int marks){
		this.name = name;
		this.marks = marks;
		count++;
		number = number + 1;
			}
		}
	}
