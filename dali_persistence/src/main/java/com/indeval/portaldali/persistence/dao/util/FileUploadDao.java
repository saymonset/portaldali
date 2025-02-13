/*
 * Copyrigth (c) 2005-2006 Bursatec. All Rights Reserved.
 */
package com.indeval.portaldali.persistence.dao.util;

import com.indeval.portaldali.persistence.model.FileUpload;

/**
 * 
 * @author csanchez
 * 
 */
public interface FileUploadDao {

	/**
	 * M&eacute;todo encargado de realizar un candado
	 * 
	 * @param fileUpload
	 * @return
	 */
	public Boolean getLock(FileUpload fileUpload);

	/**
	 * M&eacute;todo encargado de liberar el candado
	 * 
	 * @param fileUpload
	 */
	public void releaseLock(FileUpload fileUpload);

	/**
	 * M&eacute;todo encargado de obtener la informaci&oacute;n del candado
	 * 
	 * @param fileUpload
	 * @return
	 */
	public FileUpload getProcessInfo(FileUpload fileUpload);

	/**
	 * M&eacute;todo encargado de verificar si existen procesos ejecutandose
	 * 
	 * @param fileUpload
	 * @return
	 */
	public Boolean isProcessRunning(FileUpload fileUpload);

	/**
	 * M&eacute;todo encargado de actulizar el estado del proceso
	 * 
	 * @param fileUpload
	 */
	public void updateProcessInfo(FileUpload fileUpload);
}
