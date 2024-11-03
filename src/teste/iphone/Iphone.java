package teste.iphone;

import teste.ferramentas.AparelhoTelefonico;
import teste.ferramentas.NavegadorDeInternet;
import teste.ferramentas.ReprodutorMusical;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorDeInternet {

    @Override
    public void exibirPagina() {
        NavegadorDeInternet.super.exibirPagina();
        System.out.println("Exibindo Página");
    }
    


    


    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }
    
}
