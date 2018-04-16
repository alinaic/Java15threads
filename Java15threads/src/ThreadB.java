//la segunda forma de crear un Thread es implementando el 
//interfaz Runnable
public class ThreadB implements Runnable {

	@Override
	public void run() {
		while (true) {

			System.out.println(" * * * se ejecuta el Thread B");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("se ha interumpido el Thread B");
				e.printStackTrace();
			}

		}// end while

	}// end run

}// end class
