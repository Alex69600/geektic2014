package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.modele.Geek;

public class GeekDaoTest extends BaseDaoTest{
	
	@Autowired
	private GeekDao geekDAOTest;
	
	 	
	 	
	 	@Before
	    public void populateDatabase() {
	        Operation operation = Operations.sequenceOf(
	        		Operations.deleteAllFrom("GEEK"),
	        		Operations.insertInto("GEEK")
			          .columns("IDGEEK", "NOM", "PRENOM", "AGE", "COURRIEL", "NUMCENTREINTERET", "NUMSEXE")
			          .values(1L, "GAREL", "Lorraine", 22,"allo6@hotmail.com",4,2)
			          .build(),
			          Operations.insertInto("GEEK")
			          .columns("IDGEEK", "NOM", "PRENOM", "AGE", "COURRIEL", "NUMCENTREINTERET", "NUMSEXE")
			          .values(2 , "JAEGER", "Mickael",22 , "Allo2@hotmail.com",2,1)
			          .build(),
			          Operations.insertInto("GEEK")
			          .columns("IDGEEK", "NOM", "PRENOM", "AGE", "COURRIEL", "NUMCENTREINTERET", "NUMSEXE")
			          .values(3 ,"LANDRIEU", "Alexis",20 , "Allo3@hotmail.com",3,1)
			          .build()); // TODO define your operations here.
	        DbSetup dbSetup = new DbSetup(destination, operation);
	        dbSetup.launch();
	    }
	 
	    @Test
	    public void testFindById()
	    {
	    	Geek g1 = geekDAOTest.findById(1L);
			assertNotNull(g1);
	    }
	    
	    @Test
	    public void testFindById2()
	    {
			Geek g2 = geekDAOTest.findById(10L);
			assertNull(g2);
	    }
	    
	    @Test
	    public void testFindByAll()
	    {
			List<Geek> g2 = geekDAOTest.findByAll();
			assertEquals(3,g2.size());
	    }
	    
	    @Test
	    public void testFindCritere()
	    {
			List<Geek> g2 = geekDAOTest.findCritere("J2EE","HOMME");
			assertEquals(1,g2.size());
	    }
}
