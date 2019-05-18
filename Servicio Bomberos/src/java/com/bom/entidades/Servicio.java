package com.bom.entidades;
// Generated 17-may-2019 17:43:44 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private int serId;
     private String nombre;
     private String descripcion;
     private double valor;
     private Set<ServicioRequisitos> servicioRequisitoses = new HashSet<ServicioRequisitos>(0);
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

    public Servicio() {
    }

	
    public Servicio(int serId, String nombre, String descripcion, double valor) {
        this.serId = serId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    public Servicio(int serId, String nombre, String descripcion, double valor, Set<ServicioRequisitos> servicioRequisitoses, Set<FacturaDetalle> facturaDetalles, Set<Solicitud> solicituds) {
       this.serId = serId;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.valor = valor;
       this.servicioRequisitoses = servicioRequisitoses;
       this.facturaDetalles = facturaDetalles;
       this.solicituds = solicituds;
    }
   
    public int getSerId() {
        return this.serId;
    }
    
    public void setSerId(int serId) {
        this.serId = serId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Set<ServicioRequisitos> getServicioRequisitoses() {
        return this.servicioRequisitoses;
    }
    
    public void setServicioRequisitoses(Set<ServicioRequisitos> servicioRequisitoses) {
        this.servicioRequisitoses = servicioRequisitoses;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }




}

