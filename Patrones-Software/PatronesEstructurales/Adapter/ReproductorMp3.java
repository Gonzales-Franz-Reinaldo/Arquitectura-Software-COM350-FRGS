package PatronesEstructurales.Adapter;

public class ReproductorMp3 implements ReproductorDeAudio {

    @Override
    public void reproducir(String tipoDeAudio, String nombreArchivo) {
        if(tipoDeAudio.equalsIgnoreCase("mp3")){
            System.out.println("Reproduciendo archivo MP3: " + nombreArchivo);
        } else {
            System.out.println("Formato no soportado: " + tipoDeAudio);
        }
    }
}
