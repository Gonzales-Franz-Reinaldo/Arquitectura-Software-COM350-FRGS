package PatronesEstructurales.Adapter;

public class AdaptadorDeMedios implements ReproductorDeAudio {

    ReproductorVLC reproductorVLC;
    ReproductorMP4 reproductorMP4;

    public AdaptadorDeMedios(String tipoDeAudio) {
        if(tipoDeAudio.equalsIgnoreCase("vlc")){
            reproductorVLC = new ReproductorVLC();
        } else if(tipoDeAudio.equalsIgnoreCase("mp4")){
            reproductorMP4 = new ReproductorMP4();
        }
    }

    @Override
    public void reproducir(String tipoDeAudio, String nombreArchivo) {
        if(tipoDeAudio.equalsIgnoreCase("vlc")){
            reproductorVLC.reproducirVLC(nombreArchivo);
        } else if(tipoDeAudio.equalsIgnoreCase("mp4")){
            reproductorMP4.reproducirMP4(nombreArchivo);
        }
    }
}
