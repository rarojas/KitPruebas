/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.controllers;

import com.selmec.kitpruebas.Models.Planta;
import com.selmec.kitpruebas.dto.PlantaDTO;
import com.selmec.kitpruebas.services.IPlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GEIDAR
 */
@Controller
@RequestMapping("api/Planta")
public class PlantaController extends BaseController<Planta, String, PlantaDTO> {

    @Autowired
    IPlantaService plantaService;

    public PlantaController() {
        this.setDTO(PlantaDTO.class);
        this.baseService = plantaService;
    }
}
