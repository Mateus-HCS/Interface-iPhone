package usuarios;

import dispositivos.aparelhotelefonico.AparelhoTelefonico;
import dispositivos.aparelhotelefonico.Telefone;
import dispositivos.navegadordeinternet.NavegadorDeInternet;
import dispositivos.navegadordeinternet.GoogleChrome;
import dispositivos.navegadordeinternet.Safari;
import dispositivos.reprodutormusical.ReprodutorMusical;
import dispositivos.reprodutormusical.IPod;
import dispositivos.reprodutormusical.Mp3Player;
import dispositivos.smartphone.IPhone;

public class mateus {
    public static void main(String[] args) {
        AparelhoTelefonico at = new Telefone();
        at.ligar();
        at.atender();
        at.iniciarCorreioVoz();

        System.out.println("\n");

        NavegadorDeInternet ni = new GoogleChrome();
        ni.adicionarNovaAba();
        ni.exibirPagina();
        ni.atualizarPagina();

        System.out.println("\n");

        NavegadorDeInternet ni2 = new Safari();
        ni2.adicionarNovaAba();
        ni2.exibirPagina();
        ni2.atualizarPagina();

        System.out.println("\n");

        ReprodutorMusical rp = new Mp3Player();
        rp.tocar();
        rp.pausar();
        rp.selecionarMusica();

        System.out.println("\n");

        ReprodutorMusical rp2 = new IPod();
        rp2.tocar();
        rp2.pausar();
        rp2.selecionarMusica();

        System.out.println("\n");

        IPhone ip = new IPhone();
        ip.ligar();
        ip.atender();
        ip.iniciarCorreioVoz();
        ip.adicionarNovaAba();
        ip.exibirPagina();
        ip.atualizarPagina();
        ip.tocar();
        ip.pausar();
        ip.selecionarMusica();
    }

}
