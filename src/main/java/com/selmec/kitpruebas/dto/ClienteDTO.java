/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author GEIDAR
 */
public class ClienteDTO implements java.io.Serializable {

    public int id;
    public String razonSocial;
    public Set ubicacioneses = new HashSet(0);

    public ClienteDTO() {
    }

}
