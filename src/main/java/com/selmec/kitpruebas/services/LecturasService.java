/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Lecturas;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author GEIDAR
 */
public class LecturasService extends BaseServices<Lecturas, Integer> implements ILecturasService {

    @Autowired
    public void setDao(IGenericDao<Lecturas, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Lecturas.class);
    }
}
