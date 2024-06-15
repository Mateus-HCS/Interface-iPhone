package dispositivos.navegadordeinternet;

public class GoogleChrome implements NavegadorDeInternet {
    public void exibirPagina(){
        System.out.println("Exibindo página no Google Chrome");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada ao Google Chrome");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página do Google Chrome");
    }
}
