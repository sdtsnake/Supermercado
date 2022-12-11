package work.oscarramos.repositorio;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> implements CrudBolsa<T> {
    private List<T> datasourse;
    private final int totalRegostros=5;

    public BolsaSupermercado() {
        this.datasourse = new ArrayList();
    }

    @Override
    public void addProducto(T t) {
        if(this.datasourse.size()> totalRegostros){
            throw new RuntimeException("Se supero la capacidad de la bolsa");
        }

        this.datasourse.add(t);
    }

    @Override
    public List<T> getProductos() {
        return datasourse;
    }
}
