package model;

import java.time.LocalDate;

public class Persona {
    private Long idUsuario;
    private String nombre;
    private String apellidos;
    private LocalDate fechaIncorporacion;
    private boolean internalizado;
    private String proveedorExterno;
    private String puestoTrabajo;
    private String area;
    private String equipo;
    private double costeHora;
    private double salarioAnual;
    private Long managerAsociado;

    // Constructor
    public Persona(Long idUsuario, String nombre, String apellidos, LocalDate fechaIncorporacion, boolean internalizado, String proveedorExterno, String puestoTrabajo, String area, String equipo, double costeHora, double salarioAnual, Long managerAsociado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIncorporacion = fechaIncorporacion;
        this.internalizado = internalizado;
        this.proveedorExterno = proveedorExterno;
        this.puestoTrabajo = puestoTrabajo;
        this.area = area;
        this.equipo = equipo;
        this.costeHora = costeHora;
        this.salarioAnual = salarioAnual;
        this.managerAsociado = managerAsociado;
    }

    public Persona() {
    }

    // Getters and Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public boolean isInternalizado() {
        return internalizado;
    }

    public void setInternalizado(boolean internalizado) {
        this.internalizado = internalizado;
    }

    public String getProveedorExterno() {
        return proveedorExterno;
    }

    public void setProveedorExterno(String proveedorExterno) {
        this.proveedorExterno = proveedorExterno;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getCosteHora() {
        return costeHora;
    }

    public void setCosteHora(double costeHora) {
        this.costeHora = costeHora;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public Long getManagerAsociado() {
        return managerAsociado;
    }

    public void setManagerAsociado(Long managerAsociado) {
        this.managerAsociado = managerAsociado;
    }
}