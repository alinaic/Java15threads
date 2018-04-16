
// una forma de crear un thread es heredando de la clase Thread
public class ThreadsA extends Thread {

	// el codigo que quiera lanzar de forma paralela
	// será el que este en el metodo run

	public void run() {
		while (true) {
			System.out.println("se ejecuta el trhread A");
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("se interumpio el hilo");
			e.printStackTrace();
		}
		}
	}//end run

}//end class
