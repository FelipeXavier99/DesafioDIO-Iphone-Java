import telefone.Contato;
import telefone.Iphone;

public class Teste {

        public static void main(String[] args) {
            Iphone iphone = new Iphone("77777", "iPhone 12");

            iphone.ligar();
          
            iphone.tocarMusica("Música Teste");
            iphone.pausarMusica();
           
            iphone.selecionarMusica("Música Eletronica ");
            iphone.excluirMusica("Música Rock");
            iphone.adicionarMusica("Música Sertanejo");
         
    

            iphone.atender();;
            iphone.buscarContatos("Xaier");
            Contato contatoParaChamada = new Contato("Felipe", "12345-6789");
            iphone.ligarChamada(contatoParaChamada);
            
           -------------------------------");

       

            iphone.desligar();
        }
    }

