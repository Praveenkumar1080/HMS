//package com.cg.hms;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cg.hms.entities.Nurse;
//import com.cg.hms.exceptions.DuplicateEntryException;
//import com.cg.hms.exceptions.NoRecordsException;
//import com.cg.hms.services.NurseServiceImpl;
//
//@SpringBootTest
//class HmsApplicationTests {
//private NurseServiceImpl service;
//@Autowired
//public void setService(NurseServiceImpl service) {
//	this.service = service;
//}
//	@Test
//	void contextLoads() {
//		
//	}
//	@Test
//	void getAllNurses() {
//	assertDoesNotThrow(()->service.getallNurses());
//	}
//	@Test
//	void saveNurse() {
//		Nurse nurse = new Nurse(670,"sunaina","HeadNurse",true,120);
//		assertDoesNotThrow(()-> service.saveNurse(nurse));
//		
//	}
//	@Test
//	void nurseSaveException() {
//		Nurse nurse = new Nurse(670,"sunaina","HeadNurse",true,120);
//		assertThrows(DuplicateEntryException.class,()->{service.saveNurse(nurse);
//	});
//
//}
//}
