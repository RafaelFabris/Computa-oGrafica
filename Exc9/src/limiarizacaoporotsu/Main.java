
package limiarizacaoporotsu;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
       Limiarizacao limiar = new Limiarizacao("C:\\Users\\Rafael\\Pictures\\teste.jpg",
                                              "C:\\Users\\Rafael\\Pictures\\testeout.jpg");
        try {
            limiar.converter();
        } catch (IOException ex) {
            System.out.println("Erro ao manipular arquivos: " + ex.toString());
        }
}
    }
    

