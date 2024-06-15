package dispositivos.aparelhotelefonico;

public class Telefone implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando pelo Telefone");
    }
    public void atender(){
        System.out.println("Atendendo o Telefone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz do Telefone");
    }
}
