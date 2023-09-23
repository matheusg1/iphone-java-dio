import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> playlist;
    private String musicaAtual;

    public ReprodutorMusical() {
    }

    public ReprodutorMusical(String musicaAtual) {
        this.playlist = new ArrayList<String>();
        this.musicaAtual = musicaAtual;
    }

    public void tocarMusica(String musica) {
        setMusicaAtual(musica);
    }

    public List<String> getPlaylist() {
        System.out.println(playlist);
        return playlist;
    }

    public String getMusicaAtual() {
        System.out.println(musicaAtual);
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }
}
