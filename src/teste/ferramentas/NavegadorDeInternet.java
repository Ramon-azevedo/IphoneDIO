package teste.ferramentas;

public interface NavegadorDeInternet {
    
    default void exibirPagina() {
        adicionarNovaAba();
        atualizarPagina();
    }

    private void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    private void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

}
