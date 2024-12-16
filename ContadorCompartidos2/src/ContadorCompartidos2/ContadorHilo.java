package ContadorCompartidos2;

/*Cada hilo accederá 3 veces al recurso compartido Contador y lo incrementará en
* 1, durmiendo un tiempo aleatorio en cada iteración*/
public class ContadorHilo extends Thread {
    private Contador cont;
    ContadorHilo(String h_nombre,Contador h_cont){
        super(h_nombre);
        this.cont=h_cont;
    }
    //Método para incrementar el contador
    public void run(){
        for (int i=0;i<3;i++)
            System.out.println(getName()+ " - contador: "+cont.incContador(1));
        System.out.println("Fin "+getName()+ "...");
    }
}