package dispositivos.reprodutormusical;

public class IPod implements ReprodutorMusical {
    public void pausar(){
        System.out.println("Pausando música no IPod");
    }
    public void tocar(){
        System.out.println("Tocando música no IPod");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música no IPod");
    }
}
