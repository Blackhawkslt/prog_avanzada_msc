import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

class Music{
	public void ReproducirAudio(String ruta) throws Exception {
        	File archivoAudio = new File(ruta);
        	if (archivoAudio.exists()) {
        		Clip clip = AudioSystem.getClip();
        		clip.open(AudioSystem.getAudioInputStream(archivoAudio));
            		clip.start();
            		Thread.sleep(clip.getMicrosecondLength() / 1000);
        	} else {
			System.out.println("El archivo de audio no se encuentra");
        	}
    	}
}