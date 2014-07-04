package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.modele.Geek;

@RestController
@Transactional
@RequestMapping("/api/afficheGeeksCritere")
public class GeeksCritereService {
	 @Autowired
     private GeekDao geekDao;
     
     @RequestMapping(method = GET)
     public List<Geek> afficheGeeks(@RequestParam long critere,@RequestParam long sexe){
             List<Geek> listeGeeks = geekDao.findCritere(critere,sexe);
             return listeGeeks;
     }
}
