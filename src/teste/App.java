package teste;

import teste.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.exibirPagina();
        System.out.println("-------");
        iphone.atender();
        iphone.ligar();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        iphone.iniciarCorreioDeVoz();
    }
}
