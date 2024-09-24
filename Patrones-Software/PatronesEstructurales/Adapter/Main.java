package PatronesEstructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        ReproductorDeAudioAvanzado reproductor = new ReproductorDeAudioAvanzado();

        reproductor.reproducir("mp3", "cancion.mp3");
        reproductor.reproducir("mp4", "video.mp4");
        reproductor.reproducir("vlc", "pelicula.vlc");
        reproductor.reproducir("avi", "archivo.avi"); // Formato no soportado
    }
}
