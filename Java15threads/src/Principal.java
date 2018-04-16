public class Principal {

	public static void main(String[] args) {

		ThreadsA ta = new ThreadsA();
		// para lanzar un thread y que ejecute su metodo run
		// de forma paralele debo llamar al metodo start()

		ta.start();

		// para lanzar un runnable debo hacer lo siguiente:
		ThreadB tb = new ThreadB();
		Thread ttb = new Thread(tb);
		ttb.start();
		
		
		System.out.println("FIN DEL MAIN");

	}

}
