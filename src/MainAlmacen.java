import java.util.concurrent.Semaphore;

// Crea un proyecto java llamado Almacen, según la siguiente descripción:

// En un almacén hay inicialmente 10 galletas:
// Existen dos tipos de hilos, los monstruos de las galletas y el almacenero.
// Creamos 3 monstruos y un almacenero.
// Tanto los monstruos como el almacenero entran en el almacén cuando no hay nadie, es decir, entran de uno en uno.
// Un monstruo come un número de galletas aleatorio, entre 1 y 10 (pero para cada monstruo, el número es fijo). Si el número es mayor que las galletas que quedan se comerá todas las que estén disponibles y se bloqueara.
// El almacenero entra al almacén y si no quedan galletas repone otras 10.
// Para ver el proceso, el almacenero y los monstruos, irán imprimiendo mensajes de lo que van haciendo.
// El programa termina cuando el almacenero repone 10 veces las galletas y se han comido todas.

public class MainAlmacen {
    public static void main(String[] args) throws Exception {

        Semaphore almacen = new Semaphore(1);
    
        HiloMonstruo m1 = new HiloMonstruo(almacen);
        HiloMonstruo m2 = new HiloMonstruo(almacen);
        HiloMonstruo m3 = new HiloMonstruo(almacen);
        HiloAlmacenero a1 = new HiloAlmacenero(almacen);

        int galletas = 10;

        m1.start();
        m2.start();
        m3.start();
        a1.start();


    
    }
}
