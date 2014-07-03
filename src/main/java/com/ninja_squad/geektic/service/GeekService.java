package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.modele.Geek;

@RestController
@Transactional
@RequestMapping("/afficheGeeks")
public class GeekService {
        @Autowired
        private GeekDao geekDao;
        
        @RequestMapping(method = GET)
        public List<Geek> afficheGeeks(){
                List<Geek> listeGeeks = geekDao.findByAll();
                return listeGeeks;
        }
}
