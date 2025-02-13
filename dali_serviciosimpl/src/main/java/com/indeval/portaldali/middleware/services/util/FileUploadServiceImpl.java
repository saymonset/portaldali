/*
 * Copyrigth (c) 2005-2006 Bursatec. All Rights Reserved.
 */
package com.indeval.portaldali.middleware.services.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO;
import com.indeval.portaldali.persistence.dao.util.FileUploadDao;
import com.indeval.portaldali.persistence.model.FileUpload;

/**
 * 
 * @author csanchez
 * 
 */
public class FileUploadServiceImpl implements FileUploadService {

	/** Objeto de loggeo */
	private static final Logger logger = LoggerFactory.getLogger(FileUploadServiceImpl.class);

	/**
	 * Dao FileUploadDao
	 */
	private FileUploadDao fileUploadDao;

	/**
	 * @see com.indeval.portaldali.middleware.services.util.FileUploadService#getLock(com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO)
	 */
	public Boolean getLock(ProcessInfoVO processInfoVO) {
		logger.trace("Entrando a FileUploadServiceImpl.getLock()");
		FileUpload fileUpload = parseProcessInfoVO2FileUpload(processInfoVO);
		return fileUploadDao.getLock(fileUpload);
	}

	/**
	 * @see com.indeval.portaldali.middleware.services.util.FileUploadService#getProcessInfo(com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO)
	 */
	public ProcessInfoVO getProcessInfo(ProcessInfoVO processInfoVO) {
		logger.trace("Entrando a FileUploadServiceImpl.getProcessInfo()");
		FileUpload fileUpload = parseProcessInfoVO2FileUpload(processInfoVO);
		FileUpload fileUpload2 = fileUploadDao.getProcessInfo(fileUpload);
		ProcessInfoVO processInfoVO2 = parseFileUpload2ProcessInfoVO(fileUpload2);
		return processInfoVO2;
	}

	/**
	 * @see com.indeval.portaldali.middleware.services.util.FileUploadService#isProcessRunning(com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO)
	 */
	public Boolean isProcessRunning(ProcessInfoVO processInfoVO) {
		logger.trace("Entrando a FileUploadServiceImpl.isProcessRunning()");
		FileUpload fileUpload = parseProcessInfoVO2FileUpload(processInfoVO);
		return fileUploadDao.isProcessRunning(fileUpload);
	}

	/**
	 * @see com.indeval.portaldali.middleware.services.util.FileUploadService#releaseLock(com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO)
	 */
	public void releaseLock(ProcessInfoVO processInfoVO) {
		logger.trace("Entrando a FileUploadServiceImpl.releaseLock()");
		FileUpload fileUpload = parseProcessInfoVO2FileUpload(processInfoVO);
		fileUploadDao.releaseLock(fileUpload);
	}

	/**
	 * @see com.indeval.portaldali.middleware.services.util.FileUploadService#updateProcessInfo(com.indeval.portaldali.middleware.services.util.vo.ProcessInfoVO)
	 */
	public void updateProcessInfo(ProcessInfoVO processInfoVO) {
		logger.trace("Entrando a FileUploadServiceImpl.updateProcessInfo()");
		FileUpload fileUpload = parseProcessInfoVO2FileUpload(processInfoVO);
		fileUploadDao.updateProcessInfo(fileUpload);
	}

	/**
	 * 
	 * @param processInfoVO
	 * @return
	 */
	private FileUpload parseProcessInfoVO2FileUpload(ProcessInfoVO processInfoVO) {
		logger
				.trace("Entrando a FileUploadServiceImpl.parseProcessInfoVO2FileUpload()");
		FileUpload fileUpload = new FileUpload();
		fileUpload.setIdProceso(processInfoVO.getIdProceso());
		fileUpload.setAbort(processInfoVO.getAbort());
		fileUpload.setPorcentaje(processInfoVO.getPorcentajeTerminado());
		fileUpload.setStatus(processInfoVO.getStatus());
		fileUpload.setUsuario(processInfoVO.getUsuario());
		return fileUpload;
	}

	
	
	/**
	 * 
	 * @param fileUpload
	 * @return
	 */
	private ProcessInfoVO parseFileUpload2ProcessInfoVO(FileUpload fileUpload) {
		logger
				.trace("Entrando a FileUploadServiceImpl.parseFileUpload2ProcessInfoVO()");
		if (fileUpload != null) {
			ProcessInfoVO processInfoVO = new ProcessInfoVO();
			processInfoVO.setIdProceso(fileUpload.getIdProceso());
			processInfoVO.setAbort(fileUpload.getAbort());
			processInfoVO.setPorcentajeTerminado(fileUpload.getPorcentaje());
			processInfoVO.setStatus(fileUpload.getStatus());
			processInfoVO.setUsuario(fileUpload.getUsuario());
			return processInfoVO;
		}
		return null;
	}

	/**
	 * @param fileUploadDao
	 *            the fileUploadDao to set
	 */
	public void setFileUploadDao(FileUploadDao fileUploadDao) {
		this.fileUploadDao = fileUploadDao;
	}

}
