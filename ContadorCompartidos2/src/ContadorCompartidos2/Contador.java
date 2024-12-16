package ContadorCompartidos2;

//Recurso compartido por los hilos. Sección crítica
//Los métodos setContador() y getContador() han sido sustituidos
//por incContador(), siendo este un método sincronizado.
//Esto garantiza que ese método será ejecutado a lo sumo por un único hilo a la vez.
public class Contador {
  private int contador=0;
 
  public synchronized int incContador(int val){
      this.contador=this.contador+val;
      try{
              Thread.sleep((long)(Math.random()*100));
             
        }catch (InterruptedException e){
              System.out.println("Interrupción del hilo...");
        }
      return this.contador;
  } 
}
