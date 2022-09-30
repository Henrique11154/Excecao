package Testes;
public class App {
    public static void main(String[] args) throws Exception {
        int[] v = null;
        int[] n = new int[]{1,2,3,4};
        int[] p = new int[]{5,0,4};
        try{
            for (int i = 0; i <= n.length; i++) {
                //System.out.println(n[i]);
                double resultado = n[i]/p[i];
                System.out.printf("%d / %d = %.4f \n", n[i], p[i],resultado);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("houve um erro: acesso a posição inexistente do vetor");
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Erro ao percorrer o vetor");
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Houve um erro de calculo");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
