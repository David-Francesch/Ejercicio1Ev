import java.util.concurrent.Semaphore;

public class HiloAlmacenero extends Thread{

    Semaphore almacen = null;

    public HiloAlmacenero(Semaphore almacen){
        super();
        this.almacen = almacen;
    }

    
    //metodo de comprobar stock
    
}
