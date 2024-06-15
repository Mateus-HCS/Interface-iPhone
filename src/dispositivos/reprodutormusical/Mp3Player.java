package dispositivos.reprodutormusical;

public class Mp3Player implements ReprodutorMusical {
    public void pausar(){
        System.out.println("Pausando música no MP3 player");
    }
    public void tocar(){
        System.out.println("Tocando música no MP3 player");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música no MP3 player");
    }
}
