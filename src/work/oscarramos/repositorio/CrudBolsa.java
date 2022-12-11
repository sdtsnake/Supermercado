package work.oscarramos.repositorio;

import java.util.List;

public interface CrudBolsa<T> {

    void addProducto(T t);
    List<T> getProductos();
}
