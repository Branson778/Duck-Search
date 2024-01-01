package org.jointheleague.level7.duck.service;
import org.springframework.stereotype.Service;
@Service
public class WeaService {

    public String getResults(String query, String $date){
        return "Searching for astronomical data related to the location " + query + " on the date "+ $date +".";
    }
}
