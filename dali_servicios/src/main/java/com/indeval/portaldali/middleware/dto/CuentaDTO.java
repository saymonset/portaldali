/**
 * 2H Software - Bursatec - INDEVAL
 * Portal DALI
 * <p>
 * <p>
 * 27/02/2008
 */
package com.indeval.portaldali.middleware.dto;

import java.io.Serializable;

/**
 * DTO que representa una cuenta
 * @author Emigdio Hernández
 * @version 1.0
 *
 */
public class CuentaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** El tipo de tenencia asociado a la cuenta */
    private TipoTenenciaDTO tipoTenencia = new TipoTenenciaDTO();

    /** El identificador único de la cuenta */
    private long idCuenta = 0;

    /** El número de la cuenta */
    private String numeroCuenta = null;

    /** La institución a la que pertenece la cuenta */
    private InstitucionDTO institucion = new InstitucionDTO();

    /** La descripción corta de la cuenta */
    private String descripcion = null;

    /** El nombre asociado a la cuenta */
    private String nombreCuenta = null;

    private String tipoCustodia = null;
    /**
     * número de cuenta de 4 posiciones
     */
    private String cuenta = null;

    /**
     * Obtiene el campo tipoTenencia
     *
     * @return tipoTenencia
     */
    public TipoTenenciaDTO getTipoTenencia() {
        return tipoTenencia;
    }

    /**
     * Asigna el valor del campo tipoTenencia
     *
     * @param tipoTenencia
     *            el valor de tipoTenencia a asignar
     */
    public void setTipoTenencia(TipoTenenciaDTO tipoTenencia) {
        this.tipoTenencia = tipoTenencia;
    }

    /**
     * Obtiene el campo idCuenta
     *
     * @return idCuenta
     */
    public long getIdCuenta() {
        return idCuenta;
    }

    /**
     * Asigna el valor del campo idCuenta
     *
     * @param idCuenta
     *            el valor de idCuenta a asignar
     */
    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * Obtiene el campo numeroCuenta
     *
     * @return numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Asigna el valor del campo numeroCuenta
     *
     * @param numeroCuenta
     *            el valor de numeroCuenta a asignar
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Obtiene el campo nombreCuenta
     *
     * @return nombreCuenta
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * Asigna el valor del campo nombreCuenta
     *
     * @param nombreCuenta
     *            el valor de nombreCuenta a asignar
     */
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    /**
     * Obtiene el campo institucion
     *
     * @return institucion
     */
    public InstitucionDTO getInstitucion() {
        return institucion;
    }

    /**
     * Asigna el valor del campo institucion
     *
     * @param institucion
     *            el valor de institucion a asignar
     */
    public void setInstitucion(InstitucionDTO institucion) {
        this.institucion = institucion;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o) {
        boolean result = false;
        if (o != null && o instanceof CuentaDTO && ((CuentaDTO) o).getNumeroCuenta() != null) {
            result = ((CuentaDTO) o).getNumeroCuenta().equals(
                    this.getNumeroCuenta());
        } else {
            result = super.equals(o);
        }
        return result;
    }

    /**
     * Obtiene el campo descripcion
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna el valor del campo descripcion
     *
     * @param descripcion
     *            el valor de descripcion a asignar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the tipoCustodia
     */
    public String getTipoCustodia() {
        return tipoCustodia;
    }

    /**
     * @param tipoCustodia
     *            the tipoCustodia to set
     */
    public void setTipoCustodia(String tipoCustodia) {
        this.tipoCustodia = tipoCustodia;
    }

    /**
     * Obtiene el campo cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna el campo cuenta
     * @param cuenta el valor de cuenta a asignar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" +
                "tipoTenencia=" + tipoTenencia +
                ", idCuenta=" + idCuenta +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", institucion=" + institucion +
                ", descripcion='" + descripcion + '\'' +
                ", nombreCuenta='" + nombreCuenta + '\'' +
                ", tipoCustodia='" + tipoCustodia + '\'' +
                ", cuenta='" + cuenta + '\'' +
                '}';
    }
}