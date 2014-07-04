package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.CentreInteretDao;
import com.ninja_squad.geektic.modele.CentreInteret;

@RestController
@Transactional
@RequestMapping("/api/afficheCentreInteret")
public class CentreInteretService {
	@Autowired
    private CentreInteretDao CentreInteretDao;
    
    @RequestMapping(method = GET)
    public List<CentreInteret> afficheInterets(){
            List<CentreInteret> listeCentreInteret = CentreInteretDao.findByAll();
            return listeCentreInteret;
    }
}
