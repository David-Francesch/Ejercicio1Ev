import java.util.concurrent.Semaphore;

public class HiloMonstruo extends Thread{

    Semaphore almacen = null;

    public HiloMonstruo(Semaphore almacen){
        super();
        this.almacen = almacen;
    }

    public void run(){
        try {
            System.out.println("Quiero entrar" + Thread.currentThread().getId());
            almacen.acquire();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    //metodo de comer galletas
    
}
