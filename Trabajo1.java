public class Trabajo1 {
	public static void main(String[] args) throws Exception {
		Chat juego = new Chat();
		Runnable musicTask = () -> {
			try{
				juego.ReproducirAudio("c:/Users/Osa veterinaria/Desktop/Audjava/prog_avanzada_msc/audio.wav");
			}
			catch (Exception e){
				e.printStackTrace();
			}
		};
		Thread musicThread = new Thread(musicTask);
		Thread chatThread = new Thread(juego::ChatUsuario);
		musicThread.start();
		chatThread.start();
		
	}
}
