/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Clientes;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author GEIDAR
 */
public class ClientesService extends BaseServices<Clientes, Integer> implements IClientesService {

    @Autowired
    public void setDao(IGenericDao<Clientes, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Clientes.class);
    }
}
