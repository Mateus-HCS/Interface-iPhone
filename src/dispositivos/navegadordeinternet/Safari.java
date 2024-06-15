package dispositivos.navegadordeinternet;

public class Safari implements NavegadorDeInternet {
    public void exibirPagina(){
        System.out.println("Exibindo página no Safari");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada ao Safari");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página do Safari");
    }
}
