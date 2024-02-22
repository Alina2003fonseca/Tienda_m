
package com.tienda_m.service;

import com.tienda_m.domain.Categoria;
import java.util.List;


public interface CategoriaService {
   //Se define la firma del metodo para obtener los regristros de categoria en forma de lista
    public List<Categoria>getCategorias(boolean activo);
    
    
    //Se recupera un registro tomando el idCategoria como clave de busqueda
    public Categoria getCategoria(Categoria categoria);
    
    //Si idCategoria tiene un valor, se modifica ese registro,
    //si idCategoria No tine Valor, se inserta un nuevo registro
    public void save (Categoria categoria);
    
    //Se elimina el regristro que tenga el valor del idCategoria Pasado
    public void delete(Categoria categoria);
}
