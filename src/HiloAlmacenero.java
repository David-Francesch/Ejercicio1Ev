import java.util.concurrent.Semaphore;

public class HiloAlmacenero extends Thread{

    Semaphore almacen = null;

    public HiloAlmacenero(Semaphore almacen){
        super();
        this.almacen = almacen;
    }

    public void run(){
        try {
            System.out.println("Quiero entrar" + Thread.currentThread().getId());
            almacen.acquire();
            System.out.println("He entrado"+ Thread.currentThread().getId());
            //comprobar stock
            almacen.release();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    
    //metodo de comprobar stock
    
}
