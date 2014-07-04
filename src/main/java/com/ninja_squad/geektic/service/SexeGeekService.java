package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.modele.SexeGeek;
import com.ninja_squad.geektic.dao.SexeGeekDao;

@RestController
@Transactional
@RequestMapping("/api/afficheSexe")
public class SexeGeekService {
	@Autowired
    private SexeGeekDao SexeGeekDao;
    
    @RequestMapping(method = GET)
    public List<SexeGeek> afficheInterets(){
            List<SexeGeek> listeCentreInteret = SexeGeekDao.findByAll();
            return listeCentreInteret;
    }
}
