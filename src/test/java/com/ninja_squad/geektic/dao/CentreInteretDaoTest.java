package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.modele.CentreInteret;
import com.ninja_squad.geektic.modele.Geek;

public class CentreInteretDaoTest extends BaseDaoTest{

	@Autowired
	private CentreInteretDao interetDAOTest;
	
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
		  CentreInteret c1 = interetDAOTest.findById(1L);
			assertNotNull(c1);
	    }
}
