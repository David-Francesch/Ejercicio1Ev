import java.util.concurrent.Semaphore;

public class HiloMonstruo extends Thread{

    Semaphore almacen = null;
    int galletas = 10;

    public HiloMonstruo(Semaphore almacen){
        super();
        this.almacen = almacen;
    }

    public void setGalletas(int galletas) {
        this.galletas = galletas;
    }

    public int getGalletas() {
        return galletas;
    }

    public void run(){
        int galletasComidas = (int) Math.random()*10;
        try {
            System.out.println("Quiero entrar" + Thread.currentThread().getId());
            almacen.acquire();
            System.out.println("He entrado"+ Thread.currentThread().getId());
            setGalletas(galletasComidas);
            System.out.println("Quedan "+getGalletas()+" galletas");
            //comer galletas
            almacen.release();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    //metodo de comer galletas
    
}
