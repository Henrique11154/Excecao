package Testes;
import Erros.Matematica;
public class MatematicaTeste {
    
    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        try{
            m.divisao(5,0);
        }catch (Exception e ){
            System.out.println("Houve um erro");
            e.printStackTrace();
        }

        System.out.println("mensagem apos o erro");
    }
}
