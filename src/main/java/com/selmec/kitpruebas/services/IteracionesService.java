/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Iteraciones;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author GEIDAR
 */
public class IteracionesService extends BaseServices<Iteraciones, Integer> implements IIteracionesService {

    @Autowired
    public void setDao(IGenericDao<Iteraciones, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Iteraciones.class);
    }
}
