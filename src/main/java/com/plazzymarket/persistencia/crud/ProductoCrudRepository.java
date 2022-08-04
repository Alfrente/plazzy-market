package com.plazzymarket.persistencia.crud;

import com.plazzymarket.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{

    //@Query(value = "SELECT * FROM productos WHERE id_categoria=?", nativeQuery = true) Query nativa
    //si pongo el de arriba pierde flexibilida y puedo cambiar el nombre del metodo
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); //Debo tener en cuenta la nomenclatura para qu funcione de forma adecuada

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
