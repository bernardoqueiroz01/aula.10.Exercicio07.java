public class Celular {
    String marca;
    String modelo;
    int bateria;
    boolean ligado;
    double armazenamentoUsado;
    double armazenamentoTotal;
    
    public String ligar(){
        if (bateria <= 0) {
            return "DESLIGADO";
        }else{
            return "LIGADO";
        }
    }


    public String desligar(){
        return "DESLIGADO";
    }



    public void carregarBateria(int percentual){
        bateria += percentual;
    }


    public void usarArmazenamento(double gb){
        armazenamentoUsado += gb;
    }


    public void exibirStatus(){
        System.out.println(marca + " " + modelo + " - " + ligar() + "\nBateria: " + bateria + "%\nArmazenamento: " + armazenamentoUsado + " GB / " + armazenamentoTotal + " GB usados");
    }


}
