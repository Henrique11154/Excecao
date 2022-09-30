package Erros;

public class ControleRemoto {
    
    private boolean estaLigada;
    private int volume;
    private boolean estaMudo;

    public ControleRemoto(){
        this.estaLigada = false;
        this.volume = 0;
        this.estaMudo = false;
    }

    public void ligar(){
        if(!this.estaLigada){
        System.out.println("TV esta ligada");
        }else{
            this.estaLigada = false;
            System.out.println("A TV desligou");
        }
    }
    
    public void aumentarVolume(){
        if(this.volume > 95){
            System.out.println("O volume esta no maximo");
        }else{
            this.volume=+5;
        }
    }

    public void diminuirVolume(){
        if(this.volume < 5){
            System.out.println("o volume sta no minimo");
        }else{
            this.volume=-5;
        }
    }

    public void ativarMudo(){
        if(this.estaMudo){
            System.out.println("A TV ja esta com a opção mudo ligado");
        }else{
            this.estaMudo = true;
            System.out.println("A tv esta muda");
        }
    }

    public void desligarMudo(){
        if(this.estaMudo == false){
            System.out.println("A tv ja esta com o mudo desligado");
        }else{
            this.estaMudo = false;
            System.out.println("A tv esta muda");
        }
   }
}