/*
 * Copyrigth (c) 2005-2006 Bursatec. All Rights Reserved.
 */
package com.indeval.persistence.exito.dali.posicionnombradadao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.indeval.persistence.unittest.BaseDaoTestCase;
import com.indeval.portaldali.persistence.dao.common.PosicionNombradaDaliDao;
import com.indeval.portaldali.persistence.vo.PageVO;
import com.indeval.portaldali.persistence.vo.TPosicionNombradaParamsPersistence;

/**
 * @author <a href="mailto:david.rengifo@itbrain.com.mx">David A. Rengifo R.</a>
 *
 */
public class ITestGetTPosicionNombradaDivisionInternacional_1 extends BaseDaoTestCase {
	
	/** Objeto de loggeo  */
    private static final Logger log = LoggerFactory.getLogger(ITestGetTPosicionNombradaDivisionInternacional_1.class);

    /**
     * bean de cInstrumentoDao
     */
	private PosicionNombradaDaliDao tPosicionNombradaDao;
	
    /**
     * @see com.indeval.persistence.unittest.BaseDaoTestCase#onSetUp()
     */
    protected void onSetUp() {
        super.onSetUp();
        tPosicionNombradaDao = (PosicionNombradaDaliDao) getBean("tPosicionNombradaDao");
    }

    /**
     * TestCase para getTPosicionNombradaDivisionInternacional()
     */
    public void testGetTPosicionNombradaDivisionInternacional_1() {
    	
    	log.info("Entrando a ITestGetTPosicionNombradaDivisionInternacional_1." +
    			"testGetTPosicionNombradaDivisionInternacional_1()");
    	
    	assertNotNull(tPosicionNombradaDao);
    	
        TPosicionNombradaParamsPersistence params = 
            UtilsTPosicionNombrada.getInstanceTPosicionNombradaParamsPersistence();
        
        params.setIdInstitucion("01");
        params.setFolioInstitucion("003");
        
        PageVO pageVO = 
            tPosicionNombradaDao.getTPosicionNombradaDivisionInternacional(params);
        
        assertNotNull(pageVO);
        assertNotNull(pageVO.getRegistros());
        assertTrue(!pageVO.getRegistros().isEmpty());
        
        log.debug("Registros en la pagina : [" + pageVO.getRegistros().size() + "]");
        UtilsTPosicionNombrada.logListaTPosicionNombrada(pageVO.getRegistros());
        
    }
    
}
