package com.poly.controller;

import com.poly.models.Societe;
import com.poly.models.Zone;

public class ZoneController {

    private Zone addZone(Zone zone){
        Societe societe = new Societe();
        zone.getCompanies().add(societe);
        return zone ;
    }
}
