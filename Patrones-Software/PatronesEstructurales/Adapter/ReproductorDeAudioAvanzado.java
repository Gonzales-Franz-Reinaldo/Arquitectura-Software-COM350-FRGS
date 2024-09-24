package PatronesEstructurales.Adapter;

public class ReproductorDeAudioAvanzado implements ReproductorDeAudio {

    AdaptadorDeMedios adaptadorDeMedios;

    @Override
    public void reproducir(String tipoDeAudio, String nombreArchivo) {
        if(tipoDeAudio.equalsIgnoreCase("mp3")){
            System.out.println("Reproduciendo archivo MP3: " + nombreArchivo);
        }
        else if(tipoDeAudio.equalsIgnoreCase("vlc") || tipoDeAudio.equalsIgnoreCase("mp4")){
            adaptadorDeMedios = new AdaptadorDeMedios(tipoDeAudio);
            adaptadorDeMedios.reproducir(tipoDeAudio, nombreArchivo);
        }
        else{
            System.out.println("Formato no soportado: " + tipoDeAudio);
        }
    }
}
