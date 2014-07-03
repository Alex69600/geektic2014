package com.ninja_squad.geektic.dao;

import org.junit.Before;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

public class ConsultationGeekDaoTest extends BaseDaoTest{

	 @Before
	    public void populateDatabase() {
	        Operation operation = Operations.sequenceOf(); // TODO define your operations here.
	        DbSetup dbSetup = new DbSetup(destination, operation);
	        dbSetup.launch();
	    }
}
