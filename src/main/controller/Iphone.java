package controller;

import internet
import reprodutor

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String serie;
    private String modelo;

    private List<Contato> listaContatos; // Lista de contatos

    public Iphone(String serie, String modelo) {
        this.serie = serie;
        this.modelo = modelo;
        this.listaContatos = new ArrayList<>(); // Inicializando a lista de contatos
    }

    public void ligar() {
        System.out.println("Ligando o iPhone " + serie + ", modelo " + modelo);
    }

    public void desligar() {
        System.out.println("Desligando o iPhone " + serie + ", modelo " + modelo);
    }


    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

  

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

  

    public void excluirMusica(String musica) {
        System.out.println("Deletando a música: " + musica);
    }

   

    public void adicionarMusica(String musica) {
        System.out.println("Adicionando a música: " + musica);
    }

 

    public void ligarChamada(Contato contato) {
        System.out.println("Ligando para "+ contato.getNome());
    }

    public void desligarChamada(){
        System.out.println("Desligando chamada");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void buscarContatos(String nome) {
        System.out.println("Buscando contato: " + nome);
    }

    public void excluirContato(String nome) {
        System.out.println("Excluindo contato: " + nome);
    }

    public void adicionarContato(Contato contato) {
        System.out.println("Adicionando contato: " + contato.getNome());
    }

    public void enviarSMS(String mensagem, Contato contato) {
        System.out.println("Enviando SMS para " + contato.getNome() + ": " + mensagem);
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }


    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaPagina(String url) {
        System.out.println("Adicionando nova página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
