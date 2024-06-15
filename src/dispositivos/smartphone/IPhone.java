package dispositivos.smartphone;

import dispositivos.aparelhotelefonico.AparelhoTelefonico;
import dispositivos.navegadordeinternet.NavegadorDeInternet;
import dispositivos.reprodutormusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    public void ligar(){
        System.out.println("Ligando pelo IPhone");
    }
    public void atender(){
        System.out.println("Atendendo o IPhone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz do IPhone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo página no IPhone");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada ao IPhone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página do IPhone");
    }
    public void pausar(){
        System.out.println("Pausando música no IPhone");
    }
    public void tocar(){
        System.out.println("Tocando música no IPhone");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música no IPhone");
    }
}
