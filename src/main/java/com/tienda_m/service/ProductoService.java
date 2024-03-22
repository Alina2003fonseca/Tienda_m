package com.tienda_m.service;

import com.tienda_m.domain.Producto;
import java.util.List;


public interface ProductoService {
   //Se define la firma del metodo para obtener los regristros de producto en forma de lista
    public List<Producto>getProductos(boolean activo);
    
    
    //Se recupera un registro tomando el idProducto como clave de busqueda
    public Producto getProducto(Producto producto);
    
    //Si idProducto tiene un valor, se modifica ese registro,
    //si idProducto No tine Valor, se inserta un nuevo registro
    public void save (Producto producto);
    
    //Se elimina el regristro que tenga el valor del idProducto Pasado
    public void delete(Producto producto);
    
     public List<Producto> metodoJPA(double precioInf, double precioSup);
    
    //Esta consulta utiliza consultas JPQL

    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    
      //Esta consulta utiliza consultas SQL
    
    public List<Producto> metodoSQL(double precioInf, double precioSup);
    
    public List<Producto> findByDescripcion(String descripcion);
}

    
    


