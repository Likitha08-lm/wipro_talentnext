package abstraction;

 interface Playable {
    void play();
}
class Veena implements Playable {
    public void play() {
        System.out.println("Veena is playing a melody.");
    }
}
class Saxophone implements Playable {
    public void play() {
        System.out.println("Saxophone is playing a jazz tune.");
    }
}
public class Question3{
public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Veena veena = new Veena();
	        veena.play();
	        Saxophone sax = new Saxophone();
	        sax.play();
	        Playable p1 = veena;
	        Playable p2 = sax;
	        p1.play();
	        p2.play();

	}
}

}
